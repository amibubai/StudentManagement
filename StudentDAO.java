package org.studentapp.bean;

public class StudentDAO {
	public static int count=0;
	private int stu_id;
	private String stud_name;
	private String stud_address;
	private String stud_marks;
	public int getStu_id() {
		return stu_id;
	}
	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getStud_address() {
		return stud_address;
	}
	public void setStud_address(String stud_address) {
		this.stud_address = stud_address;
	}
	public String getStud_marks() {
		return stud_marks;
	}
	public void setStud_marks(String stud_marks) {
		this.stud_marks = stud_marks;
	}
	

}
