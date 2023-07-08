package com.example.jpa_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);

    }
    @GetMapping("/getStudent")
    public Student getStudent(@RequestParam("rollNo") int rollNo){
        return studentService.getStudent(rollNo);
        //if(student==null)
    }
    // delete a student by roll no
    @DeleteMapping("/deleteStudent")
    public String deleteStudent(@RequestParam("rollNo") int rollNo){
        return studentService.deleteStudent(rollNo);
    }

    // update the age of a student based on roll no -> rollNo and age as input


    // find all the student who have age greater than 25


    // delete all the students

    // find all the student with a given name

}
