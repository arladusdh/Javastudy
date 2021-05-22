package chapter04;

public class class1 {
	public static void main(String[] args) {
		//객체 지향
		Student student = new Student();
		
		System.out.println(student.name);
		System.out.println(student.height);
		System.out.println(student.weight);
		
	}
}

class Student{
	
	int num = 1;
	String name = "오범수";
	int height = 177;
	int weight = 85;

	//기본생성자 = 파라미터가 없는 생성자
	//생성자가 하나도 없으면 JVM은 기본생성자를 자동으로 생성
	//파라미터가 있는 생성자가 하나라도 있으면
	//JVM은 기본생성자를 자동으로 만들어주지 않는다
	
	//생성자 특징
	//리턴타입이 없고 클래스명과 같은이름의 함수(메소드)
	//함수는 이름뒤에 괄호가 있음
public Student() {}
public Student(int num) {
	this.num=num;
}
}
class Student_2 {
	
	final int num;
	final String name;
	final int height;
	final int weight;
	
	public Student_2(int num,String name,int height,int weight) {
		
		this.num=num;
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
}
