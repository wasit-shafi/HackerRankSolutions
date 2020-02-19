#include<bits/stdc++.h>
using namespace std;

string isBalanced(string s)
{
    int len;
    stack<char> stk;

    len = s.size();
    for(int i = 0 ; i < len ; i++)
    {
        if(s[i] == '{' || s[i] == '[' || s[i] == '(')
            stk.push(s[i]);
        else
        {
            if(stk.size() == 0)
             return "NO";
            else
            {
              switch(s[i])
              {
                  case '}': if(stk.top() != '{') return "NO"; else stk.pop();
                           break;
                  case ']':if(stk.top() != '[') return "NO"; else stk.pop();;
                           break;
                  case ')':if(stk.top() != '(') return "NO"; else stk.pop();;
                           break;
              }
            }
        }
    }
    if(stk.size() == 0)
        return "YES";
    else
        return "NO";
}
int main()
{
    int t;
    string s;

    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');
    
    while(t--)
    {
        cin >> s;
        cout << isBalanced(s) << "\n";
    }
    return 0;
}