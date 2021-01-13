package gettersetterexample;

public class TestGetterSetter {

	public static void main(String[] args) {
		User user = new User();
		user.setUserid(101);
		user.setUsername("quest");
		user.setUserAddress("Trivandrum");
		user.setUserpin(1234);
		System.out.println("User id: " + user.getUserid());
		System.out.println("User name: " + user.getUsername());
		System.out.println("User address: " + user.getUserAddress());
		System.out.println("User id: " + user.getUserpin());

	}

}
