package com.curdrest.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.curdrest.api.entity.Group;
import com.curdrest.api.entity.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
    @Query("SELECT COUNT(s) FROM Student s WHERE s.group = ?1")
    Long countStudentsByGroup(Group group);

	Optional<Teacher> findById(Long teacherId);
}

