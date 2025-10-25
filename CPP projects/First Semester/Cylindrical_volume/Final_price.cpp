#include<iostream>

using namespace std;

int main()
{
    float tp, fp;
    cout<<"ENTER TOTAL PRICE : ";
    cin>> tp;
    while(tp<=500)
    {
        cout<<"Again!"<<endl;
        cout<<"ENTER TOTAL PRICE : ";
    cin>> tp;
    }
    fp = tp * 0.9;
    cout<<"Total price = "<<tp<<"\nFinal price = "<<fp<<endl;
}
