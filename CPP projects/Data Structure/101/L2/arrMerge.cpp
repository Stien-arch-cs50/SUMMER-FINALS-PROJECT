#include<iostream>
using namespace std;

int main(void)
{
    int arr1[5] = {10,20,30,40,50},arr2[8] = {1,2,3,4,5,6,7,8};

       int size1 = sizeof(arr1)/sizeof(arr1[0]) , size2 = sizeof(arr2)/sizeof(arr2[0]);
        int mergedSize = size1 + size2;int Merge[mergedSize];

            for(int i = 0; i < size1; i++)
            {
                 Merge[i] = arr1[i];
            }
             for(int j = 0; j< size2 ; j++)
                {
                     Merge[size1+j] = arr2[j];
                   
                }
                  for (int i = mergedSize - 1; i >= 0; i--) {
        cout << Merge[i] << " ";
    }
    cout << endl;


      

}