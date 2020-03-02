package entity;

public class user {
	private String name;
	private int age;
	private String getName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGetName() {
		return getName;
	}
	public void setGetName(String getName) {
		this.getName = getName;
	}
	public user(String name, int age, String getName) {
		super();
		this.name = name;
		this.age = age;
		this.getName = getName;
	}
	public user() {
		super();
	}
	
}
