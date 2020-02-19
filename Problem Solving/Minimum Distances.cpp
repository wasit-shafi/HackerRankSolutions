#include <bits/stdc++.h>
using namespace std;

int minimumDistances(vector<int> a, int n)
{
    int min = -1;
    for( int i = 0 ; i < n ; i++)
        for(int j = i + 1 ; j < n ; j++)
            if(a[j] == a[i])
                if(min == -1)
                    min = abs(i-j);
                else if(abs(i-j) < min)
                    min = abs(i-j);
    return min;
}
int main()
{
    int n;
    cin >> n;
    vector<int>a(n);

    for(int i = 0 ; i < n ; i++) cin >> a[i];
    cout << minimumDistances(a, n);
    return 0;
}