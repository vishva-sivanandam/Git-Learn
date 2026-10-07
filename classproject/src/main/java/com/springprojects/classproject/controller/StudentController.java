package com.springprojects.classproject.controller;

import com.springprojects.classproject.model.Student;
import com.springprojects.classproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students")
    public List<Student>  getAllStudent(){
        return studentService.getStudentDetails();
    }
    @GetMapping("student/{rollNo}")
    public Student getStudent(@PathVariable("rollNo") int roll){
        return studentService.getStudentRollNo(roll);
    }
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
         studentService.addStudentDetails(student);
         return "Success";
    }
    @DeleteMapping("  {rollNo}")
    public String deleteStudent(@PathVariable int rollNO){
         studentService.deleteDetails(rollNO);
         return "SucessFully Delete";
    }

}
