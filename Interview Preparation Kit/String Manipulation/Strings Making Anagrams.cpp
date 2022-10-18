#include <bits/stdc++.h>
using namespace std;

int makeAnagram(string a, string b)
{
    int i, len, sum = 0;
    int arr[26] = {0};
    
    len = a.size();
    for(i = 0 ; i < len ; i++) arr[a[i] - 'a']++;
    len = b.size();
    for(i = 0 ; i < len ; i++) arr[b[i] - 'a']--;
    for(i = 0 ; i < 26 ; i++) sum += abs(arr[i]);
    return sum;
}
int main()
{
    string a;
    getline(cin, a);

    string b;
    getline(cin, b);

    cout << makeAnagram(a, b);
    return 0;
}
