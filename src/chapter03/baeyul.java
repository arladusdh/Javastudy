package chapter03;

public class baeyul {
	public static void main(String[] abc) {
		
		//int�� �����͸� 5�� ���� ���ִ� �迭���� = 5ĭ�� �濡�� 0�� ����Ǿ� ������
		int intArr[] = new int[5];
		
		//int�� ������ 1,2,3,4,5�� ���� �迭����
		int[] intArr_2 = {1,2,3,4,5};
		
		//int�� ������ 6,7,8,9,10�� ���� �迭����
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
		String[] name = {"������","�迬��"};
			System.out.println(name[0]);
			System.out.println(name[1]);
			System.out.println(name[0].charAt(1));
	}
}
