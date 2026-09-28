package opps;


	
	class Fruit {
		 
	    // Method inside super class
	    public Fruit() {
	 
	        // Print statement
	        System.out.println("Super class constructor");
	 
	        // Displaying object hashcode of super class
	        System.out.println("Super class object hashcode :" +
	                           this.hashCode());
	 
	        System.out.println(this.getClass().getName()+" "+super.getClass().getName());
	    }
	}
	 
	// Class 2
	// Sub class extending above super class
	class Apple extends Fruit {
	 
	    // Method inside sub class
	    public Apple() {
	 
	        // Print statement
	        System.out.println("Subclass constructor invoked");
	 
	        // Displaying object hashcode of sub class
	        System.out.println("Sub class object hashcode :" +
	                           this.hashCode());
	 
	        System.out.println(this.hashCode() + " " +
	                           super.hashCode());
	 
	        System.out.println(this.getClass().getName() + " " +
	                           super.getClass().getName());
	    }
	}
	public class Inherit1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit myApple = new Fruit();
	}

}
