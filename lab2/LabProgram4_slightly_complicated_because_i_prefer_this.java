package lab2;

import java.util.Scanner;

public class LabProgram4_slightly_complicated_because_i_prefer_this {

	static int[][] accept(int a, int b, int[][] arr, Scanner sc) {
		System.out.println("Enter elements of matrix: ");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print((i + 1) + ", " + (j + 1) + ": ");
				arr[i][j] = sc.nextInt();
			}
		}

		return arr;
	}

	static int[][] add(int a, int b, int[][] arr1, int[][] arr2, int[][] res) {
		for (int i = 0; i < a; i++)
			for (int j = 0; j < b; j++)
				res[i][j] = arr1[i][j] + arr2[i][j];
		return res;
	}

	static void display(int a, int b, int[][] arr) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++)
				System.out.print(arr[i][j] + "   ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("what is the order of the matrix: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] arr1 = new int[a][b];
		int[][] arr2 = new int[a][b];
		int[][] res = new int[a][b];
		arr1 = accept(a, b, arr1, sc);
		arr2 = accept(a, b, arr2, sc);
		System.out.println("matrix 1: ");
		display(a, b, arr1);
		System.out.println("matrix 2: ");
		display(a, b, arr2);
		res = add(a, b, arr1, arr2, res);
		System.out.println("resultant addition matrix: ");
		display(a, b, res);
	}
}
