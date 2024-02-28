#include <iostream>
using namespace std;
class HospitalBill {
public:
    int CalcBill(int amt, int days) {
        return (amt * days);
    }
};
int main() {
    HospitalBill hosp;
    int medAmt, medDays;
    cout << "Enter amount for medicines and number of days: ";
    cin >> medAmt >> medDays;
    int roomAmt, roomDays;
    cout << "Enter amount for room and number of days: ";
    cin >> roomAmt >> roomDays;
    int medBill = hosp.CalcBill(medAmt, medDays);
    int roomBill = hosp.CalcBill(roomAmt, roomDays);
    cout << "Medicine Bill: " << medBill << endl;
    cout << "Room Bill: " << roomBill << endl;
    return 0;
}
