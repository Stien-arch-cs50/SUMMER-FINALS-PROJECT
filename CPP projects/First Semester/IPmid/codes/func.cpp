#include<iostream>
using namespace std;
int Function (int a , int b, int c);
int main()

{
    
    int greatest = Function(2,5,4);
    cout<<"Largest number is "<<greatest<<endl;
    return 0;
}

int Function (int a , int b, int c)
{
    int max;
    if (a > b && a >c)
    {
         max = a;
    }
    else if(b > a && b > c)
    {
         max = b;
    }
    else 
   {
         max = c;
   }
    return max;
}
