#include <iostream>
#include <string>
using namespace std;
class Student {
public:
    string name;
    int roll_no;
};
int main() {
    // Create an object of the Student class
    Student studentObj;

    // Set the values of the attributes
    studentObj.name = "John";
    studentObj.roll_no = 2;
    // Display the values
cout << "Student Name: " << studentObj.name << endl;
cout << "Roll Number: " << studentObj.roll_no <<endl;

    return 0;
}
