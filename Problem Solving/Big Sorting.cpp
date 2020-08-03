#include <bits/stdc++.h>
using namespace std;

bool comp(const string& s1, const string& s2)
{
    int len1 = s1.size();
    int len2 = s2.size();

    if(len1 < len2)     // if s1 come before s2 then return true, otherwise return false
        return true;
    else if (len1 > len2)
        return false;
    else
        return s1 < s2; // lexicographically
}

vector<string> bigSorting(vector<string> unsorted)
{
    sort(unsorted.begin(), unsorted.end(), comp);
    return unsorted;
}

int main()
{
    int n;
    cin >> n;
    vector<string> unsorted(n);
    
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    for (int i = 0; i < n; i++) cin >> unsorted[i];
    
    vector<string> result = bigSorting(unsorted);
    for (int i = 0; i < result.size(); i++) cout << result[i] << "\n";
    
    return 0;
}