#include <iostream>
using namespace std;

int main() {
    int A[] = {1, 3, 5, 7, 9};
    int B[] = {2, 4, 6, 7, 8, 9, 10};

    int sizeA = sizeof(A) / sizeof(A[0]);
    int sizeB = sizeof(B) / sizeof(B[0]);
    bool found = false;

    cout << "Common element(s): ";
    for (int i = 0; i < sizeA; i++) {
        for (int j = 0; j < sizeB; j++) {
            if (A[i] == B[j]) {
                cout << A[i] << " ";
                found = true;
                break; // avoid duplicate prints
            }
        }
    }

    if (!found) {
        cout << "No common element!";
    }

    cout << endl;
    return 0;
}