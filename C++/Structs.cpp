#include<iostream>
using namespace std;

struct Student
{
    int age;
    string firstName, lastName, standard;
};

int main()
{
    Student st;

    cin >> st.age >> st.firstName >> st.lastName >> st.standard;
    cout << st.age << " " << st.firstName << " " << st.lastName << " " << st.standard;
    
    return 0;
}