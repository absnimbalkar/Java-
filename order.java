
import java.util.Scanner;

abstract class order {
    int id;
    String description;

    abstract void accept();

}

class purchase_order extends order {
    String customer_name;
    Scanner sc = new Scanner(System.in);

    void accept() {

        System.out.println("enter id: ");
        id = sc.nextInt();
        System.out.println("enter description: ");
        description = sc.next();
        System.out.println("enter customer name: ");
        customer_name = sc.next();
    }

    void display() {

        System.out.println("id: " + id + "   description: " + description + "  customer name: " + customer_name);

    }

}

class sales_order extends order {
    String vendor_name;
    Scanner sc = new Scanner(System.in);

    void accept() {
        System.out.println("enter id: ");
        id = sc.nextInt();
        System.out.println("enter description: ");
        description = sc.next();
        System.out.println("enter vendor name: ");
        vendor_name = sc.next();
    }

    void display() {
        System.out.println("id: " + id + "  description: " + description + "  customer name: " + vendor_name);
    }
}

class simple {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Name-Abhishek Nimbalkar, Roll No-1\n");
        purchase_order[] p = new purchase_order[3];
        sales_order[] s = new sales_order[3];
        System.out.println("Enter Purchase orders");
        for (i = 0; i <= 2; i++) {
            p[i] = new purchase_order();
            p[i].accept();
        }

        System.out.println("Enter Sales orders");
        for (i = 0; i <= 2; i++) {
            s[i] = new sales_order();
            s[i].accept();
        }
        System.out.println("Purchase orders");
        for (i = 0; i <= 2; i++) {

            p[i].display();
        }
        System.out.println("Sales orders");
        for (i = 0; i <= 2; i++) {
            s[i].display();

        }
    }
}
