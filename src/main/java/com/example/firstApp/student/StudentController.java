package com.example.firstApp.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/student")
public class StudentController {

    @Autowired
//   StudentService studentService;
StudentRepository studentRepository;
    @RequestMapping("/")
    public String welcome(){
        return "<a href='localhost:8080/all'>all students </a><br>";
    }

//    @RequestMapping("/error")
//    public ResponseEntity<String> error(){
//        return new ResponseEntity<>(HttpStatus.FORBIDDEN);
//    }
//
//    @Override
//    public String getErrorPath() {
//        return "/error";
//    }

    @RequestMapping(value = "/all")
    public List<Student> all(){
//        return studentService.findAll();
    return studentRepository.findAll();
    }

    @RequestMapping("find")
    public Student f(@RequestParam String name){
        return studentRepository.findByName(name);
    }

    @RequestMapping("find/{name}")
    public Student find(@PathVariable String name){
       return studentRepository.findByName(name);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/create")
    public void add(@ModelAttribute Student student){
//        studentService.save(student);

        studentRepository.save(student);
    }

}
