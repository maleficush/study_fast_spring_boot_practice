package com.fast.demo.service;

import com.fast.demo.domain.Student;
import com.fast.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@RequiredArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public void printStudent(String name){
        Student student = studentRepository.getStudent(name);
        System.out.println("찾는학생 : " + student);
    }

    // 이 클래스의 빈 주입이 완료되었을 경우 호출
    @PostConstruct
    public void init(){
        studentRepository.enroll("jack", 15, Student.Grade.B);
    }
}
