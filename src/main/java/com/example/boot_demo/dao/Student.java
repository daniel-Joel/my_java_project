package com.example.boot_demo.dao;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonPropertyOrder({"id", "name", "email"})
public class Student {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name="name")
    private  String name;

    @Column(name="email")
    private String email;

    @Column(name="age")
    private Integer age;

    @Column(name="address")
    private String address;

//    @Column(name = "gender")
//    @Convert(converter=GenderConverter.class)
//    private  Gender gender;
}
