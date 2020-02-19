#include <bits/stdc++.h>
using namespace std;

long arrayManipulation(int n, vector<vector<int>> queries)
{
        vector<long long int> v(n + 2, 0);
        for(int i = 0 ; i < queries.size() ; i++)
        {
            v[queries[i][0]] += queries[i][2];
            v[queries[i][1] + 1] += (-queries[i][2]);
        }
        for(int i = 1 ; i < v.size() ; i++) v[i] = v[i] + v[i - 1];
        return *max_element(v.begin(), v.end());
}
int main()
{
    int n, m, j, item;
    vector<int>rows;
    vector<vector<int>>queries;

    cin >> n >> m;
    for(int i = 0 ; i < m ; i++)
    {
        for(j = 0 ; j < 3 ; j++)
        {
            cin >> item;
            rows.push_back(item);
        }
        queries.push_back(rows);
        rows.clear();
    }
    cout << arrayManipulation(n, queries);
    return 0;
}