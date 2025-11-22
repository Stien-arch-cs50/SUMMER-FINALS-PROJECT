#include<iostream>
using namespace std;

int main ()
{
    int arr[] = {23,15,2,66,3,9,7,21,1};
    int i,j;

        for(i = 1 ; i < 8 ; i++)
        {
            for(j = i; j > 0 ; j--)
            {
                if(arr[j-1] > arr[j])
                {
                    int temp = arr[j];

                    arr[j] = arr[j - 1];

                    arr[j - 1] = temp;
                }
            }
        }
    

        cout<<"Ordered Array :";
        for (i = 0; i < 8 ; i++)
        cout<<arr[i]<<" ";
}