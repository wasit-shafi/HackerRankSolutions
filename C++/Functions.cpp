#include <iostream>
#include <algorithm>
using namespace std;

int getMax(int a, int b, int c, int d)
{
    int ans;
    if( a > b && a > c && a > d ) ans = a;
    else if( b > a && b > c && b > d) ans = b;
    else if( c > a && c > b && c > d) ans = c;
    else if( d > a && d > b && d > c) ans = d;
    return ans;
}

int main()
{
    int a, b, c, d;
    cin >> a >> b >> c >> d;

    //cout << getMax(a, b, c, d);
    // or
    cout << max(a, max(b, max(c, d)));
    return 0;
}