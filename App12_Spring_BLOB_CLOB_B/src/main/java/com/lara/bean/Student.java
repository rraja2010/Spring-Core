package com.lara.bean;

import java.util.Arrays;

public class Student {
	private int age;
	private String name;
	private int id;
	private byte[] image;
	private String description;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", id=" + id + ", image=" + Arrays.toString(image)
				+ ", description=" + description + "]";
	}

}
