#include <bits/stdc++.h>
using namespace std;

int countingValleys(int n, string s)
{
    int countValleys = 0, x = 0;

    for(int i = 0 ; i < s.size() ; i++)
    {
        if(s[i] == 'U')
        {
            if(++x == 0)
                countValleys++;
        }
        else
            x--;
    }
    return countValleys;
}
int main()
{
    int n;
    string s;

    cin >> n;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    getline(cin, s);
    cout << countingValleys(n, s);
    return 0;
}