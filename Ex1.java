package opps;

public class Ex1 {
	static String name;
	static float salary;
	
	
	static void set(String n,float s) {
		name = n;
		salary= s;
//		System.out.println(n+" "+s);
	
	}
	static void get() {
		System.out.println("get name:"+name);
		System.out.println("get salary:"+salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		class & objects one simple program
//		Ex1 obj = new Ex1();
		Ex1.set("jega",50.000f);
		Ex1.get();
		
	}

}
