package patterns;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=3; int col =2; int e=2; 
		for(int a=row;a>0;a--) {
			for(int b=a;b<=col;b++) {
				System.out.print("@");
			}for(int c=1;c<=a;c++) {
				System.out.print(c);
				}
			for(int d=e;d>=1;d--) {
				System.out.print(d);
			}
			e--;
			System.out.println();
			}
			
			
		}
			
	}


