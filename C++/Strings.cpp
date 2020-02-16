#include <iostream>
using namespace std;

int main()
{
	string s1, s2, s3;

    cin >> s1 >> s2;
    s3 = s1 + s2;
    char c = s1[0];
    s1[0] = s2[0];
    s2[0] = c;

    cout << s1.size() << " " << s2.size()  << "\n" << s3 << "\n" << s1 << " " << s2;
    return 0;
 }