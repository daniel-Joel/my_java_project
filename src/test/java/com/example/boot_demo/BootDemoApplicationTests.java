package com.example.boot_demo;

import com.example.boot_demo.dao.Student;
import com.example.boot_demo.dao.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BootDemoApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

	@Test
	void test() {
//        List<Student> studentList = studentRepository.findByAgeBetween(18, 20);
//
//        List<Student> studentList2 = studentRepository.findByNameStartingWith("o");

        List<Student> studentList = studentRepository.findByEmail2("abcd@.com");
        System.out.println(studentList);
    }

}
