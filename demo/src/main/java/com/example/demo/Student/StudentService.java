package com.example.demo.Student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudent() {
        return List.of(
                new Student(18,
                        "yusuf",
                        1L,
                        "yusuf87@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 4)
                )
        );
    }
}
