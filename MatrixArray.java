import java.util.Arrays;
import java.util.Scanner;

public class MatrixArray {
	public static void main(String[] args) {
		int m, n, i, j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Name:Abhishek Nimbalkar Rollno:1");
		System.out.println("Enter number of rows:");
		m = sc.nextInt();
		System.out.println("Enter number of cols:");
		n = sc.nextInt();

		System.out.println("First Matrix:");
		int a[][] = new int[m][n];
		System.out.println("Enter the elements of Array:");

		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				a[i][j] = sc.nextInt();
		System.out.println("Elements of Array are:");

		for (i = 0; i < m; i++) {
			for (j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Second Matrix:");
		int b[][] = new int[m][n];
		System.out.println("Enter the elements of Array:");

		for (i = 0; i < m; i++)
			for (j = 0; j < n; j++)
				b[i][j] = sc.nextInt();
		System.out.println("Elements of Array are:");

		for (i = 0; i < m; i++) {
			for (j = 0; j < m; j++) {
				System.out.print(a[i][j] + "");
			}
			System.out.println();
		}

		Scanner scan = new Scanner(System.in);
		int c[][] = new int[m][n];
		int choice;

		do {

			System.out.println("\n Choose the Matrix Operation");
			System.out.println("\n 1.Addition");
			System.out.println("\n 2.Multiplication");
			System.out.println("\n 3.Transpose of any Matrix");
			System.out.println("\n 4.Exit");
			System.out.println("\n Enter your Choice");

			choice = scan.nextInt();

			switch (choice) {
				case 1:
					c = add(a, b);
					System.out.println("Sum of Matrix:");
					System.out.println("Elements of Array are:");

					for (i = 0; i < m; i++) {
						for (j = 0; j < m; j++) {
							System.out.println(c[i][j] + "");
						}
						System.out.println();
					}
					break;
				case 2:
					c = multiply(a, b);
					System.out.println("Multiplication of Matrix:");
					System.out.println("Elements of Array are:");

					for (i = 0; i < m; i++) {
						for (j = 0; j < m; j++) {
							System.out.print(c[i][j] + "");
						}
						System.out.println();
					}
					break;
				case 3:
					c = transpose(a);
					System.out.println("Transpose of Matrix A is:");
					System.out.println("Elements of Array are:");

					for (i = 0; i < m; i++) {
						for (j = 0; j < m; j++) {
							System.out.print(c[i][j] + "");
						}
						System.out.println();
					}

					c = transpose(b);
					System.out.print("Transpose of Matrix B is:");

					System.out.print("Elements of Array are:");

					for (i = 0; i < m; i++) {
						for (j = 0; j < m; j++) {
							System.out.println(c[i][j] + "");
						}
						System.out.println();
					}
					break;
				case 4:
					System.out.println("Exit");
					return;
				default:
					System.out.println("Invalid input");
					System.out.println("Please enter the correct input");
			}
		} while (true);
	}

	public static int[][] add(int[][] a, int[][] b) {
		int row = a.length;
		int column = a[0].length;
		int sum[][] = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}

	public static int[][] multiply(int[][] a, int[][] b) {
		int row = a.length;
		int column = b[0].length;
		int product[][] = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				product[i][j] = 0;

				for (int k = 0; k < a[0].length; k++) {
					product[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return product;
	}

	public static int[][] transpose(int[][] a) {
		int row = a.length;
		int column = a[0].length;
		int temp[][] = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				temp[i][j] = a[j][i];
			}
		}
		return temp;
	}
}
