package chapter03;

public class baeyul {
	public static void main(String[] abc) {
		
		//int형 데이터를 5개 담을 수있는 배열생성 = 5칸의 방에는 0이 저장되어 생성됨
		int intArr[] = new int[5];
		
		//int형 데이터 1,2,3,4,5를 담은 배열생성
		int[] intArr_2 = {1,2,3,4,5};
		
		//int형 데이터 6,7,8,9,10을 담은 배열생성
		int[] intArr_3 = new int[] {6,7,8,9,10};
		
		System.out.println(intArr[0]);
		System.out.println(intArr_2[0]);
		System.out.println(intArr_3[0]);
		
		for(int i = 0; i< intArr.length; i++) {
			System.out.print(intArr[i]);
			System.out.print("\t");
			System.out.print(intArr_2[i]);
			System.out.print("\t");
			System.out.print(intArr_3[i]);
			System.out.print("\t");
			System.out.println();
		}
		String[] name = {"오범수","김연오"};
			System.out.println(name[0]);
			System.out.println(name[1]);
			System.out.println(name[0].charAt(1));
	}
}
