package com.facilty.teacher.repo;

import com.facilty.teacher.model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends MongoRepository<Teacher,String> {
}
