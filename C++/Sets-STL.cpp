#include<set>
#include<iostream>
using namespace std;

int main()
{
    set<int> s;
    int n, type, item;

    cin >> n;
    while(n--)
    {
        cin >> type;
        if( type == 1)
        {
            cin >> item;
            s.insert(item);
        }
        else if(type == 2)
        {
            cin >> item;
            set <int>::iterator ir = s.find(item);

            if(ir != s.end()) s.erase(item);      
        }
        else if(type == 3)
        {
            cin >> item;
            set <int>::iterator ir = s.find(item);
            cout << (s.find(item) == s.end() ? "No" : "Yes") << endl;
        }
    }
    return 0;
}