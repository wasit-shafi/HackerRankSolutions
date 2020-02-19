#include <bits/stdc++.h>
using namespace std;

int migratoryBirds(vector<int> v)
{
    int len = v.size();
    int i, frequency[6] = {0};
    
    for(i = 0 ; i < len ; i++) frequency[v[i]]++;
    int max = frequency[1];
    for(i = 2 ; i <= 5 ; i++)
        if(frequency[i] > max)
            max = frequency[i];

    for(i = 1 ; i <= 5 ; i++)
        if(frequency[i] == max)
            break;
    return i;
}

int main()
{
    int n, item;
    vector<int> v;

    cin >> n;
    while(n--)
    {
        cin >> item;
        v.push_back(item);
    }
    cout << migratoryBirds(v);
    return 0;
}