package org.studentapp.bean;

public class Student {
	private String stud_name;
	private String stud_address;
	private String stud_marks;
	public String getStud_address() {
		return stud_address;
	}

	public void setStud_address(String stud_address) {
		this.stud_address = stud_address;
	}

	

	public String getStud_name() {
		return stud_name;
	}

	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}

	public String getStud_marks() {
		return stud_marks;
	}

	public void setStud_marks(String stud_marks) {
		this.stud_marks = stud_marks;
	}

	public void getInfo() {
		System.out.println("StudentName:=>" + getStud_name()+"\nStudentAddress=>"+getStud_address()+"\nStudentMarks=>"+getStud_marks());
	}

}
