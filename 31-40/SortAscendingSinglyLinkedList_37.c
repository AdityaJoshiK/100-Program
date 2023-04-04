#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *link;
};

void print(struct node *head)
{
    struct node *n=head;
    while (n!=NULL)
    {
        printf("%d ",n->data);
        n=n->link;
    }
    printf("\n");
}

struct node *sort(struct node *head)
{
    int temp=0;
    struct node* i;
    struct node* j;
    struct node* min;

    for (i = head; i->link!=NULL; i=i->link)
    {
        min=i;
        for (j = i->link; j !=NULL; j=j->link)
        {
            if (j->data<min->data)
            {
                min=j;
            }
        }
        temp=i->data;
        i->data=min->data;
        min->data=temp;
       
    }

    return head;
    
}
 
void main()
{
    struct node *head;

    struct node *first=(struct node*)malloc(sizeof(struct node));
    struct node *second=(struct node*)malloc(sizeof(struct node));
    struct node *third=(struct node*)malloc(sizeof(struct node));
    struct node *fourth=(struct node*)malloc(sizeof(struct node));

    first->data=49;
    first->link=second;

    second->data=200;
    second->link=third;

    third->data=8;
    third->link=fourth;

    fourth->data=10;
    fourth->link=NULL;

    head=first;

    print(head);
    sort(head);
    print(head);
}