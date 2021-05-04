package day3;

public class Main {

	public static void main(String[] args) {
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		UserManager userManager = new UserManager();
		
		User user1 = new User(1,"Kemal","Gurgen","12345","kemal@gurgen.com");
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Derin");
		user2.setLastName("Demirog");
		user2.setPassword("1223");
		user2.setEmail("engin@demirog.com");
		
		System.out.println(user1.getFirstName());
		System.out.println(user2.getFirstName());
		
		Instructor instructor1 = new Instructor();
		instructor1.setCreatedCourse("Java Kursu");
		instructor1.setFirstName("Engin");
		
		Instructor instructor2 = new Instructor();
		instructor2.setCreatedCourse("C# Kursu");
		instructor2.setFirstName("Engin");
		
		System.out.println("Instructor: "+instructor1.getFirstName()+" Created Course: "+instructor1.getCreatedCourse());
		System.out.println("Instructor: "+instructor2.getFirstName()+" Created Course: "+instructor2.getCreatedCourse());
		
		Student student1 = new Student();
		student1.setFirstName("Kemal");
		
		instructorManager.Login(instructor1);
		instructorManager.Logout(instructor1);
		
		userManager.Login(user2);
		userManager.Logout(user2);
		
		studentManager.Login(student1);
		studentManager.Logout(student1);
		
		
		
		
		
		

	}

}
