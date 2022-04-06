package com.company.Exersice5;

import java.util.ArrayList;

public class Course{
	private ArrayList<String> students;
	private int numberOfStudents;
	
	Course(){
		this.students = new ArrayList<String>();
	}

	ArrayList<String> getStudents(){
		return this.students;
	}

	void addStudent(String student){
		this.students.add(student);
	}

	String dropStudent(){
		numberOfStudents = students.size();
		return students.remove(numberOfStudents-1);
	}

	void clear(){
		students.clear();
	}

	boolean isEmpty(){
		return students.isEmpty();
	}
}