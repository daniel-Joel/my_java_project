package com.example.boot_demo.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonPropertyOrder({"id", "name", "email"})
public class StudentDTO {
    private Long id;

    @NotBlank(message = "学生姓名不能为空")
    private  String name;

    @Email(message = "邮箱格式错误")
    private String email;

    @NotBlank(message = "学生地址不能为空")
    private String address;
}
