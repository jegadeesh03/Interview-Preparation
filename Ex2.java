package opps;

public class Ex2 {
		String name;
		String breed;
		int age;
		String color;
		public Ex2(String n,String b,int a,String c) {
			this.name=n;
			this.age=a;
			this.breed=b;
			this.color=c;
		}
		public String getName() {
			return  name;
		}
		public String getBreed() {
			return breed;
		}public int getAge() {
			return age;
		}
		public String getColor() {
			return color;
		}
		public String toString() {
			return this.name+" "+this.age+" "+this.breed+" "+this.color;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 obj = new Ex2("tom","male",4,"brown");
		
		System.out.println(obj.toString());
	}

}
