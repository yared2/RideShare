package model;

public class User 
{
	private int id;
	private String username;
	private String password;
	private String phone;
	private String firstname;
	private String lastname;
	private String role;
	
	
	public User(int id, String username, String password, String phone, String firstname, String lastname,String role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.firstname = firstname;
		this.lastname = lastname;
		this.role = role;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}
	
	
	
	
	
	
	

}
