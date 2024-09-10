package myPackages.p1;

public class Maximum {
	// method to find the maximum among three integers
	public static int max(int a, int b, int c) {
		int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
        
        return largest;
	}
	
	// method to find the maximum among three floating numbers
	public static double max(double a, double b, double c) {
		double largest;
		if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }
		
		return largest;
	}
	public static int max(int[] matrix) {
		// declaration and initialization 
		int largest = matrix[0]; 
		for(int number : matrix) {
			if(number > largest) {
				largest = number;
			}
		}
		return largest;
	}
	public static int max(int[][] matrix) {
		int largest = matrix[0][0];
		for(int i = 0; i < matrix.length; i++) {
			for(int number: matrix[i]) {
				if(number > largest) {
					largest = number;
				}
			}
		}
		return largest;
	}
}
