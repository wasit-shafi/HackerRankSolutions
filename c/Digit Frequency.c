#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{ 
  int i, count_0, count_1, count_2, count_3, count_4, count_5, count_6, count_7, count_8, count_9;
    
 count_0 = count_1 = count_2 = count_3 = count_4 = count_5 = count_6 = count_7 = count_8 = count_9  = 0;
    char str[1024];
    gets(str);
    
    i = 0;
    while(str[i])
    {
     switch(str[i])
     {
         case '0' : count_0++;
                 break;
         case '1' : count_1++;
                 break;
         case '2' : count_2++;
                 break;
         case '3' : count_3++;
                  break;
         case '4' : count_4++;
                 break;
         case '5' : count_5++;
                 break;
         case '6' : count_6++;
                 break;
         case '7' : count_7++;
                 break;
         case '8' : count_8++;
                 break;
         case '9' : count_9++;
                 break;
     }
        i++;
  }
    printf("%d %d %d %d %d %d %d %d %d %d", count_0, count_1, count_2, count_3, count_4, count_5, count_6, count_7, count_8, count_9);
}
