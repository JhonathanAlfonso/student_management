package com.salajhon69.student_management;

import com.salajhon69.student_management.entity.Student;
import com.salajhon69.student_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {

//        Student student1 = new Student("Juan", "Perez", "email1@email.com");
//        studentRepository.save(student1);
//
//        Student student2 = new Student("Diego", "Lopez", "email2@email.com");
//        studentRepository.save(student2);
//
//        Student student3 = new Student("Cristian", "Peña", "email3@email.com");
//        studentRepository.save(student3);
    }
}
