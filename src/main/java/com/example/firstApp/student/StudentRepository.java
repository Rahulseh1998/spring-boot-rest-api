package com.example.firstApp.student;

import com.example.firstApp.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface StudentRepository extends JpaRepository<Student,Long>{

    Student findByName(String name);

}
