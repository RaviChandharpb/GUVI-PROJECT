#include<stdio.h>
#include<conio.h>
long int fact(int n);

int main()
{
    int n;
    clrscr();
    printf("Calcualting factorial using recursive functions\n");
    printf("Enter a positive integer: ");
    scanf("%d", &n);
	if(n>=0)
{
    printf("%d! = %ld", n, fact(n));
}
else
{
printf("The entered number is not positive integer");
}
    getch();
    return 0;
}
long int fact(int n)
{
    if (n >= 1)
	return n*fact(n-1);
    else
	return 1;
}