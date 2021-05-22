package chapter02;

public class Loop {

	public static void main(String[] abc) { 
	/** 반복문
	 * 1. for
	 * 2. while
	 * 3. do{} while()
	 * 
	 */
	
	//1.for문
		
	int i = 0;
	for(i=0;i<100;i++) {
		//변수 i는 for문 안에서만 존재함
		System.out.println(i);
	}
	//변수 i는 for문 안에서만 존재함
	System.out.println(i);
	//2. while문
		while(i>0)

		{
			System.out.println(i);
			i--;
		}
		do {
			
		}while(i>0); 
	}
}

