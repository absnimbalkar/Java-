import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

class EmailId {
    String username, password;

    EmailId() {
        username = "ABC";
        password = "vrushali";
    }

    EmailId(String user, String pass) {
        username = user;
        password = pass;
    }

    public static void main(String[] args) {
        String user, pass;
        int p = -1, up = -1, u = -1;
        System.out.println("Name- Abhishek Nimbalkar, Roll No.-1");
        EmailId obj = new EmailId();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username");
        user = sc.nextLine();
        System.out.println("\nEnter password");
        pass = sc.nextLine();
        EmailId obj1 = new EmailId(user, pass);
        if ((obj.username).equals(obj1.username)) {
            u = 1;
            if (obj.password.equals(obj1.password)) {
                up = 1;
            } else {
                p = 0;
            }
        } else {
            u = 0;
        }
        if (u == 0) {
            try {
                throw new InvalidUsernameException(user);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        if (p == 0) {
            try {
                throw new InvalidPasswordException(pass);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class InvalidUsernameException extends Exception {
    String num1;

    InvalidUsernameException(String num2) {
        num1 = num2;
        System.out.println("Invalid Username ");
    }

public String toString()
{
return ("exception in thread 'main' InvalidUsernameException: Username:
"+ num1 + " doesnt match") ;
}
}

class InvalidPasswordException extends Exception {
    String num1;

    InvalidPasswordException(String num2) {
        num1 = num2;
        System.out.println("Invalid Password");
    }

    public String toString() {
        return ("exception in thread main InvalidPasswordException: Username: " +
                num1 + " doesnt match");
    }
}