package com.restApi.StudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentAPIController {

    StudentService studentService;
    @Autowired
    public StudentAPIController(StudentService studentService){
        this.studentService = studentService;
    }
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("{studentId}")
    public Student getStudentById(@PathVariable("studentId") Integer studentId){
        return studentService.getStudentById(studentId).get();
    }

    @PostMapping
    public String newStudent(@RequestBody Student student){
        return studentService.newStudent(student);
    }
    @PutMapping
    public String updateStudent(@RequestBody Student student){

        return studentService.updateStudent(student);
    }
    @DeleteMapping("{studentId}")
    public String deleteStudentById(@PathVariable("studentId") Integer studentId){
        return studentService.deleteStudentById(studentId);
    }
}
