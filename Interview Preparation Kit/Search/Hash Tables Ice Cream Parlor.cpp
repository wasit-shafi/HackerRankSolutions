#include <bits/stdc++.h>
using namespace std;

void whatFlavors(vector<int> cost, int money, int n)
{
    int i, j;
    set<int> s;

    for(i = 0 ; i < n ; i++)
        if(s.find(money - cost[i]) != s.end())
            break;
        else
            s.insert(cost[i]);
    for(j = 0 ; j < i ; j++)
        if(cost[j] == money - cost[i])
            break;
    if(i < j)
        cout << i + 1 << " " << j + 1 << " " << "\n";
    else
        cout << j + 1 << " " << i + 1 << " " << "\n";
}
int main()
{
    vector<int> cost;
    int i, t, data, n, money;

    cin >> t;
    while(t--)
    {
        cin >> money >> n;
        for(i = 0 ; i < n ; i++)
        {
            cin >> data;
            cost.push_back(data);
        }
        whatFlavors(cost, money, n);
        cost.clear();
    }
    return 0;
}
