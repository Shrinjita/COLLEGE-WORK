class Question {
    int i;

    public Question(int i) {
        this.i = i--;
    }
}

class Question1 extends Question {
    public Question1(int i) {
        super(++i);
        System.out.println(i);
    }
}

public class Check {
    public static void main(String[] args) {
        Question1 n = new Question1(20);
    }
}
