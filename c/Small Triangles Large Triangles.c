#include <stdio.h>
#include <stdlib.h>
#include <math.h>

struct triangle
{
	int a;
	int b;
	int c;
};

typedef struct triangle triangle;

void sort_by_area(triangle* tr, int n)
{
    double area[n], p; // area can be in real
    int a, b, c;       // its is given the sides are integer rather than real numbers

    for(int i = 0 ; i < n ; i++)
    {
        a = tr[i].a;
        b = tr[i].b;
        c = tr[i].c;
        p = (double)(a + b + c)/2;
        area[i] = sqrt(p * (p - a) * (p - b) * (p - c));
    }

    for(int i = 0 ; i < n - 1; i++)
    {
        for(int j = 0 ;  j < n - i - 1 ; j++)
        {
            if(area[j] > area[j + 1])// It will not try to swap element at same index
            {            
                area[j] = area[j] + area[ j + 1];
                area[j + 1] = area[j] - area[ j + 1];
                area[j] = area[j] - area[ j + 1];

                tr[j].a = tr[j].a + tr[ j + 1].a;
                tr[j + 1].a =  tr[j].a - tr[ j + 1].a;
                tr[j].a =  tr[j].a - tr[ j + 1].a;

                tr[j].b = tr[j].b + tr[ j + 1].b;
                tr[j + 1].b =  tr[j].b - tr[ j + 1].b;
                tr[j].b =  tr[j].b - tr[ j + 1].b;

                tr[j].c = tr[j].c + tr[ j + 1].c;
                tr[j + 1].c =  tr[j].c - tr[ j + 1].c;
                tr[j].c =  tr[j].c - tr[ j + 1].c;
            }
        }
    }
}

int main()
{
	int n;
	scanf("%d", &n);
	triangle *tr = malloc(n * sizeof(triangle));
	for (int i = 0; i < n; i++) {
		scanf("%d%d%d", &tr[i].a, &tr[i].b, &tr[i].c);
	}
	sort_by_area(tr, n);
	for (int i = 0; i < n; i++) {
		printf("%d %d %d\n", tr[i].a, tr[i].b, tr[i].c);
	}
	return 0;
}