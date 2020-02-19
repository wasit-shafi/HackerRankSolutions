#include <bits/stdc++.h>
using namespace std;

int hourglassSum(vector<vector<int>> arr)
{
    //Total possible hour glasses is(r-2)*(c-2)
    int maxHourGlassSum = INT_MIN, hourGlassSum;
    for(int i = 0 ; i < 6 ; i++)
    {
        for (int j = 0 ; j < 6 ; j++)
        {
            if(i  < 6 - 2 && j < 6 -2)
            {
                hourGlassSum = arr[i][j] + arr[i][j + 1]+ arr[i][j + 2]+ arr[i + 1][j + 1]+ arr[i + 2][j]+ arr[i + 2][j + 1]+ arr[i +2][j + 2];
                if(hourGlassSum > maxHourGlassSum)
                    maxHourGlassSum = hourGlassSum;
            }
        }
    }
    return maxHourGlassSum;
}

int main()
{
    int data, j;
    vector<int>row;
    vector<vector<int>>arr;

    for(int i = 0 ; i < 6 ; i++)
    {
        for(j = 0 ; j < 6 ; j++)
        {
            cin >> data;
            row.push_back(data);
        }
        arr.push_back(row);
        row.clear();
    }
    cout << hourglassSum(arr);
    return 0;
}