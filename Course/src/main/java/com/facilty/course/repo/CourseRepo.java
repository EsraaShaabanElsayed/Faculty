package com.facilty.course.repo;

import com.facilty.course.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo  extends MongoRepository<Course, String> {

}
