#include <bits/stdc++.h>
using namespace std;

string angryProfessor(int k, vector<int> a)
{
    int count = 0;
    
    for(auto itr = a.begin() ; itr != a.end() && count < k ; itr++) if(*itr <= 0) count++;
    if(count < k)
        return "YES";
    else
        return "NO";
}
int main()
{
    vector<int> a;
    int t, n, k, i, data;

    cin >> t;
    while(t--)
    {
        cin >> n >> k;
        for(i = 0 ; i < n ; i++)
        {
            cin >> data;
            a.push_back(data);
        }
        cout << angryProfessor(k, a) << "\n";
        a.clear();
    }
    return 0;
}