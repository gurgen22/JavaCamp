package day3;

public class Student extends User{
	
	private String currentCourseName;
	
	public Student() {
		
	}

	public Student(String currentCourseName) {
		//super();
		this.currentCourseName = currentCourseName;
	}

	public String getCurrentCourseName() {
		return currentCourseName;
	}

	public void setCurrentCourseName(String currentCourseName) {
		this.currentCourseName = currentCourseName;
	}
	
	
	
	
	

}
