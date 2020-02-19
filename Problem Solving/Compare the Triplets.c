#include <stdio.h>

int main()
{
    int i, *alice, *bob, alice_score = 0, bob_score = 0;
    
    alice =(int *)malloc(3 * sizeof(int));
    bob = (int *)malloc(3 * sizeof(int));
    
    for(i = 0 ; i < 3 ; i++) scanf("%d" , &alice[i]);
    for(i = 0 ; i < 3 ; i++) scanf("%d" , &bob[i]);

    for(i = 0 ; i < 3 ; i++)
    {
        if(alice[i] > bob[i])
            alice_score++;
        else if(bob[i] > alice[i])
            bob_score++;
    }
    printf("%d %d", alice_score, bob_score);
    free(alice);
    free(bob);
    return 0;
}