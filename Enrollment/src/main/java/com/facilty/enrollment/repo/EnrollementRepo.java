package com.facilty.enrollment.repo;

import com.facilty.enrollment.model.Enrollment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollementRepo  extends MongoRepository<Enrollment,String> {
}
