#include <bits/stdc++.h>

using namespace std;

vector<string> split_string(string);
// refer (demo) : https://github.com/wasitshafi/hackerranksolutions/blob/master/PROBLEM%20SOLVING/Climbing%20the%20Leaderboard(Demo).cpp
vector<int> climbingLeaderboard(vector<int> scores, vector<int> alice) {
    vector<int> distinctScores;
    vector<int> ranks;

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
    ofstream fout(getenv("OUTPUT_PATH"));

    int scores_count;
    cin >> scores_count;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    string scores_temp_temp;
    getline(cin, scores_temp_temp);

    vector<string> scores_temp = split_string(scores_temp_temp);

    vector<int> scores(scores_count);

    for (int i = 0; i < scores_count; i++) {
        int scores_item = stoi(scores_temp[i]);

        scores[i] = scores_item;
    }

    int alice_count;
    cin >> alice_count;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    string alice_temp_temp;
    getline(cin, alice_temp_temp);

    vector<string> alice_temp = split_string(alice_temp_temp);

    vector<int> alice(alice_count);

    for (int i = 0; i < alice_count; i++) {
        int alice_item = stoi(alice_temp[i]);

        alice[i] = alice_item;
    }

    vector<int> result = climbingLeaderboard(scores, alice);

    for (int i = 0; i < result.size(); i++) {
        fout << result[i];

        if (i != result.size() - 1) {
            fout << "\n";
        }
    }

    fout << "\n";

    fout.close();

    return 0;
}

vector<string> split_string(string input_string) {
    string::iterator new_end = unique(input_string.begin(), input_string.end(), [] (const char &x, const char &y) {
        return x == y and x == ' ';
    });

    input_string.erase(new_end, input_string.end());

    while (input_string[input_string.length() - 1] == ' ') {
        input_string.pop_back();
    }

    vector<string> splits;
    char delimiter = ' ';

    size_t i = 0;
    size_t pos = input_string.find(delimiter);

    while (pos != string::npos) {
        splits.push_back(input_string.substr(i, pos - i));

        i = pos + 1;
        pos = input_string.find(delimiter, i);
    }

    splits.push_back(input_string.substr(i, min(pos, input_string.length()) - i + 1));

    return splits;
}
