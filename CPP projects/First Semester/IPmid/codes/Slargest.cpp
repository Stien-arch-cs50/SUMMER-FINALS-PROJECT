#include<iostream>
using namespace std;

int main()
{
    // C++ Program to illustrate how to find the second largest
// element in an array
#include <climits>
#include <iostream>
using namespace std;


    // Initialize an array
    int array[] = { 1, 2, 3, 4, 5 };
    int n = sizeof(array) / sizeof(array[0]);

    // Initialize first and second to the minimum possible
    // value
    int first = INT_MIN, second = INT_MIN;

    // Traverse the array
    for (int i = 0; i < n; i++) {
        // If current element is greater than first
        if (array[i] > first) {
            second = first;
            first = array[i];
        }
        // If current element is in between first and second
        else if (array[i] > second && array[i] < first) {
            second = array[i];
        }
    }

    // Print the second largest element
    cout << "Second Largest Element in the Array: "
         << second << endl;

    return 0;
}
