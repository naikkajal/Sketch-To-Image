package com.project.sketchToImage.service;


import com.project.sketchToImage.model.Sketch;
import com.project.sketchToImage.repo.SketchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SketchService {

    @Autowired
    private SketchRepo sketchRepo;

    // Save a sketch to the DB
    public Sketch saveSketch(Sketch sketch) {
        return sketchRepo.save(sketch);
    }


    // Get all sketches
    public List<Sketch> getAllSketches() {
        return sketchRepo.findAll();
    }


    public Sketch getSketchById(int deptId) {

            return sketchRepo.findById(deptId)
                    .orElseThrow(() -> new RuntimeException("Sketch not found with deptId: " + deptId));
        }


    }

