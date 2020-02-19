#include<vector>
bool has_cycle(Node* head)
{
    vector<Node*> v;
    if( head == NULL)
        return false;
    else
    {
        Node* cur = head;
        int count = 0;
        //push each traversing element into vector and search its frequency if frequency is not 1 one then there exists a cycle
        while(cur)
        {
            count = 0;
            v.push_back(cur);
            for(auto ir = v.begin() ; ir != v.end() ; ir++)
            {
                if(*ir == cur)
                {
                  count++;
                  if(count == 2) return true;
                }
            }
            cur = cur->next;
        }
        return false;
    }
}