import java.util.Scanner;

class vehicle {
    double price;
    double miledge;
    String colour;

    Scanner sc = new Scanner(System.in);

    void display() {
        System.out.print("Enter price:");
        double price = sc.nextDouble();

        System.out.print("Enter miledge:");
        double miledge = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter colour :");
        String colour = sc.nextLine();

        System.out.println("price  " + price);
        System.out.println(" miledge " + miledge);
        System.out.println(" color " + colour);

    }
}

class car extends vehicle {
    String ftype;
    boolean sunroof;
    String brand;

    void show() {
        System.out.print("Enter Fuel type:");
        String ftype = sc.nextLine();

        System.out.print("Sunroof available (true/false): ");
        boolean sunroof = sc.nextBoolean();
        sc.nextLine();

        System.out.print("Enter brand :");
        String brand = sc.nextLine();

        System.out.println("FUEL TYPE" + ftype);
        System.out.println("SUNROOF is there" + sunroof);
        System.out.println("NAME OF THE BRAND" + brand);

    }
}

public class inheritance_2 {
    public static void main(String[] args) {
        car c1 = new car();
        c1.display();
        c1.show();

    }
}
