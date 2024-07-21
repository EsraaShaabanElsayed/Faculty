package com.facilty.teacher.service;

import com.facilty.teacher.model.Teacher;
import com.facilty.teacher.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepo teacherRepo;

    public Teacher findById(String id) {

        return teacherRepo.findById(id).get();
    }
    public List<Teacher> findAll() {

        return teacherRepo.findAll();
    }
    public Teacher insertTeacher(Teacher teacher) {
        if (teacher.getId() != null) {
            throw new RuntimeException();
        }
        return teacherRepo.insert(teacher);
    }
 public Teacher updateTeacher(Teacher teacher) {
        Teacher teacher1 = findById(teacher.getId());
        teacher1.setName(teacher.getName());
        teacher1.setEmail(teacher.getEmail());
        teacher1.setPassword(teacher.getPassword());

        return teacherRepo.save(teacher1);
 }
 public void deleteTeacher(String id) {
     teacherRepo.deleteById(id);

 }

}
