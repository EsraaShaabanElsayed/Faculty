package com.facilty.enrollment.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@RequiredArgsConstructor

@Document(collection = "enrollment")
public class Enrollment {
    @Id
    private String enrollmentId;

    private String courseId;

    private String userId;
    @NotEmpty
    private String courseName; // Include course details in the enrollment
    @NotEmpty
    private int creditHours;
    @NotEmpty
    private String courseDescription;

//    public Enrollment(String enrollmentId, String courseId, String userId, String courseName, int creditHours, String courseDescription) {
//        this.enrollmentId = enrollmentId;
//        this.courseId = courseId;
//        this.userId = userId;
//        this.courseName = courseName;
//        this.creditHours = creditHours;
//        this.courseDescription = courseDescription;
//    }

    // Getters and setters
//    public String getEnrollmentId() {
//        return enrollmentId;
//    }
//
//    public void setEnrollmentId(String enrollmentId) {
//        this.enrollmentId = enrollmentId;
//    }
//
//    public String getCourseId() {
//        return courseId;
//    }
//
//    public void setCourseId(String courseId) {
//        this.courseId = courseId;
//    }
//
//    public String getUserId() {
//        return userId;
//    }
//
//    public void setUserId(String userId) {
//        this.userId = userId;
//    }
//
//    public String getCourseName() {
//        return courseName;
//    }
//
//    public void setCourseName(String courseName) {
//        this.courseName = courseName;
//    }
//
//    public String getCourseDescription() {
//        return courseDescription;
//    }
//
//    public void setCourseDescription(String courseDescription) {
//        this.courseDescription = courseDescription;
//    }
//
//    public int getCreditHours() {
//        return creditHours;
//    }
//
//    public void setCreditHours(int creditHours) {
//        this.creditHours = creditHours;
//    }
}
