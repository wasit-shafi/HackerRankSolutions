#include <bits/stdc++.h>
using namespace std;

vector<int> gradingStudents(vector<int> grades)
{
    vector<int> finalGrades;
    for (int i = 0 ; i < grades.size() ; i++)
    {
        if(grades[i] < 38)
           finalGrades.push_back(grades[i]);
        else
        {
            int nextMultipleOf5 = grades[i];
            while(nextMultipleOf5 % 5) nextMultipleOf5++;
            if(nextMultipleOf5 - grades[i] < 3)
                finalGrades.push_back(nextMultipleOf5);
            else
                finalGrades.push_back(grades[i]);
        }
    }
    return finalGrades;
}

int main()
{
    int n, g;
    vector<int> grades;

    cin >> n;
    for(int i = 0 ; i < n ; i++)
    {
        cin >> g;
        grades.push_back(g);
    }
    vector<int> result = gradingStudents(grades);
    for (int i = 0; i < result.size(); i++) cout << result[i] << "\n";

    return 0;
}