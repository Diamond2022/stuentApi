package com.curdrest.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curdrest.api.entity.Marks;
import com.curdrest.api.repository.MarksRepository;

@Service
public class MarksService {
	
	@Autowired
    private MarksRepository marksRepository;

    public List<Marks> getMarksForStudent(Long studentId) {
        return marksRepository.findByStudent_StudentId(studentId);
    }

}
