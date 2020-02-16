#include <iostream>
using namespace std;

void update(int *a,int *b)
{
    int  sum = *a + *b;
    
    if( *a > *b) *b = *a - *b;
    else *b = *b - *a;
    *a = sum;
}
int main()
{
    int a, b;
    int *pa = &a, *pb = &b;
    
    cin >> a >> b;
    update(pa, pb);
    cout << a << "\n" << b;
    return 0;
}
