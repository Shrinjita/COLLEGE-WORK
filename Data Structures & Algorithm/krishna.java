import java.util.Scanner;
public class krishna
{static int factorial(int a)
    {   if (a==0||a==1)
        return a;
        int p=1;
        for(int i=2;i<=a;i++)
        p*=i;
        return p;
    }
    public static void main(String[] args)
    {  Scanner sc = new Scanner(System.in);
        System.out.println("Enter no:");
        int k=sc.nextInt();
        int c=k;
        int s=0;
        while(c>0)
        {  int d=c%10;
            s+=factorial(d);
            c/=10;
        }
        if(s==k && s!=0)
        System.out.println("K");
        else
        System.out.println("nk");
    }
}