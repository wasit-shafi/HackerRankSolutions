#include <bits/stdc++.h>
using namespace std;

int designerPdfViewer(int h[], string word)
{
    int max, len;
    
    max = h[word[0] - 'a'];
    len = word.size();
    for(int i = 1 ; i < len ; i++)
        if(h[word[i] - 'a'] > max)
            max = h[word[i] - 'a'];
    return max * len;
}
int main()
{
    string word;
    int i, h[26];

    for(i = 0 ; i < 26 ; i++) cin >> h[i];
    cin.ignore(numeric_limits < streamsize > ::max(), '\n');
    getline(cin, word);
    cout << designerPdfViewer(h, word);
    return 0;
}