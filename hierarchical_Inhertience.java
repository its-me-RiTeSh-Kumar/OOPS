/*
           Hierarchical Inheritance(Digram Example):

                Grandfather
                     |
         -------------------------
         |                       |
       Father                 Uncle
         |                       |
    -------------         -----------------
    |           |         |               |
Sibling1    Sibling2   Cousin1       Cousin2

   */
class A {
    public void print() {
        System.out.println("Class A method");
    }

}

class B extends A {
    public void printB() {
        System.out.println("Class B mathod ");
    }
}

public class hierarchical_Inhertience {
    public static void main(String[] args) {

    }
}
