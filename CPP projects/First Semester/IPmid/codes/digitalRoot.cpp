#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a positive integer: ";
    cin >> n;

    while (n <= 0) {
        cout << "Please enter a positive integer." << endl;
        cout << "Enter a positive integer: ";
    cin >> n;
    }

    while (n >= 10) { // Keep going until it's a single-digit number
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            sum += temp % 10; // Add last digit
            temp /= 10;       // Remove last digit
        }

        n = sum; // Update n with the sum of its digits
    }

    cout << "The single-digit result is: " << n << endl;

    return 0;
}
