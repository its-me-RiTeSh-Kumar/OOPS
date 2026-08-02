import java.util.*;

public class Main {
    static void main_menu() {
        System.out.println();
        System.out.println("== ** Welcome to Showroom Management System ** ==");
        System.out.println();
        System.out.println("1].Add Showrooms \t 2].Add Employee \t 3].Add cars");
        System.out.println();
        System.out.println("4].Get Showroom \t 5].Get Employee \t 3].Add Cars");
        System.out.println();
        System.out.println("=== *** Enter your Choice *** ===");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom showroom[] = new Showroom[5];
        Employees employee[] = new Employees[5];
        Car car[] = new Car[5];
        int car_counter = 0, showroom_counter = 0, employee_counter = 0, choice = 100;
        while (choice != 0) {
            main_menu();
            choice = sc.nextInt();
            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println(" ");
                        System.out.println("1]. Add New Showroom");
                        System.out.println("9].Go to Main Menu");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employee[employee_counter] = new Employees();
                        employee[employee_counter].set_details();
                        employee_counter++; // Missing
                        System.out.println(" ");
                        System.out.println("2]. Add New Employee");
                        System.out.println("9].Go to Main Menu");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new Car();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println(" ");
                        System.out.println("3]. Add New Car");
                        System.out.println("9].Go to Main Menu");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();

                        System.out.println("9].Go to Main Menu");
                        System.out.println("0].Exit");

                        choice = sc.nextInt();
                        break;
                    case 5:

                        for (int i = 0; i < employee_counter; i++) {
                            employee[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();

                        System.out.println("9].Go to Main Menu");
                        System.out.println("0].Exit");

                        choice = sc.nextInt();
                        break;
                    case 6:

                        for (int i = 0; i < car_counter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();

                        System.out.println("9].Go to Main Menu");
                        System.out.println("0].Exit");

                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("Enter Valid Choice");
                        break;
                }
            }

        }

    }
}
