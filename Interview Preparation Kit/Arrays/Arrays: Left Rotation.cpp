#include <bits/stdc++.h>
using namespace std;

vector<int> rotateLeft(vector<int> a, int n, int d)
{
    int temp, i, j;
    for(i = 0, j = d - 1 ; i < j ; i++, j--)
    {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    for(i = d, j = n - 1 ; i < j ; i++, j--)
    {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    for( i = 0, j = n - 1 ; i < j ; i++, j--)
    {
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    return a;
}
int main()
{
    vector<int> a;
    int n, d, item;

    cin >> n >> d;
    for(int i = 0 ; i < n ; i++)
    {
        cin >> item;
        a.push_back(item);
    }

    vector<int> result = rotateLeft(a, n, d);
    for(int i = 0 ; i < n ; i++) cout << result[i] << " ";
    return 0;
}