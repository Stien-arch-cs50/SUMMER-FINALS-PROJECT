#include<iostream>
using namespace std;

int main(void)
{
    int n = 10;
    int arr[n] = {12,32,43,1,54,53,15,64,3,13};
    cout<<"Array in the normal order: ";
    for(int i = 0 ; i < n ; i++)
    {
        cout<<arr[i]<<" ";
    }
    cout<<endl;

    cout<<"Array in reverse order: ";
    for(int i = 9; i >= 0; i--)
    {
        cout<<arr[i]<<" ";
    }
}