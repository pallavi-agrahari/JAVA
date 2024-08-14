
#include <stdio.h>
#include<string.h>

int main ()
{
char c1[]= "BANGALORE";
char c2[]="MUMBAI";
char c3[] ="HYDERABAD";
char c4[]="DELHI";
char c5[]= "CHENNAI";
char *names[]={c1, c2, c3, c4, c5};
int i = 0;
char *p = NULL;
p = names[1];
printf ("%s %c %s %c\n", p, p[2], names[3], names[1][5]);
return 0;
}