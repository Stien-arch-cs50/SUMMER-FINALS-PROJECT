#include<iostream>
using namespace std;

int main (void)
{
    const int rowNo = 3; const int colmnNo = 3;int Sum[rowNo][colmnNo];
     
    int arr1[rowNo][colmnNo] ={12,13,14,15,16,17,18,19,20};
        int arr2[rowNo][colmnNo] = {1,2,3,4,5,6,7,8,9};
            int arr3[rowNo][colmnNo] = {101,104,107,102,105,108,103,106,109};

    for(int m = 0; m < rowNo; m++)
    {
        for(int n = 0; n < colmnNo; n++)
        {
             Sum[m][n] = {arr1[m][n] + arr2[m][n] + arr3[m][n]};
        }
    }
     cout << "Resultant Matrix after addition:" << endl;
    for (int i = 0; i < rowNo; i++) {
        for (int j = 0; j < colmnNo; j++) {
            cout << Sum[i][j] << "\t";
        }
        cout << endl;
    }


}