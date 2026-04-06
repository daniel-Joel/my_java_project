package com.example.boot_demo.controller;

import com.example.boot_demo.dao.Student;
import com.example.boot_demo.dto.StudentDTO;
import com.example.boot_demo.service.StudentService;
import com.example.boot_demo.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public Response<StudentDTO> getStudentById(@PathVariable long id){
        return Response.newSuccess(studentService.getStudentById(id));
    }

    @PostMapping("/student")
    public Response<Student> addNewStudent(@Validated @RequestBody StudentDTO studentDTO){
        return Response.newSuccess(studentService.addNewStudent(studentDTO));
    }

    @DeleteMapping("/student/{id}")
    public Response<String> deleteStudentById(@PathVariable long id){
        return Response.newSuccess(studentService.deleteStudentById(id));
    }

    @PutMapping("/student/{id}")
    public Response<StudentDTO> updateStudentById(@PathVariable long id,
                                                  @RequestParam(required = false) String name,
                                                  @RequestParam(required = false) String email){
        return Response.newSuccess(studentService.updateStudentById(id,name,email));
    }
}
