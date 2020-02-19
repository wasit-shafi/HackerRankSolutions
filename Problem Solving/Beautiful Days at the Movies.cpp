#include <bits/stdc++.h>
using namespace std;

int reverseOf(int num)
{
    int  sum = 0;
    while(num != 0) sum = sum * 10 + num % 10, num = num / 10;
    return sum;
}
int beautifulDays(int i, int j, int k)
{
    int count = 0;
    for(int start  = i ; start <= j ; start++)
        if(abs(start - reverseOf(start)) % k == 0) count++;
    return count;
}

int main()
{
    int i, j, k;

    cin >> i >> j >> k;
    cout << beautifulDays(i, j, k);
    return 0;
}