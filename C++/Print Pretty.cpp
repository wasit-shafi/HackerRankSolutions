#include <iostream>
#include <iomanip> 
using namespace std;

int main() {
	int T; cin >> T;
	cout << setiosflags(ios::uppercase);
	cout << setw(0xf) << internal;
	while(T--) {
		double A; cin >> A;
		double B; cin >> B;
		double C; cin >> C;

        // since double takes 8 bytes so we have to typecase it for 8 bytes i.e.(long) instead of (int) which is for only 4 bytes (int) would be best option incase for float values
        cout << hex << showbase << nouppercase << left << (long)A << endl; 
        cout << setw(15) <<  setfill('_') << fixed << setprecision(2) << right << showpos << B << endl; 
        cout << scientific << setprecision(9) << noshowpos << uppercase << C << endl;  
	}
	return 0;

}