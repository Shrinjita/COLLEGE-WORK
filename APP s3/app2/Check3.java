class Question {
    static int x;

    static {
        x++;
    }

    {
        ++x;
    }
}

class Question1 extends Question {
    static {
        --x;
    }

    {
    x--;
    }
}

public class Check3 {
    public static void main(String[] args) {
        System.out.println(new Question().x); // Output: 2
        System.out.println(new Question1().x); // Output: 2
    }
}
