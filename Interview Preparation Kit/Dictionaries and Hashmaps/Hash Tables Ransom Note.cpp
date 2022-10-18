#include <bits/stdc++.h>
using namespace std;

void checkMagazine(vector<string> magazine, vector<string> note, int m, int n)
{
    map<string, int> mp;
    map<string, int>::iterator itr;
    
    for(int i = 0 ; i < m ; i++)
    {
        itr = mp.find(magazine[i]);

        if( itr != mp.end())
            itr->second++;
        else
            mp.insert(pair<string, int>(magazine[i], 1));
    }

    bool result = true;
    for(int i = 0 ; i < n ; i++)
    {
        itr = mp.find(note[i]);
        if(itr == mp.end())
        {
            result = false;
            break;
        }
        else
        {
            itr->second--;
            if(itr->second == -1)
            {
                result = false;
                break;
            }
        }
    }
    if(result)
        cout << "Yes";
    else
        cout << "No";
}
int main()
{
    int m, n;
    string data;
    vector<string> magazine, note;

    cin >> m >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    for(int i = 0 ; i < m ; i++) cin >> data, magazine.push_back(data);
    for(int i = 0 ; i < m ; i++) cin >> data, note.push_back(data);
    checkMagazine(magazine, note, m, n);
    return 0;
}
