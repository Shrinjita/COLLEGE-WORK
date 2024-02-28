//1). Write a program in C++ to find the last prime number that occurs before the entered number.
//2). Write a C++ program to remove all special characters from a given string.
#include<iostream>
using namespace std;
bool isPrime(int n)
{    if (n <= 1)
        return false;
    for (int i = 2; i <= n / 2; i++)
        if (n % i == 0)
            return false;
     return true;
}
int main()
{int n;
cout<<"Enter the no. : "<<endl;
cin>>n;
for (int j =(n-1);j>=2;j--)
{    if (isPrime(j)==true)
    {cout<<j<<" is prime";        
    break;
    }
   }
return 0;
}