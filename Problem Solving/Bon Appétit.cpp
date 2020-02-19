#include <bits/stdc++.h>
using namespace std;

void bonAppetit(vector<int> bill, int k, int b)
{
    int sum = 0;

    for(int i = 0 ; i < bill.size() ; i++)
        if(i == k) continue;
        else sum += bill[i];

    if(sum / 2 == b)
        cout << "Bon Appetit";
    else
        cout << b - (sum / 2);
}
int main()
{
    vector<int> bill;
    int n, k, b, item;

    cin >> n >> k;
    while(n--)
    {
        cin >> item;
        bill.push_back(item);
    }
    cin >> b;   
    bonAppetit(bill, k, b);
    return 0;
}