#include <bits/stdc++.h>
using namespace std;

void insertionSort1(int n, vector<int> arr)
{
    int i, j, lastElement = arr[n - 1];
 
    for(i = n - 2; i >= 0 ; i--)
    {
        if(arr[i] > lastElement)
            arr[i + 1] = arr[i];
        else
        {
            arr[i + 1] = lastElement;
            break;
        }
        for(j = 0 ; j < n ; j++) cout << arr[j] << " ";
        cout << "\n";
    }
    // it has reached to before 0 index so put arr[0] = lastElement : ref. test case no 4
    if(i == -1)
    arr[0] = lastElement;
    for(j = 0 ; j < n; j++) cout << arr[j] << " ";
}
int main()
{
    int n, item;
    vector<int>arr;

    cin >> n;
    for (int i = 0; i < n ; i++)
    {
        cin >> item;
        arr.push_back(item);
    }
    insertionSort1(n, arr);
    return 0;
}