package patterns;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int column =5;
		for(int i=0;i<row;i++) {
			for(int j=column;j>i;j--) {
				System.out.print((row+1)-j);
			}
			System.out.print("*");
			System.out.println();
		
		}
	}

}
