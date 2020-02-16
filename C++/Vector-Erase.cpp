#include<bits/stdc++.h>
using namespace std;

int main()
{
    vector <int> v;
    int n, queryType, a, b, data;
 
    cin >> n;
    for(int i = 0 ; i < n ; i++) cin >> data , v.push_back(data);
    
    cin >> a;
    v.erase(v.begin() + a - 1);
 
    cin >> a >> b;
    v.erase(v.begin() + a - 1, v.begin()  + b - 1);
    cout << v.size() << endl ;
    for(auto ir = v.begin() ; ir != v.end() ; ir++) cout << *ir << " ";

    return 0;
}