import java.util.Scanner;

interface Operation {
    float PI = 3.14f;

    public float area();

    public float volume();
}

class Cylinder implements Operation {
    float radius;
    float height;

    Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    public float area() {
        return ((2 * PI * radius * height) + (2 * PI * radius * radius));
    }

    public float volume() {
        return PI * radius * radius * height;
    }

    public static void main(String args[]) {
        Operation s;
        System.out.println("Name-Abhishek Nimbalkar, Roll No-1\n");
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter radius");
        float r = s1.nextFloat();
        System.out.println("Enter height");
        float h = s1.nextFloat();
        s = new Cylinder(r, h);
        System.out.print("\nArea of Cylinder : " + s.area() + "\nVolume of Cylinder is : " + s.volume());
    }
}
