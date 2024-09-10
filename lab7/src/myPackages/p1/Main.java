package myPackages.p1;

public class Main {
	public static void main(String[] args) {
		System.out.println("\nDemonstrating the working of [largest of three int numbers]: "); 
		int max = Maximum.max(30, 10, 20);
		System.out.println("The largest among 30, 10, 20 is: " + max);
		
		double max2 = Maximum.max(30.26, 10.55, 30.22);
		System.out.println("\nDemonstrating the working of [largest of three int numbers]: "); 
		System.out.println("The largest among 30.26, 10.55, 30.22 is: " 
				+ max2 );
		
		max =  Maximum.max(new int[] {30, 10, 20});
		System.out.println("\nDemonstrating the working of [largest of three int numbers]: "); 
		System.out.println("The largest among {30, 10, 20} is: " 
				+ max);
		
		max = Maximum.max(new int[][] {{30, 10, 20}, {40, 50, 10}} );
		System.out.println("\nDemonstrating the working of [largest of three int numbers]: "); 
		System.out.println("The largest among {{30, 10, 20}, {40, 50, 10}} is: " 
				+ max);
	}
}
