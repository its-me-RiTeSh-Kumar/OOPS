/* super keyword is basically a keyword use to call the funtion of the parent class which is just the previours one . (parent<-- inheritented--- child class)the methods. */
/*>>1
class Animals {
    String colour = "white";
}

class Dog extends Animals {
    String colour = "black";

    void printColor() {
        System.out.println("Colour of the dog is " + colour);
        System.out.println("Colour of the dog is " + super.colour);// using super keyword .
    }
}

public class Super_keyword_inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
*/
class animal {
    animal() {
        System.out.println(" Animal is Created");

    }
}

class dog extends animal {
    dog() {
        super();
        System.out.println(" Dog is Created");

    }
}

public class Super_keyword_inheritance {
    public static void main(String args[]) {
        dog d = new dog();

    }
}