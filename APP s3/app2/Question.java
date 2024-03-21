class Q {
    public void disp() {
        System.out.println("java");
    }
}

class P extends Q {
    public void disp() {
        System.out.println("nptel");
    }
}

class C extends P {
    public void disp() {
        super.super.disp(); // Calling the disp() method of P
        System.out.println("course");
    }
}

public class Question {
    public static void main(String[] args) {
        C c = new C();
        c.disp(); // Output: "nptel" followed by "course"
    }
}
