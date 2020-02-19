#include <bits/stdc++.h>
using namespace std;

string catAndMouse(int x, int y, int z)
{
    if(abs(z - x) == abs(z - y))
        return "Mouse C";
    else if(abs(z - x) > abs(z - y))
        return "Cat B";
    else
        return "Cat A";
}
int main()
{
    int n, x, y, z;

    cin >> n;

    while(n--)
    {
        cin >> x >> y >> z;
        cout << catAndMouse(x, y, z) << "\n";
    }
    return 0;
}