#include <iostream>
using namespace std;

int main()
{   
    int *arr, n, i;
    
    cin >> n;
    arr = new int[n];   
    for(i = 0 ; i < n ; i++) cin >> arr[i];       
    for(i = n - 1 ; i >= 0 ; i--) cout << arr[i] << " ";
    delete(arr); // deallocates memory from heap
    return 0;
}