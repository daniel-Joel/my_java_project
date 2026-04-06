package com.example.boot_demo.converter;

import com.example.boot_demo.dao.Student;
import com.example.boot_demo.dto.StudentDTO;

public class StudentConverter {
    public  static StudentDTO convertStudent(Student student){
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setAddress(student.getAddress());
        return studentDTO;
    }

    public  static Student convertStudent(StudentDTO studentDTO){
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        student.setAddress(studentDTO.getAddress());
        return student;
    }
}
