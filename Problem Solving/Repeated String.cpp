#include<iostream>
using namespace std;

long repeatedString(string s, long n)
{
    long total = 0;
    short int aInPattern = 0, rem, len, i;
    
    len = s.size();
    for(i = 0 ; i < len ; i++)
        if(s[i] == 'a')
            aInPattern++;
    total = n / len * aInPattern;
    rem = n % len;
    if(rem)
    {
        for(i = 0 ; i < rem ; i++)
            if(s[i] == 'a')
                total++;
    }
    return total;
}
int main()
{
    long n;
    string s;

    getline(cin, s);
    cin >> n;
    cout << repeatedString(s, n);
    return 0;
}