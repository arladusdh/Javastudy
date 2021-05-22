package chapter05;

public class Student {
	public int num;
	public String name;
	public int weight;
	public int height;
	
	public Student(int num,String name,int weight,int height) {
		this.num = num;
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	public String toString() {
		return num+" 번 학생 / 이름 :" + name + " / 키 :" +height+" / 몸무게" +weight;
	
	}
}
