package com.example.jpa_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student added successfully";
    }
    public Student getStudent(int rollNo){
        Optional<Student> student=studentRepository.findById(rollNo);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }

    public String deleteStudent(int rollNo) {
        studentRepository.deleteById(rollNo);
        return "Student deleted";
    }

}
