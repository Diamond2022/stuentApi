package com.curdrest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curdrest.api.service.TeacherService;

@RestController
@RequestMapping("/api")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teachers/students/{teacherId}/count")
    public ResponseEntity<Long> getNumberOfStudentsForTeacher(@PathVariable Long teacherId) {
        return ResponseEntity.ok(teacherService.countStudentsForTeacher(teacherId));
    }
}