import java.util.Scanner;

class Continent {
    String continent;

    void accept_continent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the name of continent : ");
        continent = sc.next();
    }
}

class Country extends Continent {
    String country;

    void accept_country() {
        accept_continent();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the name of country : ");
        country = sc.next();
    }
}

class state extends Country {
    String state;

    void accept_state() {
        accept_country();
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the name of state : ");
        state = sc.next();
    }

    public static void main(String[] args) {
        System.out.println("Name-Abhishek Nimbalkar, Roll No-1\n");
        state s = new state();
        s.accept_state();
        System.out.print("\nName of the continent is : " + s.continent);
        System.out.print("\nName of the country is : " + s.country);
        System.out.print("\nName of the state is : " + s.state);
    }
}
