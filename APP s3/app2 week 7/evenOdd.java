/**
 * WAP in java to print all odd nos. within a given range (take lower and upper limit as input)
 */
import java.util.Scanner;
class evenOdd
{ public static void main()
    {Scanner sc = new Scanner(System.in);
        System.out.println("Enter a range within which you want to find odd nos");
        System.out.println("Enter lower limit :");
        int l=sc.nextInt();
        System.out.println("Enter upper limit :");
        int u=sc.nextInt();
        for (int i=l;i<=u;i++)
        {if(i%2==1)
            System.out.println(i+" is Odd No");
        }
        //Scanner.close();
    }
}
