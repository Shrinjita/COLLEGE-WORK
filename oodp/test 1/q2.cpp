#include <iostream>
#include <string>
using namespace std;
string chgLtr(string str) {
	int ch;
	for (int x = 0; x < str.length(); x++)
        {ch = int(str[x]);
        if (ch == 122)
        	{str[x] = char(97);
		    }
		else if (ch == 90)
		{
			str[x] = char(65);
		}
		else if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
		{
			str[x] = char(ch + 1);
		}
	
	}

	return str;
}

int main() 
{string a;
cout<<"Original String :";
	cin>>a;
	cout << "New string: " << chgLtr(a);
	return 0;
}
