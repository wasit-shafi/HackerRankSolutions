#include <bits/stdc++.h>
using namespace std;

int jumpingOnClouds(vector<int> c, int n)
{
    int count, i;
    
    count = i;
    while(1)
    {
        if(i == n - 3)
        {
            count++;
            break;
        }
        else if(i == n - 2)
        {
            count++;
            break;
        }
        else if(c[i + 2] == 0)
        {
          i = i + 2;
          count++;
        }
        else if(c[i + 1] == 0)
        {
            i = i + 1;
            count++;
        }
    }
    return count;
}
int main()
{
    int n;
    cin >> n;
    vector<int> c(n);

    for(int i = 0 ; i < n ; i++) cin >> c[i];
    cout << jumpingOnClouds(c, n) << "\n";
    return 0;
}