#include <bits/stdc++.h> 
using namespace std;
int main() 
{ 
	vector<int> v{50, 40, 30, 20, 10}; 
	vector<int>::iterator lower1, lower2, lower3, lower4, lower5; 

	cout << "Vector contains :"; 
	for (int i = 0; i < v.size(); i++)  cout << " " << v[i]; 

	lower1 = lower_bound(v.begin(), v.end(), 200, greater<int>()); 
	lower2 = lower_bound(v.begin(), v.end(), 40, greater<int>()); 
	lower3 = lower_bound(v.begin(), v.end(), 35, greater<int>()); 
	lower4 = lower_bound(v.begin(), v.end(), 25, greater<int>()); 
	lower5 = lower_bound(v.begin(), v.end(), 5, greater<int>()); 

    cout << endl;
	cout << "lower_bound(200): " << lower1 - v.begin() + 1 << endl;
	cout << "lower_bound(40) : " << lower2 - v.begin() + 1<< endl;
    cout << "lower_bound(35) : " << lower3 - v.begin() + 1<< endl;
    cout << "lower_bound(25) : " << lower4 - v.begin() + 1<< endl;
    cout << "lower_bound(5)  : " << lower5 - v.begin() + 1<< endl;
    
	return 0;
}