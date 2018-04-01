package com.example.firstApp.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;


    public List<Student> findAll() {

        List<Student> ans = new ArrayList<>();
        studentRepository.findAll().forEach(ans::add);
        return ans;
    }

    public void save(Student student) {
        studentRepository.save(student);
    }
}
