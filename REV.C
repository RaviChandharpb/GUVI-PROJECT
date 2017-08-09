#include <stdio.h>
int main()
{
    int num, result = 0, left;
    clrscr();
    printf("Enter an positive integer: ");
    scanf("%d", &num);
if(num >0)
{
    while(num != 0)
    {
	left = num%10;
	result = result*10 + left;
	num  /= 10;
    }
printf("Reverse of the number = %d", result);
}
else
{
printf("Kindly give positive integer");
}


getch();
    return 0;
}