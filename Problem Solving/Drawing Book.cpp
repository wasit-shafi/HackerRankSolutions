#include <bits/stdc++.h>
using namespace std;

int pageCount(int n, int p)
{
    // here we don't need to check if p == 2 then return also 0 as its mentioned the page no 1 will be from the right side
    if( p == 1 || p == n || (n % 2 != 0 && p == n - 1))
        return 0; //last page may be on the left or right side
    else
    {
        int i, countFront, countRear;
        
        countFront = countRear = 0;
        for(int i = 1 ; i < p ; i = i + 2) countFront++;
        i = n % 2 != 0 ? n - 1 : n;
        for( ; i > p ; i = i - 2 ) countRear++;
        return countFront < countRear ? countFront : countRear;
    }
}
int main()
{
    int n, p;

    cin >> n >> p;
    cout << pageCount(n, p);
    return 0;
}