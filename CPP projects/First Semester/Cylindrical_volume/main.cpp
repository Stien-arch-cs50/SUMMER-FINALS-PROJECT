#include <iostream>

using namespace std;

int main()
{float r , h , v, pi = 3.1416;
    cout<< "Enter radius of bottle : ";
    cin >> r;
    cout<<"\nEnter height of bottle : ";
    cin>>  h;
    if(r > 0 && h > 0)
         v = pi * r * r *h;
    else
        cout<<"Invalid value input."<<endl;
    cout<<"Volume V = "<<v<<endl;
    return 0;
}
