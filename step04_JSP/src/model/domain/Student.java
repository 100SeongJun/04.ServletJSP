package model.domain;

public class Student {
	private String name;
	private int age;

	public Student() {
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

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

	@Override
	public String toString() {
//		StringBuilder builder = new StringBuilder();
//		builder.append("Studnet [name=");
//		builder.append(name);
//		return builder;
		return "Student [name=" + name + ", age=" + age + "]";
	}

}