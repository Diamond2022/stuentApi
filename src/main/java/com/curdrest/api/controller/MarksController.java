package com.curdrest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curdrest.api.entity.Marks;
import com.curdrest.api.service.MarksService;

@RestController
@RequestMapping("/api")
public class MarksController {

    @Autowired
    private MarksService marksService;

    @GetMapping("/marks/student/{studentId}")
    public ResponseEntity<List<Marks>> getMarksForStudent(@PathVariable Long studentId) {
        return ResponseEntity.ok(marksService.getMarksForStudent(studentId));
    }
}

