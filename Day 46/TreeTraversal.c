#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *right,*left;
};
struct node *insert(struct node *,int);
void Inorder(struct node *);
void Preorder(struct node *root);
void Postorder(struct node *root);
void main()
{
    struct node *root=NULL;
    int opn,elem,n,i;
    do
    {
        printf("\n1.Insert");
        printf("\n2.Inorder");
        printf("\n3.Preorder");
        printf("\n4.Postorder");
        printf("\n5.Exit\n");
        printf("\n Enter your choice:");
        scanf("%d",&opn);
        switch(opn)
        {
            case 1:
            root=NULL;
            printf("\nHow many node:");
            scanf("%d",&n);
            for(i=0;i<n;i++)
            {
             printf("\nRead the data for Node %d:",i);
             scanf("%d",&elem);   
             root=insert(root,elem);
            }
            printf("\nNo.of Nodes:%d\n",n);
            break;
            case 2:
            printf("\nInorder\n");
            Inorder(root);
            break;
            case 3:
            printf("\nPreorder\n");
            Preorder(root);
            break;
            case 4:
            printf("\nPostorder\n");
            Postorder(root);
            break;
            case 5:
            exit(0);
            default:
            printf("\n!!Wrong Choice");
        }
        printf("\nPress a key to continue...");
        getch();
    }while(opn!=5);
}    
struct node *insert(struct node *root,int elem)
{
    if(root==NULL)
    {
        root=(struct node *)malloc(sizeof(struct node));
        root->left=root->right=NULL;
        root->data=elem;
        return root;
    }
    else 
    {
        if(elem<root->data)
        {
            root->left=insert(root->left,elem);
        }
        else if(elem>root->data)
        {
              root->right=insert(root->right,elem);
        }
        else
        {
            printf("Duplicate Element !! Not Allowed!");
        }
        return(root);
    }
}    
void Inorder(struct node *root)
{
    if(root!=NULL)
    {
        Inorder(root->left);
        printf("%d ",root->data);
        Inorder(root->right);
    }
}   
void Preorder(struct node *root)
{
    if(root!=NULL)
    {
      printf(" %d ",root->data);
      Preorder(root->left);
      Preorder(root->right);
    }
}
void Postorder(struct node *root)
{
    if(root!=NULL)
    {
      Postorder(root->left);
      Postorder(root->right);
      printf(" %d ",root->data);
    }
}    
        
