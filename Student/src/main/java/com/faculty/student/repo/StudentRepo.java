package com.faculty.student.repo;

import com.faculty.student.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo  extends MongoRepository<Student, String> {

}
