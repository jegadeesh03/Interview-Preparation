package patterns;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3;int col=3;
		for(int i=row;i>0;i--) {
			for(int j=col;j>0;j--) {
				System.out.print(i);
			}
			col--;
			System.out.println();
		}

	}

}
