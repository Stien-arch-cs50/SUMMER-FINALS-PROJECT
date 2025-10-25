#include <iostream>
using namespace std;

bool hasConsecutiveSameDigits(int n) {
    int prevDigit = -1;
    while (n > 0) {
        int currentDigit = n % 10;
        if (currentDigit == prevDigit) {
            return true; // Found two consecutive same digits
        }
        prevDigit = currentDigit;
        n /= 10;
    }
    return false; // No consecutive same digits
}

int main() {
    int n;
    cout << "Enter a positive integer: ";
    cin >> n;

    if (n <= 0) {
        cout << "Please enter a positive integer." << endl;
        return 1;
    }

    if (hasConsecutiveSameDigits(n)) {
        cout << "Yes, the number has consecutive same digits." << endl;
    } else {
        cout << "No, the number does not have consecutive same digits." << endl;
    }

    return 0;
}
