#include<bits/stdc++.h>
using namespace std;

int utopianTree(int n)
{
    int height = 1;

    for(int i = 1 ; i <= n ; i++)
        if( i % 2 == 0 )
            height++;
        else               
            height = height * 2;
    return height;
}
int main()
{
    int t, n;
    
    cin >> t;
    while(t--)
    {
        cin >> n;
        cout << utopianTree(n) << "\n";
    }
    return 0;
}