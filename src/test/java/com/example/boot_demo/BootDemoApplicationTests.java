package com.example.boot_demo;

import com.example.boot_demo.dao.Student;
import com.example.boot_demo.dao.StudentRepository;
import com.example.boot_demo.dto.StudentDTO;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jdk.swing.interop.SwingInterOpUtils;
import org.hibernate.collection.spi.PersistentList;
import org.jspecify.annotations.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class BootDemoApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

	@Test
	void test() {
//        StudentDTO studentDTO = StudentDTO.builder().minAge(0).maxAge(50).build();
//        Specification specification = (root, query, cb) -> {
//            List<Predicate> predicatList = new ArrayList<>();
//            if(studentDTO.getName() != null){
//                predicatList.add(cb.equal(root.get("name"), studentDTO.getName()));
//            }
//            if(studentDTO.getMinAge() != 0){
//                predicatList.add(cb.greaterThanOrEqualTo(root.get("age"),studentDTO.getMinAge()));
//            }
//            if(studentDTO.getMaxAge() != 0){
//                predicatList.add(cb.lessThanOrEqualTo(root.get("age"),studentDTO.getMaxAge()));
//            }
//            return query.where(predicatList.toArray(new Predicate[0])).getRestriction();
//        };
//
//        PageRequest pageRequest = PageRequest.of(2,3);
//        List<Student> studentList = studentRepository.findAll(specification, Sort.by("age"));
//        System.out.println(studentList.size());

//        Page<Student> studentList = studentRepository.findAll(specification,pageRequest);
//        List<Student> studentList = studentRepository.findByAgeBetween(18, 20);
//
//        List<Student> studentList2 = studentRepository.findByNameStartingWith("o");

        List<Student> studentList = studentRepository.findByEmail2("abcd@.com");
        System.out.println(studentList);
    }

}
