#include<bits/stdc++.h>
using namespace std;

vector<int> serviceLane(vector<int> width, vector<vector<int>> cases)
{
    vector<int> result;
    int start, end, min;
    for(auto i = 0; i < cases.size(); i++)
    {
        start = cases[i][0];
        end = cases[i][1];
        min = width[start];

        for(int j = start + 1 ; j <= end ; j++) if(width[j] < min) min = width[j];
        result.push_back(min);
    }
    return result;
}
int main()
{
    int n, t, item;
    vector <vector<int>> cases;
    vector <int> width, result, temp;

    cin >> n >> t;
    for(auto i = 0 ; i < n ; i++) cin >> item, width.push_back(item);
    for(auto i = 0 ; i < t ; i++)
    {
        cin >> item, temp.push_back(item);
        cin >> item, temp.push_back(item);
        cases.push_back(temp);
        temp.clear();
    }
    result = serviceLane(width, cases);
    for(auto i = 0 ; i < result.size() ; i++) cout << result[i] << "\n";
    return 0;
}