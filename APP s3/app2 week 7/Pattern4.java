import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int l = inr.nextInt();
        if (l % 2 == 0) {
            System.out.println("Invalid line number");
        } 
        else 
        {System.out.println("*");
            for (int i = 1; i <= l/2; i++) {
                int k=l/2-1;
                for (int j = k; j>i; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
           
            for(int i=1;i<=l/2;i++)
            {for(int j=1;j<=i;j++)
                System.out.print(" ");
             for(int j=l/2;j>=i;j--)
              System.out.print("* ");
             System.out.println();
        }
    }
    }
}
