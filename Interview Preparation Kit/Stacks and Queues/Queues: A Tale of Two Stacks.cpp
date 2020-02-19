#include<bits/stdc++.h>
using namespace std;

class MyQueue
{
    //CTM: Push always new element to 'newStack' and pop/front always from 'oldStack' 
    public:
        stack<int> newStack, oldStack;   
        void push(int x)
        {
            newStack.push(x);
        }
        void pop()
        {
            if(!oldStack.size())
                while(newStack.size())
                {
                       oldStack.push(newStack.top());
                       newStack.pop();
                }
            oldStack.pop();
        }
        int front()
        {    
            if(!oldStack.size())
                while(newStack.size())
                {
                    oldStack.push(newStack.top());
                    newStack.pop();
                }
            return oldStack.top();        
        }
};
int main()
{
    MyQueue q1;
    int q, type, x;

    cin >> q;
    for(int i = 0; i < q; i++)
    {
        cin >> type;
        if(type == 1) cin >> x, q1.push(x);
        else if(type == 2) q1.pop();
        else cout << q1.front() << endl;
    }
    return 0;
}
