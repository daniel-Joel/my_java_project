package com.example.boot_demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>, JpaSpecificationExecutor<Student> {
    List<Student> findByEmail(String email);

//    List<Student> findByAgeBetween(int min, int max);

    List<Student> findByAgeBetween(int minAge, int maxAge);

    List<Student> findByNameStartingWith(String namePrefix);

    @Query("select stu from Student stu where email = :email")
    List<Student> findByEmail2(@Param("email") String email);
}
