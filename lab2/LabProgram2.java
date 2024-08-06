package lab2;

import java.util.Scanner;

public class LabProgram2 {
	public static void main(String args[]) {
		// creating an object of Scanner Class
		Scanner sc = new Scanner(System.in);

		// reading the length of the array from the user
		System.out.println("Size of array: ");
		int n = sc.nextInt();

		// creating an array of size n
		int[] a = new int[n];

		// reading the elements of the array from the user
		for (int i = 0; i < n; i++) {
			a[i] = (i + 1);
		}

		for (int i : a) {
			System.out.print(i + ", ");
		}
	}
}
