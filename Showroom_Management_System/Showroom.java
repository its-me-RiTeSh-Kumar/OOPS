import java.util.*;

public class Showroom implements utility {
    String Showroom_name, Showroom_address, manager_name;
    int Total_employees, Total_cars_in_stock = 0;

    @Override
    public void get_details() {
        System.out.println("Showroom Name:" + Showroom_name);
        System.out.println("Showroom Add :" + Showroom_address);
        System.out.println("Manager Name:" + manager_name);
        System.out.println("Total Employees:" + Total_employees);
        System.out.println("Total car in Stock: " + Total_cars_in_stock);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===*** Enter Showroom Details ***===");
        System.out.println();
        System.out.print("Showroom Name:");
        Showroom_name = sc.nextLine();
        System.out.print("Showroom address:");
        Showroom_address = sc.nextLine();
        System.out.print("Manager Name:");
        manager_name = sc.nextLine();
        System.out.print("Total Number of Employees:");
        Total_employees = sc.nextInt();
        System.out.print("Total Number of cars_in_stock:");
        Total_cars_in_stock = sc.nextInt();
    }
}
