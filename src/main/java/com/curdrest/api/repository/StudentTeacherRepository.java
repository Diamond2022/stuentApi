package com.curdrest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curdrest.api.entity.StudentTeacher;

public interface StudentTeacherRepository extends JpaRepository<StudentTeacher, Long> {
    long countByTeacher_TeacherId(Long teacherId);
}