#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

class Person
{
    string name;
    int age;
    public:
    virtual void getdata()
    {
      cin.ignore(numeric_limits<streamsize>::max(), '\n');
      cin >> name;
      cin >> age;
    }
    virtual void putdata()
    {
      cout << name << " " << age;
    }
};

class Professor:public Person
{
    static int id;
    int publication;
    int cur_id;
    public:
    void getdata()
    {
        Person::getdata();
        cin >> publication;
        cur_id = ++id;
    }
    void putdata()
    {
        Person::putdata();
        cout << " " << publication << " " << cur_id << endl;
    }
};

class Student:public Person
{
    static int id;
    int marks[6], cur_id;
    public:
    void getdata()
    {
        Person::getdata();
        cin >> marks[0] >> marks[1] >> marks[2] >> marks[3] >> marks[4] >> marks[5];
        cur_id = ++id;
    }
    void putdata()
    {
        Person::putdata();
        cout << " " << marks[0] + marks[1] + marks[2] + marks[3] + marks[4] + marks[5] << " " << cur_id << endl;
    }
};
int Professor::id = 0;
int Student::id = 0;

int main(){

    int n, val;
    cin>>n; //The number of objects that is going to be created.
    Person *per[n];

    for(int i = 0;i < n;i++){

        cin>>val;
        if(val == 1){
            // If val is 1 current object is of type Professor
            per[i] = new Professor;

        }
        else per[i] = new Student; // Else the current object is of type Student

        per[i]->getdata(); // Get the data from the user.

    }

    for(int i=0;i<n;i++)
        per[i]->putdata(); // Print the required output for each object.

    return 0;

}
