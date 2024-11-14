package com.curdrest.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curdrest.api.entity.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
