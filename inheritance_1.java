class Parent {
    void display() {
        System.out.print(" parent class");
    }

}

class child extends Parent {
    void show() {
        System.out.print(" child class ");
    }
}

public class inheritance_1 {
    public static void main(String[] args) {
        child c1 = new child();
        c1.display();
        System.out.print("-->");
        c1.show();
    }
}
