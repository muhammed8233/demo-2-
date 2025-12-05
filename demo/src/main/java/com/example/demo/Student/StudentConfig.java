package com.example.demo.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args-> {
          Student Mariam =  new Student(
                    "maryam",
                  LocalDate.of(2000, Month.JULY,21),
                  "maryam@gmail.com"
            );

            Student musa =  new Student(
                    "musa",
                    LocalDate.of(2002, Month.JULY,2),
                    "musa342@gmail.com"
            );

            Student habiba =  new Student(
                    "habiba",
                    LocalDate.of(2006, Month.MARCH,2),
                    "HABIBA42@gmail.com"

            );

            Student fauziyat = new Student(
                    "fauziyat",
                    LocalDate.of(2005, Month.OCTOBER, 6),
                    "FauziyatAbdulsalam@gmail.com"
            );
            repository.saveAll(
                    List.of(Mariam, musa, habiba, fauziyat)
            );
        };
    }
}
