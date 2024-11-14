package com.curdrest.api.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "student")

public class Student {
    
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long studentId;

	    private String firstName;
	    private String lastName;

	    @ManyToOne
	    @JoinColumn(name = "groupid")
	    private Group group;

		
	    
	    // Getters and Setters
    
   
}
