#include<stdio.h>

int factor(int n)
{
    int i=0;

    if (n%i==0 && n>0)
    {
        return n;    
        i++;
    }
    
    factor(n-1);
}
 
void main()
{
    int n;

    printf("Enter n:");
    scanf("%d",&n);

    for (int i = 1; i <=n; i++)
    {
            factor(i);
        
    }
    
    
}