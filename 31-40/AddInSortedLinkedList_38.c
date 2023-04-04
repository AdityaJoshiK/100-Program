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

struct node* add(struct node *head)
{
    //10 20 35 48
    //25
    struct node *t=head->link;
    struct node *s=head;;
    struct node *new=(struct node *)malloc(sizeof(struct node));

    printf("Enter Data:");
    scanf("%d",&new->data);

    if (new->data<head->data)
    {
        new->link=head;
        return head;
    }

    while (t!=NULL)
    {
        if (t->data>new->data)
        {
            s->link=new;
            new->link=t;
            return head;
        }
        
        t=t->link;
        s=s->link;
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

    first->data=180;
    first->link=second;

    second->data=890;
    second->link=third;

    third->data=1120;
    third->link=fourth;

    fourth->data=4500;
    fourth->link=NULL;

    head=first;

    print(head);
    head=add(head);
    print(head);

}