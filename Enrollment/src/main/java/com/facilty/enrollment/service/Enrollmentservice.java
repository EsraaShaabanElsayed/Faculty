package com.facilty.enrollment.service;

import com.facilty.enrollment.model.Enrollment;
import com.facilty.enrollment.repo.EnrollementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Enrollmentservice {
    @Autowired
    private EnrollementRepo enrollementRepo;

    public Enrollment findById(String id) {

        return enrollementRepo.findById(id).get();
    }
    public List<Enrollment> findAll() {

        return enrollementRepo.findAll();
    }
    public Enrollment insertEnrollment(Enrollment enrollment) {
        if (enrollment.getEnrollmentId() != null) {
            throw new RuntimeException();
        }
        return enrollementRepo.insert(enrollment);
    }
    public Enrollment updateEnrollment(Enrollment enrollment) {
        Enrollment enrollment1 = findById(enrollment.getEnrollmentId());
        return enrollementRepo.save(enrollment1);
    }
    public void deleteEnrollment(String id) {
        enrollementRepo.deleteById(id);

    }

}
