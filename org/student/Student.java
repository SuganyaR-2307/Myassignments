package org.student;
import org.department.*;

public class Student extends Department {
	public void studentName()
	{
		String name="Suganya R";
		System.out.println("StudentName: "+name);
	}
	public void studentDept()
	{
		System.out.println("Student Department Name: Computer Science");
	}
	public void studentId()
	{
		String id="CMP121";
		System.out.println("Student Id: "+id);
	}
	public static void main(String[] args) {
		Student stud=new Student();
		System.out.println("College Detail");
		System.out.println("College Code: "+stud.collegeCode());
		stud.collegeName();
		System.out.println("College Rank: "+stud.collegeRank());
		System.out.println("Department Detail");
		stud.departmentName();
		
		System.out.println("Student Detail");
		stud.studentId();
		stud.studentName();
		stud.studentDept();
		
	}

}
