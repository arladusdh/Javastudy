package chapter04;

public class class1 {
	public static void main(String[] args) {
		//��ü ����
		Student student = new Student();
		
		System.out.println(student.name);
		System.out.println(student.height);
		System.out.println(student.weight);
		
	}
}

class Student{
	
	int num = 1;
	String name = "������";
	int height = 177;
	int weight = 85;

	//�⺻������ = �Ķ���Ͱ� ���� ������
	//�����ڰ� �ϳ��� ������ JVM�� �⺻�����ڸ� �ڵ����� ����
	//�Ķ���Ͱ� �ִ� �����ڰ� �ϳ��� ������
	//JVM�� �⺻�����ڸ� �ڵ����� ��������� �ʴ´�
	
	//������ Ư¡
	//����Ÿ���� ���� Ŭ������� �����̸��� �Լ�(�޼ҵ�)
	//�Լ��� �̸��ڿ� ��ȣ�� ����
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
