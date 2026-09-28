package patterns;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3; int col=2;
		for(int i=0;i<row;i++) {
			for(int j=col;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print(k+1);
			}
			for(int l=1;l<=i;l++) {
				if(1>=i) {
				System.out.print(l);
				}else {
				System.out.print(l+1);
				}
			}
			
			System.out.println();
		}
	}

}
