package opps;

public class Method {
	
	public int add(int a,int b) {
		int c =a+b;
//		System.out.println(ans);
		return c;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method obj = new Method();
		int ans=obj.add(4,5);
		System.out.println(ans);
	}

}
