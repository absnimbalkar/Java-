import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name:Abhishek Nimbalkar Rollno.1");
		System.out.println("How many elements to be stored");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter" + n + "integer values");

		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Array in Reverse order is");

		for (int i = n - 1; i >= 0; i--)
			System.out.println(arr[i] + "");
	}
}
