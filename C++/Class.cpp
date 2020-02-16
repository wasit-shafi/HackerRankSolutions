#include <sstream>
#include <iostream>
using namespace std;

class Student
{
    int age, standard;
    string firstName, lastName;
    public:
    void setAge(int age)
    {
        this->age = age;
    }
    void setFirstName(string firstName)
    {
        this->firstName = firstName;
    }
    void setLastName(string lastName)
    {
        this->lastName = lastName;
    }
    void setStandard(int standard)
    {
        this->standard = standard;
    }
    int getAge()
    {
        return age;
    }
    string getFirstName()
    {
        return firstName;
    }
    string getLastName()
    {
        return lastName;
    }
    int getStandard()
    {
        return standard;
    }
    string to_string()
    {
       char c = ',';
       stringstream ss;
       
       ss << age << c << firstName << c << lastName << c << standard;
       return ss.str();
    }
};

int main()
{
    Student st;
    int age, standard;
    string firstName, lastName;
    
    cin >> age >> firstName >> lastName >> standard;
    
    st.setAge(age);
    st.setStandard(standard);
    st.setFirstName(firstName);
    st.setLastName(lastName);
    
    cout << st.getAge() << "\n";
    cout << st.getLastName() << ", " << st.getFirstName() << "\n";
    cout << st.getStandard() << "\n";
    cout << "\n";
    cout << st.to_string();   
    return 0;
}
