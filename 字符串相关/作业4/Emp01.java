package ื๗าต4;
/**
 * 
 * @author wangxin
 *
 */
public class Emp01 {
	private String name;
	private int age;
	private char gender;
	private int salary;
	public Emp01(String name,int age,char gender,int salary){
		
	}
	public Emp01() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp01 [name=" + name + ", age=" + age + ", gender=" + gender
				+ ", salary=" + salary + "]";
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
