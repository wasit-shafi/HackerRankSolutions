//time_conversion.c
//
//programe to convert regular time into military time
//
#include<stdio.h>
#include<stdlib.h>
#include<string.h>

int main()
{
    int h, m, s;
    int i, j;
    char time[15];
    char hh[3] , mm[3], ss[3], am_pm[3];
    
    scanf("%s", time);
    hh[0] = time[0];
    hh[1] = time[1];
    hh[2] = '\0';
    h = atoi(hh);
    
    mm[0] = time[3];
    mm[1] = time[4];
    mm[2] = '\0';

    ss[0] = time[6];
    ss[1] = time[7];
    ss[2] = '\0';
    
    am_pm[0] = time[8];
    am_pm[1] = time[9];
    am_pm[2] = '\0';
    
    if(!strcmp(am_pm, "AM"))
    {
      if(h == 12)
         printf("00:%s:%s",mm, ss);  
      else
         printf("%s:%s:%s", hh,mm,ss);       
    }
    else if(!strcmp(am_pm, "PM"))
    {
      if(h == 12)
         printf("%s:%s:%s", hh, mm, ss);
      else
        printf("%d:%s:%s", h + 12 ,mm, ss);
    }
    return 0;
}