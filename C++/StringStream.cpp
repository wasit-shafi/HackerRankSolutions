#include <vector>
#include <sstream>
#include <iostream>
using namespace std;

vector<int> parseInts(string str)
{
    char ch;
    int intData;
    vector <int> v;
    stringstream ss(str);
    
    while(!ss.eof()) ss >> intData >> ch, v.push_back(intData);
    return v;
}

int main() {
    string str;
    
    cin >> str;
    vector<int> integers = parseInts(str);

    for(int i = 0; i < integers.size(); i++) cout << integers[i] << "\n";
    return 0;
}