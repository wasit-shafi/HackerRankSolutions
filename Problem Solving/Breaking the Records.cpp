#include <bits/stdc++.h>
using namespace std;

vector<int> breakingRecords(vector<int> scores)
{
    int min, max;
    vector<int>v(2, 0);

    min = max = scores[0];
    for(int i = 1 ; i < scores.size() ; i++)
    {
        if(scores[i] > max)
        {
            max = scores[i];
            v[0]++;
        }
        else if(scores[i] < min)
        {
            min = scores[i];
            v[1]++;
        }
    }
    return v;
}

int main()
{
    int n, item;
    vector<int>scores;
    
    cin >> n;
    for(int i = 0; i < n; i++)
    {
        cin >> item;
        scores.push_back(item);
    }
    vector<int> result = breakingRecords(scores);
    for(int i = 0; i < result.size(); i++) cout << result[i] << " ";
    
    return 0;
}