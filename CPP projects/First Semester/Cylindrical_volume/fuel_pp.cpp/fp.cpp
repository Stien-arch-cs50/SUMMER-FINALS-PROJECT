#include<iostream>

using namespace std;

int main()
{
    float D, M, fp_per_ltr = 126;
    cout<<"Distance(km) = ";
    cin>>D;
    cout<<"\nMileage(km/ltr) = ";
    cin>>M;
    float fuel_cost = (D/M) * fp_per_ltr;
    cout<<"Fuel cost(tk) = "<<fuel_cost<<endl;
}
