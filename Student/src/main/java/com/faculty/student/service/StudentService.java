package com.faculty.student.service;

import com.faculty.student.repo.StudentRepo;
import com.faculty.student.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
   public Student findById(String id) {

       return studentRepo.findById(id).get();
   }

     public List<Student> findAll() {

       return studentRepo.findAll();
    }
    public Student insertStudent(Student student) {
        if (student.getId() != null) {
            throw new RuntimeException();
        }
        return studentRepo.insert(student);
    }
    public Student updateStudent(Student student) {
        Student student1= findById(student.getId());
        student1.setName(student.getName());
        student1.setEmail(student.getEmail());
        student1.setPassword(student.getPassword());

        return studentRepo.save(student1);
    }
    public void deleteStudent(String id) {
        studentRepo.deleteById(id);

    }
}
