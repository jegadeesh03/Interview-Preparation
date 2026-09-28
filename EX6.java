package patterns;

public class EX6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row =3; int col =3;
		for(int i=0;i<row;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(col);
			}
			col--;
			System.out.println();
		}
		
	}

}
