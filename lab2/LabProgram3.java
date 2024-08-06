package lab2;

import java.util.Scanner;

public class LabProgram3 {
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
			System.out.print((i + 1) + ". ");
			a[i] = sc.nextInt();
		}

		for (int i : a) {
			boolean isPrime = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)
				System.out.print(i + ", ");
		}
	}
}
