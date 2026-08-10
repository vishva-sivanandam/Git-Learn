package com.springprojects.classproject.service;

import com.springprojects.classproject.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    List<Student> students = new ArrayList<>(Arrays.asList(new Student(1,"Vishva","Java"),
    new Student(2,"Kamal","Python"),
    new Student(3,"Ram","JavaScript")
    ));

    public List<Student> getStudentDetails() {
        return students;
    }

    public Student getStudentRollNo(int roll) {
        return students.get(roll);
    }

    public void addStudentDetails(Student student) {
        students.add(student);
    }

    public Student deleteDetails(int rollNO) {
        return students.remove(rollNO);
    }
}
