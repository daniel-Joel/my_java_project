package com.example.boot_demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentQueryDTO {
    private String name;

    private Integer minAge;

    private Integer maxAge;
}
