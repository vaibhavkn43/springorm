package com.spring.orm.dao;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.spring.orm.entities.Student;

@Transactional
public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;

	public StudentDao() {
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	//save or insert 
	public int insert(Student student)
	{
	Integer i=	(Integer) this.hibernateTemplate.save(student);
		return i;
	}
	//get the single data
	
	public Student getStudent(int studentId)
	{
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//get multiple data
	
	public List<Student> getAllStudents()
	{
		List<Student> students = this.hibernateTemplate.loadAll(Student.class);
		return students;
		
	}
	//deletig the data
	@Transactional
	public void deleteStudent(int studentId)
	{
	Student student=	this.hibernateTemplate.get(Student.class, studentId);
	this.hibernateTemplate.delete(student);
	}
	//updating data
	@Transactional
	public void updateStudent(Student student)
	{
	this.hibernateTemplate.update(student);
	}
	
}
