package com.cg.bean;

public class User {

	private String name;
	private int age;
	private long contact;
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public User(String name, int age, long contact) {
		super();
		this.name = name;
		this.age = age;
		this.contact = contact;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", contact=" + contact
				+ "]";
	}
	
	
}
