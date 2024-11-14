package com.curdrest.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curdrest.api.entity.Marks;


@Repository
public interface MarksRepository extends JpaRepository<Marks, Long>{
	
	List<Marks> findByStudent_StudentId(Long studentId);
    List<Marks> findByStudent_StudentIdAndSubject_SubjectId(Long studentId, Long subjectId);

}
