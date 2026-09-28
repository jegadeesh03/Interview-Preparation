package patterns;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =3; int col =2;
		for(int i=0;i<row;i++) {
			for(int j=col;j>i;j--) {
				System.out.print("@");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
				
			System.out.println();
		}
	}

}
