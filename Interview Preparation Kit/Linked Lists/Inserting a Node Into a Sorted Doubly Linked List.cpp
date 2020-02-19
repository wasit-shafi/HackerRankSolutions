#include <bits/stdc++.h>

using namespace std;

class DoublyLinkedListNode {
    public:
        int data;
        DoublyLinkedListNode *next;
        DoublyLinkedListNode *prev;

        DoublyLinkedListNode(int node_data) {
            this->data = node_data;
            this->next = nullptr;
            this->prev = nullptr;
        }
};

class DoublyLinkedList {
    public:
        DoublyLinkedListNode *head;
        DoublyLinkedListNode *tail;

        DoublyLinkedList() {
            this->head = nullptr;
            this->tail = nullptr;
        }

        void insert_node(int node_data) {
            DoublyLinkedListNode* node = new DoublyLinkedListNode(node_data);

            if (!this->head) {
                this->head = node;
            } else {
                this->tail->next = node;
                node->prev = this->tail;
            }

            this->tail = node;
        }
};

void print_doubly_linked_list(DoublyLinkedListNode* node, string sep, ofstream& fout) {
    while (node) {
        fout << node->data;

        node = node->next;

        if (node) {
            fout << sep;
        }
    }
}

void free_doubly_linked_list(DoublyLinkedListNode* node) {
    while (node) {
        DoublyLinkedListNode* temp = node;
        node = node->next;

        free(temp);
    }
}
DoublyLinkedListNode* sortedInsert(DoublyLinkedListNode* head, int data)
{    
    DoublyLinkedListNode *newNode = new DoublyLinkedListNode(data);
    if(head == NULL)
    {
        head = newNode;
    }
    else
    {
        if(newNode->data <= head->data)//if we have to insert it just as first node
        {
            head->prev = newNode;
            newNode->next = head;
            head = newNode;
        }
        else// now we are 100% sure the newNode is never going to be inserted as a first node i.e: the possible position for newnode starts from 2nd node so we have to traverse the list to find the accurate position for newNode
        {
            DoublyLinkedListNode *cur = head;
            while(cur->next != NULL && cur->data < newNode->data)
            {
                cur = cur->next;
            }   
            //suppose we reached the end of the list 
            if(cur->next == NULL)
            {
             // CTM : In case current reached node is last node in that situation we does''t know which of the above condition(in while loop) has occured ie: 1) either we have reached the last node so now we have to insert the newNode after the last node 2) the current node is having data which is greater than the newNode->data and the current node is also the last node in the list so we have to insert the newNode before the last node
             // In simple terms the above condition(in while loop) can be fase either because of data part or because of null(if cur->next == NULL) of both can occur at the same time
             // Now we may have to insert the node either before or after the last node because of the sorting order
                if(cur->data <= newNode->data)
                {
                    newNode->prev = cur;
                    cur->next = newNode;
                }
                else
                {
                    newNode->next = cur;
                    newNode->prev = cur->prev;
                    cur->prev->next = newNode;
                    cur->prev = newNode;
                }
            }
            else // if it is middle node then we are 100 sure that now we have to insert the newNode before the current node. i.e: There is possibility of inserting the newNode after the current node in case we stopped at middle node as we know the sorting condtion has made to terminate the while loop
            {
                newNode->next = cur;
                newNode->prev = cur->prev;
                cur->prev->next = newNode;
                cur->prev = newNode;
            }
        }
    }
    return head;
}
int main()
{
    ofstream fout(getenv("OUTPUT_PATH"));

    int t;
    cin >> t;
    cin.ignore(numeric_limits<streamsize>::max(), '\n');

    for (int t_itr = 0; t_itr < t; t_itr++) {
        DoublyLinkedList* llist = new DoublyLinkedList();

        int llist_count;
        cin >> llist_count;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        for (int i = 0; i < llist_count; i++) {
            int llist_item;
            cin >> llist_item;
            cin.ignore(numeric_limits<streamsize>::max(), '\n');

            llist->insert_node(llist_item);
        }

        int data;
        cin >> data;
        cin.ignore(numeric_limits<streamsize>::max(), '\n');

        DoublyLinkedListNode* llist1 = sortedInsert(llist->head, data);

        print_doubly_linked_list(llist1, " ", fout);
        fout << "\n";

        free_doubly_linked_list(llist1);
    }

    fout.close();

    return 0;
}