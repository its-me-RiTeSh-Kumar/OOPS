import java.util.Scanner;
import java.util.UUID;

public class Employees extends Showroom implements utility {
    String emp_id, emp_name, emp_department;
    int emp_age;

    @Override
    public void get_details() {
        System.out.println("ID:" + emp_id);
        System.out.println("Name:" + emp_name);
        System.out.println("Age:" + emp_age);
        System.out.println("Department:" + emp_department);
        System.out.println("Showroom Name :" + Showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);
        System.out.println("====== **** Enter Employee Details **** ======");
        System.out.println();
        System.out.print("Employee Name:");
        emp_name = sc.nextLine();
        System.out.print("Employee age:");
        emp_age = sc.nextInt();
        sc.nextLine();
        System.out.print("Employee department Name :");
        emp_department = sc.nextLine();
        System.out.print("Showroom Name:");
        Showroom_name = sc.nextLine();

    }
}
