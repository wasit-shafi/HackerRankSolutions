#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
    char ch;
    int numi;
    long numl;
    float numf;
    double numd;
    
    cin >> numi >> numl >> ch >> numf >> numd;

    // CTM : "\n" is faster than 'endl' manipulator
    cout << numi << "\n" << numl << "\n" << ch << "\n" << fixed << setprecision(3) << numf << "\n" << fixed << setprecision(9) << numd;
    return 0;
}
