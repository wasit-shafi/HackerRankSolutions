#include<bits/stdc++.h>
using namespace std;

vector<int> permutationEquation(vector<int> p, int n)
{
    vector<int> result;
    for(int y = 1 ; y <= n ; y++)
        for(int i = 0 ; i < n ; i++)
            if(p[p[i] - 1] == y)
            {
                result.push_back(i + 1);
                break;
            }
    return result;
}
int main()
{
    int n, item;
    vector<int> p;

    cin >> n;
    for(int i = 0 ; i < n ; i++)
    {
        cin >> item;
        p.push_back(item);
    }
    vector<int> result = permutationEquation(p, n);
    n = result.size();
    for(int i = 0 ; i < n ; i++) cout << result[i] << "\n";
    return 0;
}