import java.util.Scanner;

class schoolName {
    Scanner sc = new Scanner(System.in);
    String NameSchool = sc.nextLine();

    void getinfo() {
        System.out.println(" School Name is  " + NameSchool);
    }
}

class nameOfStudent extends schoolName {
    String Name = sc.nextLine();

    void getName() {
        System.out.println("and the student name is " + Name);

    }
}

public class Inheritance_single {
    public static void main(String[] args) {
        nameOfStudent obj1 = new nameOfStudent();
        obj1.getinfo();
        obj1.getName();

    }
}