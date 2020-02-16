#include<vector>
#include<iostream>
using namespace std;

int main()
{
    vector <long int> temp;
    vector <vector<long int>> matrix;
    int lengthOfArray, noOfQueries, noOfArrays, i, x, y, data;
    
    cin >> noOfArrays >> noOfQueries;
    for(i = 0 ; i < noOfArrays ; i++)
    {
        cin >> lengthOfArray;
        for(long int j = 0 ; j < lengthOfArray ; j++) cin >> data, temp.push_back(data);
        matrix.push_back(temp);
        temp.clear();
    }

    for(i = 0 ; i < noOfQueries ; i++) cin >> x >> y, cout << matrix[x][y] << "\n";
    return 0;
}