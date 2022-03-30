import java.util.Scanner;

abstract class Staff {
    protected int id;
    protected String name;

    Staff() {
        id = 0;
        name = null;
    }

    Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    String department;

    public void accept() {
        System.out.print("\nEnter id, name, department : ");
        Scanner sc = new Scanner(System.in);
        id = sc.nextInt();
        name = sc.next();
        department = sc.next();

    }

    public void display() {
        System.out.print("\n\nDetails are : ");
        System.out.print("\nId is : " + id);
        System.out.print("\nName is : " + name);
        System.out.print("\nDepartment is : " + department);
    }

    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Name-Abhishek Nimbalkar, Roll No-1\n");
        System.out.print("\nEnter office staff number : ");
        int n = sc.nextInt();
        OfficeStaff[] I = new OfficeStaff[n];
        for (i = 0; i < n; i++) {
            I[i] = new OfficeStaff();
            I[i].accept();
        }
        for (i = 0; i < n; i++)
            I[i].display();
    }
}
