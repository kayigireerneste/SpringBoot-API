package com.example.demo.Student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> GetStudents() {
        return List.of(
                new Student(
                        1L,
                        "Kayode the Kay",
                        "kayode.kay@gmail.com",
                        LocalDate.of(2000, Month.MARCH, 20),
                        21

                )
        );
    }
}
