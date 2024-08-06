package lab2;

import java.util.Scanner;

public class LabProgram4 {

	public static void main(String[] args) {
		// creating Scanner object
		Scanner sc = new Scanner(System.in);

		// declaration and initialization
		int a, b;

		// reading the order of the matrix 1
		System.out.println("what is the order of the matrix: ");
		a = sc.nextInt();
		b = sc.nextInt();

		// creating the array
		int[][] arr1 = new int[a][b];
		int[][] arr2 = new int[a][b];
		int[][] res = new int[a][b];

		// reading elements of array 1
		System.out.println("Enter elements of matrix 1: ");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print((i + 1) + ", " + (j + 1) + ": ");
				arr1[i][j] = sc.nextInt();
			}
		}

		// reading elements of array 2
		System.out.println("Enter elements of matrix 2: ");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print((i + 1) + ", " + (j + 1) + ": ");
				arr2[i][j] = sc.nextInt();
			}
		}

		// calculating sum
		System.out.println("The sum of the matrix is: ");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				res[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(res[i][j] + "   ");
			}
			System.out.println();
		}
	}

}