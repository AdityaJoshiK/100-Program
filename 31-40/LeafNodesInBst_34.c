#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *left;
    struct node *right;
};

struct node *createNode(int data)
{
    struct node *root=(struct node*)malloc(sizeof(struct node));

    root->data=data;

    root->left=NULL;
    root->right=NULL;

    return root;
}

void print(struct node *root)
{
    if(root!=NULL)
    {
        print(root->left);
        if(root->left==NULL && root->right==NULL){
        printf("%d ",root->data);
        }
        print(root->right);
    }
}

void main()
{
            // 8
        //    / \
        //   6  10
        //  / \ / \
        // 3  7 9 12
    struct node *root=createNode(8);

    struct node *rootl=createNode(6);
    struct node *rootr=createNode(10);

    root->left=rootl;
    root->right=rootr;

    struct node *rootLl=createNode(3);
    struct node *rootLr=createNode(7);

    rootl->left=rootLl;
    rootl->right=rootLr;

    struct node *rootRl=createNode(9);
    struct node *rootRr=createNode(12);

    rootr->left=rootRl;
    rootr->right=rootRr;

    print(root);
}