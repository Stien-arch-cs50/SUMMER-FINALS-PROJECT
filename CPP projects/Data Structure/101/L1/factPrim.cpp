#include<iostream>
using namespace std;

bool isPrime(int n) 
{
    if (n <= 1)
        return false;
    for (int i = 2; i * i <= n; i++)
    {
        if (n % i == 0)
            return false;
    }
    return true;
}



long long fact(int n)
{
    if (!isPrime(n))
    {
        throw runtime_error("Input not prime");    
    }


    long long factorial = 1;
    for (int i = 1;  i <= n; i++)
    {
        factorial *= i;
    }

    return factorial;
}



int main(void)
{
    int n;
    cout << "Enter a prime number: ";
    cin >> n;

    try 
    {
        long long result = fact(n);
        cout << "Factorial of " << n << " is " << result << endl;
    }
    catch (const runtime_error& e)
    {
        cout << "Error: " << e.what() << endl;
    }

    return 0;
}