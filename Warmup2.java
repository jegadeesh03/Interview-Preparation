package Introduction;

public class Warmup2 {
	
	public int last2(String str) {
		  int count =0;
		  for(int i=0;i<str.length()-2;i+=2){
			  
		    if(str.substring(0,2).equals(str.substring(i,i+2))){
		      count++;
		    }
		    
		  }
		  System.out.println(count);
	
		  return count;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Warmup2 a = new Warmup2();
		a.last2("xaxxaxaxx");
		
	}
}
