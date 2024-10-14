package com.accionLabls.Assignment.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.accionLabls.Assignment.Entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {

	 @Query("SELECT s FROM Student s JOIN s.marks m WHERE s.name = :name")
	    Student findByName(@Param("name") String name);
	
	 @Query("SELECT s FROM Student s JOIN s.marks m WHERE m.subject = :subject AND m.marksObtained >= :percentage * m.totalMarks / 100")
	    List<Student> findStudentsBySubjectAndPercentage(@Param("subject") String subject, @Param("percentage") Integer percentage);
}
