package com.accionLabls.Assignment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accionLabls.Assignment.Entity.Student;
import com.accionLabls.Assignment.Repository.StudentRepository;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    public Student getReportCard(String name) {
        return studentRepository.findByName(name);
    }
    
    public List<Student> getAwardedStudents(String subject, Integer percentage) {
        return studentRepository.findStudentsBySubjectAndPercentage(subject, percentage);
    }
}