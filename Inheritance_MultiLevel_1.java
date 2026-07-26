import java.util.Scanner;

class info10th {
    Scanner sc = new Scanner(System.in);

    void getInfoOf10th() {

        System.out.println("info for 10th Standard");
        System.out.println(" Enter School Name");
        String School10thName = sc.nextLine();
        System.out.print(" Enter marks in percentage");
        double M1 = sc.nextDouble();
        sc.nextLine();

        System.out.print(
                "School Name is " + School10thName + " and the marked scored in 10th board is  " + M1 + "Percentage");
    }
}

class info12th extends info10th {

    void getInfoOf12th() {
        System.out.println("info for 12th Standard");

        System.out.println(" Enter School Name");
        String School12thName = sc.nextLine();
        System.out.print("Enter marks in percentage: ");
        double M2 = sc.nextDouble();
        sc.nextLine();
        System.out.print(
                "School Name is " + School12thName + " and the marked scored in 12th board is  " + M2 + "Percentage");
    }
}

class infoCollage extends info12th {

    void getInfoCollage() {
        System.out.print("Enter College Name : ");
        String collageName = sc.nextLine();

        System.out.print("Enter Branch : ");
        String branch = sc.nextLine();
        System.out.print("Enter CGPA : ");
        double M3 = sc.nextDouble();
        sc.nextLine();

        System.out.print("College Name is " + collageName + "and the branch in which he/she is " + branch
                + " and the marks scored in College is  " + M3 + "CGPA");
    }
}

public class Inheritance_MultiLevel_1 {
    public static void main(String[] args) {
        infoCollage obj1 = new infoCollage();
        obj1.getInfoOf10th();

        System.out.print(" ");
        obj1.getInfoOf12th();

        System.out.print(" ");
        obj1.getInfoCollage();
        System.out.print(" ");

    }
}
