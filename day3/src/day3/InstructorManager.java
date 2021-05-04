package day3;

public class InstructorManager extends UserManager {

	public void createCourse(Instructor instructor) {
		System.out.println("Instructor: "+instructor.getFirstName()+
				" "+instructor.getLastName()+" "+instructor.getCreatedCourse()+
				" created.");
	}
}
