package patterns;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r =3; int c =3;
		for(int i=r;i>0;i--){
			for(int j=c;j>=i;j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
