interface living_beings {
    public void movement();

}

class human implements living_beings {
    public void movement() {
        System.out.println(" moves using 2 legs");

    }
}

class cow implements living_beings {
    public void movement() {
        System.out.println(" moves using 4 legs");
    }
}

public class Interface_1 {
    public static void main(String args[]) {
        human obj1 = new human();
        cow obj2 = new cow();
        obj1.movement();
        obj2.movement();
    }
}
