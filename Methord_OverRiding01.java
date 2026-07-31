class Bank {
    public void RateOfInterest() {
        System.out.println("Rate of interest Generally 5%");
    }
}

class SBI extends Bank {
    public void RateOfInterest() {
        System.out.println("Rate of interest at SBI is 7.3%");
    }
}

class PNB extends Bank {
    public void RateOfInterest() {
        System.out.println(" Rate of interest at PNB is 6.8%");
    }
}

public class Methord_OverRiding01 {
    public static void main(String[] args) {
        Bank obj = new Bank();
        SBI obj1 = new SBI();
        PNB obj2 = new PNB();
        obj.RateOfInterest();
        obj1.RateOfInterest();
        obj2.RateOfInterest();
    }
}
