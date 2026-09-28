package opps;

public class MethodCalling {
	public static int num=0;
	MethodCalling(){
		num++;
	}
	public static int m3() {
		return num;
	}
	public int m1() {
		m2();
		return num;
	}
	public void m2() {
		System.out.println("method one is calling m2");
	}
	
	public static void main(String[] args) {
		MethodCalling obj =new MethodCalling();	
		int ans1 =obj.m1();
		System.out.println(ans1);
		int ans2=MethodCalling.m3();
		System.out.println(ans2);
		
	}
	
	
}
