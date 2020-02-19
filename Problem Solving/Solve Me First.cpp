#include<bits/stdc++.h>
using namespace std;

inline int solveMeFirst(int a, int b){ return a + b; }
int main()
{
    int num1, num2, sum;
    cin >> num1 >> num2;
    sum = solveMeFirst(num1, num2);
    cout << sum;
    return 0;
}