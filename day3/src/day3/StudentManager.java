package day3;

public class StudentManager extends UserManager{
	
	public void selectCourse(Student student) {
		
		System.out.println("Student: "+student.getFirstName()+" "+student.getLastName()+" "+
				student.getCurrentCourseName()+" selected");
	}

}
