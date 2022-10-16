package com.example.demo.student.api;

import com.example.demo.student.entities.Student;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("management/api/v1/students")
public class ManagementStudentController {

    private static final List<Student> STUDENTS = Arrays.asList(
            new Student(1,"Lilia"),
            new Student(2,"Anna"),
            new Student(3,"Badr")
    );

    @GetMapping
    public List<Student> getAllStudents(){
        return STUDENTS;
    }
    @PostMapping
    public void registerStudent(@RequestBody Student student){
        System.out.println(student);
    }
    @PutMapping(path = "{studentId}")
    public void updateStudent(@RequestBody Student student,@PathVariable Integer studentId){
        System.out.println();
    }
    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer studentId,@RequestBody Student student){
        System.out.println(String.format("%s %s",studentId, student));
    }

}
