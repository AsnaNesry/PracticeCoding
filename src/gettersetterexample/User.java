package gettersetterexample;

public class User {
	private int userid;
	private String username;
	private String userAddress;
	private int userpin;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public int getUserpin() {
		return userpin;
	}

	public void setUserpin(int userpin) {
		this.userpin = userpin;
	}

}
