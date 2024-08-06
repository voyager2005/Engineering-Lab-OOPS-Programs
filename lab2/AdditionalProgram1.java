package lab2;

import java.util.Scanner;

public class AdditionalProgram1 {
	public static void main(String[] args) {
		// declaration and initialization
		int n, key, position = 0;
		boolean found = false;

		// creating Scanner object
		Scanner sc = new Scanner(System.in);

		// reading the array length from the user
		System.out.println("No. of elements in the array: ");
		n = sc.nextInt();

		// creating the array
		int[] arr = new int[n];

		// reading the array elements from the user
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + ". ");
			arr[i] = sc.nextInt();
		}

		// reading the key from the user
		System.out.print("Enter the value to be searched:  ");
		key = sc.nextInt();

		// linear search algorithm
		for (int i = 0; i < n; i++) {
			if (arr[i] == key) {
				found = true;
				position = i + 1;
				break;
			}
		}

		// display statement
		if (found)
			System.out.print(key + " found at position " + position);
		else
			System.out.print(key + " not found");

	}

}
