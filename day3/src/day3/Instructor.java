package day3;

public class Instructor extends User {
	
	private String createdCourse;
	
	
	public Instructor() {	
	}
		
	public Instructor(String createdCourse) {
		//super();
		this.createdCourse = createdCourse;
	}

	public String getCreatedCourse() {
		return createdCourse;
	}

	public void setCreatedCourse(String createdCourse) {
		this.createdCourse = createdCourse;
	}


	

	
	
	
}
