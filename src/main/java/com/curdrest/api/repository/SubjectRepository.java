package com.curdrest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curdrest.api.entity.Student;
import com.curdrest.api.entity.Subject;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
