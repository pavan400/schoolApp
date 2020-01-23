package com.smitiv.schoolapp.dao;

import java.io.Serializable;
import java.util.List;

import com.smitiv.schoolapp.entity.StudentEntity;

public interface IStudentDAO {

	Serializable saveStudent(StudentEntity entity);

	List<StudentEntity> getAllStudents();

}
