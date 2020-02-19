#include <bits/stdc++.h>
using namespace std;

int getMoneySpent(vector<int> keyboards, vector<int> drives, int b)
{
     int result = -1;
     for(auto itr1 =    keyboards.begin() ; itr1 != keyboards.end() ; itr1++)
         for (auto itr2 = drives.begin(); itr2 != drives.end() ; itr2++)
             if( (*itr1 + *itr2 <= b) && (*itr1 + *itr2 > result))
              result = *itr1 + *itr2;    
     return result;
}
int main()
{
    int b, n, m, item;
    vector<int> drives;
    vector<int> keyboards;

    cin >> b >> n >> m;
    for(int i = 0 ; i < n ; i++)
    {
        cin >> item;
        keyboards.push_back(item);
    }
    for(int i = 0 ; i < m ; i++)
    {
        cin >> item;
        drives.push_back(item);
    }
    cout << getMoneySpent(keyboards, drives, b);
    return 0;
}