#include<iostream>
#include<vector>

using namespace std;

int main()
{
    vector<int> arr;
    int n, noOfQueries, item;    
    vector<int>::iterator itr;

    cin >> n;
    for(int i = 1 ; i <= n ; i++) cin >> item, arr.push_back(item);

    cin >> noOfQueries;
    for(int i = 1 ; i <= noOfQueries ; i++)
    {
        cin >> item;
        itr = lower_bound(arr.begin(), arr.end(), item);
        if(*itr == item)
            cout << "Yes ";
        else
            cout << "No ";
        cout << itr - arr.begin() + 1;
        if(i != noOfQueries) cout << "\n";
    }
    return 0;
}