package day04;

public class TestEmpSort {
	private String name;
	private String age;
	private String sex;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "TestEmpSort [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getSex()=" + getSex() + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
