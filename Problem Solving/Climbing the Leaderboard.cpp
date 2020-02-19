#include <bits/stdc++.h>
using namespace std;

//Refer(demo) : https://github.com/wasitshafi/hackerranksolutions/blob/master/PROBLEM%20SOLVING/Climbing%20the%20Leaderboard(Demo).cpp
vector<int> climbingLeaderboard(vector<int> scores, vector<int> alice)
{
    vector<int> ranks;
    vector<int> distinctScores;

    distinctScores.push_back(scores[0]);
    for(int i = 1 ; i < scores.size() ; i++)
        if(distinctScores[distinctScores.size() - 1] != scores[i])
            distinctScores.push_back(scores[i]);
    
    vector<int>::iterator itr;
    for(int i = 0 ; i < alice.size() ; i++)
    {
        itr = lower_bound(distinctScores.begin(), distinctScores.end(), alice[i], greater<int>());
        ranks.push_back(itr - distinctScores.begin() + 1);
        //if itr points to v.end() still there is no need to do any specific changes as v.end() is also a pointer location equals to null
    }
    return ranks;
}
int main()
{
    int n, data;
    vector<int> scores;
    vector<int> alice;

    cin >> n;
    while(n--)
    {
        cin >> data;
        scores.push_back(data);
    }
    cin >> n;
    while(n--)
    {
        cin >> data;
        alice.push_back(data);
    }
    vector<int> ranks = climbingLeaderboard(scores, alice);
    n = ranks.size();
    for(int i = 0 ; i < n ; i ++) cout << ranks[i] << "\n";
    return 0;
}