package chapter03;

public class Baeyul3 {
	public static void main(String[] abc) {
		
		int[][] intArr = {{1,2,3,14,5},{6,7,8,9,10}};
		
		for(int i = 0; i<intArr.length;i++) {
			for(int j =0;j<intArr[i].length;j++) {
				
			if(intArr[i][j] == 14) {
				System.out.print(i + "," + j);
			}
			}
		}
	}
}
