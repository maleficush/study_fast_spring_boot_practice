package com.fast.demo.domain;

import lombok.ToString;
import lombok.Value;

//@Value
public record Student(
        String name,
        Integer age,
        Grade grade
) {
    public enum Grade {
        A, B, C, D, E
    }
}
