import java.util.Scanner;
class test{
    Scanner sc=new Scanner(System.in);
    
    int n=sc.nextInt();
    int Q[]=new int[n];
    int M[]=new int[n];
    int f[]=new int[n];
    int iT[]=new int[n];
    void input()
    {System.out.println("Enter:\n1.weight of water(in kgs)\n2.initial temperature(in Celsius)\n3.final temperature(in Celsius)");
        for(int i=0;i<n;i++)
        { M[i]=sc.nextInt();
          f[i]=sc.nextInt();
            iT[i]=sc.nextInt();
        }
    }
    void calculate()
    {for(int i=0;i<n;i++)
        { Q[i]=M[i]*(f[i]-iT[i])*4184;}
    }
    void print()
    {System.out.println("Test cases:\nweight of water(in kgs)\tinitial temperature(in Celsius)\tfinal temperature(in Celsius)\tEnergy");
    for(int i=0;i<n;i++)
    System.out.println(M[i]+"\t"+f[i]+"\t"+iT[i]+"\t"+Q[i]);
    }
public void main()
{test ob=new test();
    ob.input();
    ob.calculate();
    ob.print();
}
}