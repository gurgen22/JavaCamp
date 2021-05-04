package day3;

public class UserManager {
	
	public void Login(User user) {
		System.out.println(user.getFirstName()+ " logined.");
	}
	
	public void Logout(User user) {
		System.out.println(user.getFirstName()+" logouted.");
	}

}
