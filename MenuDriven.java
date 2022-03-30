
import java.util.Scanner;

public class MenuDriven {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Name - Abhishek Nimbalkar, Roll No- 1");
		while (true) {
			System.out.println("1.volume of Cylinder\n2.Factorial\n.3.Armstrong\n4.Exit\n");
			System.out.println("Enter your choice\n");
			int choice = s1.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter height");
					int h = s1.nextInt();
					System.out.println("enter radius");
					int r = s1.nextInt();
					System.out.println("Volume of Cylinder is " + 3.14 * r * r * h);
					break;
				case 2:
					System.out.println("Enter the number: ");
					int num = s1.nextInt();
					int f = 1;
					for (int i = 1; i <= num; i++) {
						f = f * i;
					}
					System.out.println("Factorial of no: " + f);
					break;
				case 3:

					System.out.println("Enter Your number");
					int arm = 0;
					int a = s1.nextInt();
					int b = a;
					while (a > 0) {
						r = a % 10;
						arm = (r * r * r) + arm;
						a = a / 10;
					}
					if (b == arm) {
						System.out.println("Number is Armstrong");
					} else {
						System.out.println("number is not Armstrong ");
					}
					break;

				case 4:
					System.exit(0);
			}
		}
	}
}
