package com.curdrest.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdrest.api.entity.Teacher;
import com.curdrest.api.repository.TeacherRepository;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public Long countStudentsForTeacher(Long teacherId) {
        Optional<Teacher> teacher = teacherRepository.findById(teacherId);
        return teacher.map(t -> teacherRepository.countStudentsByGroup(t.getGroup())).orElse(0L);
    }
}

