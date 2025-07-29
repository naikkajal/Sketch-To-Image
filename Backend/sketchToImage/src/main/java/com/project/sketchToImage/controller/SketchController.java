package com.project.sketchToImage.controller;


import com.project.sketchToImage.model.Sketch;
import com.project.sketchToImage.service.SketchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
public class SketchController {

    @Autowired
    private SketchService sketchService;


    // GET: Retrieve all sketches
    @GetMapping("/sketch")
    public List<Sketch> getAllSketches() {
        return sketchService.getAllSketches();
    }

    // POST: Add new sketch to DB
    @PostMapping("/sketch")
    public Sketch saveSketch(@RequestBody Sketch sketch) {
        return sketchService.saveSketch(sketch);
    }

    @GetMapping("/sketch/{deptId}")
    public Sketch getSketchById(@PathVariable int deptId) {
        return sketchService.getSketchById(deptId);
    }
}
