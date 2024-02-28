#include <iostream>
#include <string>
using namespace std;
class Student {
private:
    string name;
    double cgpa;
    char gender;
    int backlogs;
public:
    Student(const string& n, double c, char g, int b) {
        name = n;
        cgpa = c;
        gender = g;
        backlogs = b;
    }
    bool isEligible() {
        if (gender == 'M' || gender == 'm') {
            return (cgpa >= 7.0 && backlogs <= 2);
        } else if (gender == 'F' || gender == 'f') {
            return (cgpa >= 7.5 && backlogs <= 1);
        }
        return false;
    }
        void displayDetails() {
        cout << "Student Name: " << name << endl;
        cout << "CGPA: " << cgpa << endl;
        cout << "Gender: " << gender << endl;
        cout << "Number of Backlogs: " << backlogs << endl;
    }
};

int main() {
    string name;
    double cgpa;
    char gender;
    int backlogs;

    cout << "Enter student name: ";
    getline(cin, name);
    cout << "Enter CGPA: ";
    cin >> cgpa;
    cout << "Enter gender (M/F): ";
    cin >> gender;
    cout << "Enter number of backlogs: ";
    cin >> backlogs;

    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    Student student(name, cgpa, gender, backlogs);

    cout << endl;
    student.displayDetails();

    if (student.isEligible()) {
        cout << "Eligible for placement." << endl;
    } else {
        cout << "Not eligible for placement." << endl;
    }

    return 0;
}
