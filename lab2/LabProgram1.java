package lab2;

/**
 * WAP that creates an array of integers and then uses a for loop to reverse the order of the elements in the array
 */

import java.util.Scanner;

public class LabProgram1 {

	public static void main(String[] args) {
		// creating an object of Scanner Class
		Scanner sc = new Scanner(System.in);

		// reading the length of the array from the user
		System.out.println("No of values: ");
		int n = sc.nextInt();

		// creating an array of size n
		int[] a = new int[n];

		// reading the elements of the array from the user
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + ". ");
			a[i] = sc.nextInt();
		}

		// displaying before reversing
		System.out.print("The entered array is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ", ");
		}

		// reversing the array
		for (int i = 0; i < n / 2; i++) {
			int j = n - i - 1;
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

		// displaying before reversing
		System.out.print("\nThe reversed array is: ");
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + ", ");
		}

	}

}
