package com.project.sketchToImage.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Sketch {
    
    
    //ALL REQUIRED FIELDS
    @Id
    private int deptId;
    private String deptName;
    private String deptDivision;
    private String deptHOD;
}
