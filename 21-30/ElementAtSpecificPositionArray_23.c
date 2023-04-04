#include<stdio.h>
 
//baki
void main()
{
    int a[10]={1,2,3,4,5};
    int p,j=0,e,temp=0;

    printf("Enter Position To Insert:");
    scanf("%d",&p);

    printf("Enter Element To Insert:");
    scanf("%d",&e);

    for (int i = 0; i < 10; i++)
    {
        if (p==i+1)
        { 
            j=i+1;
            temp=a[j-1];
            while (j<9)
            {
                printf("%d",temp);
                a[j]=temp;
                temp=a[j+1];
                a[j+1]=a[j];
                j++;
            }
            a[i]=e;
        }
    }

    printf("\n");
    for (int i = 0; i < 10; i++)
    {
        printf("%d ",a[i]);
    }
}