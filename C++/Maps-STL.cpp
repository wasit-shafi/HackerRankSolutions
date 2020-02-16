#include<map>
#include <iostream>
using namespace std;

int main()
{
    string name;
    int n, type, marks;
    map<string, int> m;
    map<string, int>::iterator itr;

    cin >> n;
    for(int i = 1 ; i <= n ; i++)
    {
        cin >> type;
        if(type == 1)
        {            
            cin >> name >> marks;
            itr = m.find(name);
            if(itr != m.end()) // if already stored marks
                itr->second = itr->second + marks;    
            else
                 m.insert(make_pair(name, marks));
        }
        else if(type == 2)
            cin >> name, m.erase(name);
        else
        {
            cin >> name;
            itr = m.find(name);
            if(itr != m.end())
                cout << itr->second;
            else
                cout << "0";
            
            if(i != n) cout << "\n";
        }
    }
    return 0;
}