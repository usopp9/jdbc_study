package kr.or.dgit.jdb_study.dao;

import java.util.List;

import kr.or.dgit.jdb_study.dto.Student;

public interface StudentDao {
	Student findStudentById(int studId);
	void insertStudent(Student student);
	void deleteStudent(Student studId);
	List<Student> findAllStudents();
}
