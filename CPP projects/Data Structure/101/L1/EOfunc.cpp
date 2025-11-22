#include<iostream>
using namespace std;

void oddPrinter (int a,int b )
{
    int i = a;int Odd;
    while(i<=b)
    {
        if(i%2!=0)
         {
            Odd = i;
        cout<<Odd<<" ";
         }
        i++;
    }
}


int main (void)
{
     oddPrinter(1,100);
    
}