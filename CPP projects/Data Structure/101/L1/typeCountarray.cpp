#include<iostream>
using namespace std;

int main(void)
{
    int n = 10, evenCount = 0 , oddCount = 0;
    int arr[n] = {12,32,43,1,54,15,64,3,13};

    for(int i = 0 ;i < n ; i++)
    {
        if(arr[i] % 2 == 0)
        {
            evenCount++;
        }
        else
        oddCount++;
    }
    cout<<evenCount<<" "<<oddCount<<endl;
}