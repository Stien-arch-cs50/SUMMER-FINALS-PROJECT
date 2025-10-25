#include <iostream>
#include <vector>
using namespace std;

int main() {
    int n;
    cout << "Enter the number of Fibonacci terms to generate: ";
    cin >> n;

    while (n <= 0) {
        cout << "Please enter a positive integer." << endl;
        cout << "Enter the number of Fibonacci terms to generate: ";
    cin >> n;
    }

    vector<int> fib(n);
    fib[0] = 0;

    if (n > 1) {
        fib[1] = 1;
    }

    // Generate Fibonacci sequence
    for (int i = 2; i < n; ++i) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }

    // Print the original Fibonacci sequence
    cout << "Fibonacci sequence:" << endl;
    for (int i = 0; i < n; ++i) {
        cout << fib[i] << " ";
    }
    cout << endl;

    // Replace even numbers with 0
    cout << "Modified Fibonacci sequence (even numbers replaced with 0):" << endl;
    for (int i = 0; i < n; ++i) {
        if (fib[i] % 2 == 0) {
            cout << 0 << " ";
        } else {
            cout << fib[i] << " ";
        }
    }
    cout << endl;

    return 0;
}
