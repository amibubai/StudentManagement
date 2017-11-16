package org.studentapp.controoler;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studentapp.bean.Student;
import org.studentapp.config.BeanFactory;

public class MainClass {
		static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(BeanFactory.class);
		Student stu=(Student)context.getBean(Student.class);
		studentInfo(stu);
		
	}
	public static void studentInfo(Student stu) {
		System.out.println("Enter Student_Name:=>");
		String name=sc.next();
		System.out.println("Enter Student_Address:=>");
		String address=sc.next();
		System.out.println("Enter student_marks:=>");
		String marks=sc.next();
		stu.setStud_name(name);
		stu.setStud_address(address);
		stu.setStud_marks(marks);
		stu.getInfo();
		
	}

}
