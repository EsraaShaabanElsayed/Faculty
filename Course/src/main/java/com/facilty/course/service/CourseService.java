package com.facilty.course.service;

import com.facilty.course.model.Course;
import com.facilty.course.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public final class CourseService {
    @Autowired
    private CourseRepo courseRepo;

    public Course findById(String id) {
        return courseRepo.findById(id).get();
    }

    public List<Course> findAll() {

        return courseRepo.findAll();
    }

    public Course insertCourse(Course course) {
        if (course.getId() != null) {
            throw new RuntimeException();
        }
        return courseRepo.insert(course);
    }

    public Course updateCourse(Course course) {
        Course course1 = findById(course.getId());
        course1.setName(course.getName());
        course1.setCreditHours(course.getCreditHours());
        course1.setDescription(course.getDescription());

        return courseRepo.save(course1);
    }

    public void deleteCourse(String id) {
        courseRepo.deleteById(id);

    }

}
