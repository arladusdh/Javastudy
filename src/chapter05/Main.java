package chapter05;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		String cmd = "";
		
		Scanner scan = new Scanner(System.in);
		
		Student[] std=null;
		
		int num = 0;
		
		while(true) {
			System.out.println("출석부 만들기 : 1");
			System.out.println("학생 입력하기 만들기 : 2");
			System.out.println("학생 정보 출력 : 3");
			System.out.println("종료 : exit");
			System.out.println("실행할 명령을 입력하세요");
			
			cmd = scan.nextLine();
			
			if(cmd.equals("1")) {
				
				System.out.println("학생수를 입력하세요.");
				int length = scan.nextInt();
				std = new Student[length];
				
			}
			else if(cmd.equals("2")) {
				
				if(std==null) {
					
					System.out.println("출석부를 먼저 생성하세요.");
					continue;
					
				}else if(num>=std.length) {
					System.out.println("출석부가 가득 찼습니다.");
					continue;
				}else {
				
					System.out.println("이름을 입력하세요.");
					String name = scan.nextLine();
					
					System.out.println("키를 입력하세요.");
					int height = scan.nextInt();
					
					System.out.println("몸무게를 입력하세요.");
					int weight = scan.nextInt();
					
					std[num] = new Student(++num,name,height,weight);
				}
			}
			else if(cmd.equals("3")) {
			if(std==null) {
					
					System.out.println("출석부를 먼저 생성하세요.");
					continue;
			}
				System.out.print("학생 번호를 입력하세요.");
				int index = scan.nextInt();
				System.out.println(std[index-1].toString());
				
			}
			else if(cmd.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				scan.close();
				break;
			} else {
				System.out.println("올바를 명령어를 입력하세요.");
			}
				
		}
	}
}
