package main;
 
public class Student {

	private String name;
	private int age;
	private int kor;
	private int eng;
	private int math;
	
	public void setName(String name, int age, int kor, int eng, int math) {
		this.name = name;
		this.age = age;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}

	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String toString() {
		return "student [name=" + name + ", age=" + age + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
}