interface a {
    public void run();
}

interface b {
    public void run();

}

class C implements a, b {
    public void run() {
        System.out.println("C class run method");
    }
}

public class multiple_Inheriteance_use_interface {
    public static void main(String[] args) {
        C obj = new C();
        obj.run();
    }

}
