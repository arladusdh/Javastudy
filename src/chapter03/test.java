package chapter03;

public class test {
	public static void main(String[] abc) {
		
		for(int j=1;j<10;j++) {
			for(int i=9;i>0;i--) {
				System.out.print(i + "x" + j + "=" + i*j + "\t");
			}
			System.out.println();
		}
	}
}
