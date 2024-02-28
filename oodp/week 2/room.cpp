#include <iostream>
class Room {
private:
    double length;
    double breadth;
    double height;
public:
  
    Room(double len, double brd, double hgt) {
        length = len;
        breadth = brd;
        height = hgt;
    }

    // Method to calculate area
    double calculateArea() {
        return 2 * (length * breadth + length * height + breadth * height);
    }

    // Method to calculate volume
    double calculateVolume() {
        return length * breadth * height;
    }
};

int main() {
    // Create Room objects
    Room room1(10.0, 8.0, 12.0);
    Room room2(15.0, 12.0, 9.0);

    // Calculate and display area and volume for room1
    std::cout << "Room 1:" << std::endl;
    std::cout << "Area: " << room1.calculateArea() << " square units" << std::endl;
    std::cout << "Volume: " << room1.calculateVolume() << " cubic units" << std::endl;

    std::cout << std::endl;

    // Calculate and display area and volume for room2
    std::cout << "Room 2:" << std::endl;
    std::cout << "Area: " << room2.calculateArea() << " square units" << std::endl;
    std::cout << "Volume: " << room2.calculateVolume() << " cubic units" << std::endl;

    return 0;
}
