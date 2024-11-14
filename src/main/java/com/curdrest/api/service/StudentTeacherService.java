package com.curdrest.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdrest.api.repository.StudentTeacherRepository;

@Service
public class StudentTeacherService {

    @Autowired
    private StudentTeacherRepository studentTeacherRepository;

    public long getNumberOfStudentsForTeacher(Long teacherId) {
        return studentTeacherRepository.countByTeacher_TeacherId(teacherId);
    }
}
