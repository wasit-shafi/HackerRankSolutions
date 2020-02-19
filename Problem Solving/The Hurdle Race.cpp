#include <bits/stdc++.h>
using namespace std;

int hurdleRace(int k, vector<int> height)
{
    int max = height[0];
    for(int i = 1 ; i < height.size() ; i++)
        if(height[i] > max)
            max = height[i];
    if (max <= k)
        return 0;
    else
        return max - k;
}
int main()
{
    int n, k, data;
    vector<int> height;
    
    cin >> n >> k;
    while(n--)
    {
        cin >> data;
        height.push_back(data);
    }
    cout << hurdleRace(k, height);
    return 0;
}