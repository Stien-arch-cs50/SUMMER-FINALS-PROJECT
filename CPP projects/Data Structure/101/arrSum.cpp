#include <iostream>
using namespace std;

int main (void)
{
    int arr[3][3] = {{1,2,3},{3,3,3},{3,3,3}}, arr1[3][3] = {{1,2,3},{3,3,3},{5,6,3}};
    for (int i= 0 ; i<3; i++)
    {
        for (int j = 0; j<3 ; j++)
        {
            arr[i][j] = arr[i][j] + arr1[i][j];
        } 
    }
for (int i= 0 ; i<3; i++)
    {
        cout<<endl;
        for (int j = 0; j<3 ; j++)
        {
            cout<<arr[i][j]<<" ";
        } 
    }
    

}