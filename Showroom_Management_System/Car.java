import java.util.*;

public class Car extends Showroom implements utility {
    String car_name, car_color, car_fuel_type, car_type, car_transmission;
    int car_price;

    @Override
    public void get_details() {
        System.out.println("Name:" + car_name);
        System.out.println("Color:" + car_color);
        System.out.println("FuelType:" + car_fuel_type);
        System.out.println("Price:" + car_price);
        System.out.println("CarType:" + car_type);
        System.out.println("Transmission:" + car_transmission);

    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== *** Enter car Details *** ===");
        System.out.println();
        System.out.println("Car Name :");
        car_name = sc.nextLine();
        System.out.println("Car Color:");
        car_color = sc.nextLine();
        System.out.println("Car Fuel Type(petrol,diesel,battery(or) electric");
        car_fuel_type = sc.nextLine();
        System.out.println("Price of the car ");
        car_price = sc.nextInt();
        sc.nextLine();
        System.out.println("Car Type (Sydan/suv/hatchback):");
        car_type = sc.nextLine();
        System.out.println("Transmmision Type (Auto/Manual)");
        car_transmission = sc.nextLine();
        Total_cars_in_stock++;
    }

}
