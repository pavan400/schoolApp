package com.smitiv.schoolapp.dao;

import java.io.Serializable;

import com.smitiv.schoolapp.entity.StudentEntity;

public interface IStudentDAO {

	Serializable saveStudent(StudentEntity entity);

}
