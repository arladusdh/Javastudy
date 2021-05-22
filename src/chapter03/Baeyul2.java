package chapter03;

public class Baeyul2 {
	public static void main(String[] abc) {
		
		int[][] intArr = new int[3][3];
		for(int i = 0; i<intArr.length;i++) {
			for(int j = 0; j<intArr[i].length;j++) {
				System.out.println(intArr[i][j]);
			}
		}
		int [][][] intArr2 = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};
		
		for(int i = 0; i<intArr2.length;i++) {
			for(int j = 0; j<intArr2[i].length;j++) {
				for(int k = 0; k <intArr2[i][j].length;k++) {
					System.out.print(intArr2[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}
}
