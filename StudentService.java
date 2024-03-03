package com.restApi.StudentManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
@Service
public class StudentService {
    StudentRepository studentRepository;
    @Autowired
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public Optional<Student> getStudentById(Integer studentId) {
        return studentRepository.findById(studentId);
    }
    public List<Student> getAllStudents(){

        return studentRepository.findAll();
    }

    public String newStudent(Student student){
        studentRepository.save(student);
        return "Success";
    }

    public String updateStudent(Student student){
        studentRepository.save(student);
        return "success";
    }

    public String deleteStudentById(Integer studentId){
        studentRepository.deleteById(studentId);
        return "Success";
    }
}
