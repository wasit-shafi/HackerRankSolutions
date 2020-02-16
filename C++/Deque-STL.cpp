#include <deque> 
#include <iostream>

using namespace std;
//Refer : https://algorithms.tutorialhorizon.com/sliding-window-algorithm-track-the-maximum-of-each-subarray-of-size-k/

void printKMax(int arr[], int n, int k)
{
    int i;
    deque<int> dq;

    for(i = 0 ; i < k ; i++)
    {
        while(!dq.empty() && arr[i] >= arr[dq.back()]) dq.pop_back();
        dq.push_back(i);
    }
    //CTM : front of deque will always store the index of maximum element.
    for(; i < n ; i++)
    {
        cout << arr[dq.front()] << " ";
        while(!dq.empty() && dq.front() <=  i - k)     // remove invalid indexes
            dq.pop_front();
        while(!dq.empty() && arr[i] >= arr[dq.back()]) // make remove minimum elements.
            dq.pop_back();
        dq.push_back(i);
    }
    cout << arr[dq.front()] << endl; // print the max of last sublist
}

int main()
{
    int t, n, k, i;
    
    cin >> t;
    while(t--)
    {
        cin >> n >> k;
        int arr[n];
        for(i = 0 ; i < n ; i++) cin >> arr[i];
        printKMax(arr, n, k);
    }
    return 0;
}