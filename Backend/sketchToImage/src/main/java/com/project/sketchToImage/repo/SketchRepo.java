package com.project.sketchToImage.repo;

import com.project.sketchToImage.model.Sketch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SketchRepo extends JpaRepository<Sketch, Integer> {



}
