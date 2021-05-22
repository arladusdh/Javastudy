package chapter05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String cmd = "";
		
		Scanner scan = new Scanner(System.in);
		
		Student[] std=null;
		
		int num = 0;
		
		while(true) {
			System.out.println("�⼮�� ����� : 1");
			System.out.println("�л� �Է��ϱ� ����� : 2");
			System.out.println("�л� ���� ��� : 3");
			System.out.println("���� : exit");
			System.out.println("������ ����� �Է��ϼ���");
			
			cmd = scan.nextLine();
			
			if(cmd.equals("1")) {
				
				System.out.println("�л����� �Է��ϼ���.");
				int length = scan.nextInt();
				std = new Student[length];
				
			}
			else if(cmd.equals("2")) {
				
				if(std==null) {
					
					System.out.println("�⼮�θ� ���� �����ϼ���.");
					continue;
					
				}else if(num>=std.length) {
					System.out.println("�⼮�ΰ� ���� á���ϴ�.");
					continue;
				}else {
				
					System.out.println("�̸��� �Է��ϼ���.");
					String name = scan.nextLine();
					
					System.out.println("Ű�� �Է��ϼ���.");
					int height = scan.nextInt();
					
					System.out.println("�����Ը� �Է��ϼ���.");
					int weight = scan.nextInt();
					
					std[num] = new Student(++num,name,height,weight);
				}
			}
			else if(cmd.equals("3")) {
			if(std==null) {
					
					System.out.println("�⼮�θ� ���� �����ϼ���.");
					continue;
			}
				System.out.print("�л� ��ȣ�� �Է��ϼ���.");
				int index = scan.nextInt();
				System.out.println(std[index-1].toString());
				
			}
			else if(cmd.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				scan.close();
				break;
			} else {
				System.out.println("�ùٸ� ��ɾ �Է��ϼ���.");
			}
				
		}
	}
}
