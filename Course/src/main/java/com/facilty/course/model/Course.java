package com.facilty.course.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor

@Document(collection = "course")
public class Course {
    @Id
    private String id;
    @NotEmpty
    private String name;
    private  int creditHours;
    private String description;
	
//    public Course( String id, String name, int creditHours, String description) {
//        this.id = id;
//        this.name = name;
//        this.creditHours = creditHours;
//        this.description = description;
//    }
}
