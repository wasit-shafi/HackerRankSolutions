#include<bits/stdc++.h>

using namespace std;

class Box{
    int l, b, h;

    public:
    Box() { l = b = h = 0; }

    Box(int l, int b, int h)
    {
        this->l = l;
        this->b = b;
        this->h = h;
    }

    Box(Box& box)
    {
        this->l = box.l;
        this->b = box.b;
        this->h = box.h;
    }

    int getLength()  { return l; }
    int getBreadth() { return b; }
    int getHeight()  { return h; }
    long long int CalculateVolume()
    {
        return (long  long int)l * b * h;//Here we must do typecasting to LLI otherwise overflow can occur with integer multiplication (Suggested by Arjun to me on 12-10-19 what actually happens when we do multiplication .)
    }
    bool operator<(Box& box)
    {
        if (l < box.l)
             return true;
        else if(b < box.b && l == box.l)
            return true;
        else if(h < box.h && b == box.b && l == box.l)
            return true;
        else 
            return false;
    }
    friend ostream& operator <<(ostream&, Box);
};
    ostream& operator <<(ostream& out, Box box)
    {
        cout << box.l << " " << box.b << " " << box.h;
        return out;
    } 


void check2()
{
	int n;
	cin>>n;
	Box temp;
	for(int i=0;i<n;i++)
	{
		int type;
		cin>>type;
		if(type ==1)
		{
			cout<<temp<<endl;
		}
		if(type == 2)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			temp=NewBox;
			cout<<temp<<endl;
		}
		if(type==3)
		{
			int l,b,h;
			cin>>l>>b>>h;
			Box NewBox(l,b,h);
			if(NewBox<temp)
			{
				cout<<"Lesser\n";
			}
			else
			{
				cout<<"Greater\n";
			}
		}
		if(type==4)
		{
			cout<<temp.CalculateVolume()<<endl;
		}
		if(type==5)
		{
			Box NewBox(temp);
			cout<<NewBox<<endl;
		}

	}
}

int main()
{
	check2();
}