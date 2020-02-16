#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n, i, data;
    vector <int> arr;

    cin >> n;

    for(i = 0 ; i < n ; i++)
        cin >> data, arr.push_back(data);
    sort(arr.begin(), arr.end());

    for(i = 0 ; i < n ; i++)
     cout << arr[i] << " ";
    return 0;
}