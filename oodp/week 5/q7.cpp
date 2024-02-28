#include <iostream>
#include <sstream>

using namespace std;

bool isValidTime(int h, int m, int s) {
    return (h >= 0 && h < 24) && (m >= 0 && m < 60) && (s >= 0 && s < 60);
}

int main() {
    string wristWatchTime, carClockTime;
    
    cout << "Enter wristwatch time (HH MM SS): ";
    getline(cin, wristWatchTime);
    
    cout << "Enter car's clock time (HH MM SS): ";
    getline(cin, carClockTime);

    int wh, wm, ws;
    int ch, cm, cs;

    stringstream wwStream(wristWatchTime);
    wwStream >> wh >> wm >> ws;

    stringstream ccStream(carClockTime);
    ccStream >> ch >> cm >> cs;

    if (isValidTime(wh, wm, ws) && isValidTime(ch, cm, cs)) {
        if (wh == ch && wm == cm && ws == cs) {
            cout << "Both clocks are showing the same time" << endl;
        } else {
            cout << "Clocks are showing different times" << endl;
        }
    } else {
        cout << "Invalid time format" << endl;
    }

    return 0;
}
