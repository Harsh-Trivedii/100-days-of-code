/* circular singly linked list insertion and deletion */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
}*head,*temp;

void createlist(int);
void display();
void insertatbeg();
void insertatend();
void deleteatbeg();
void deleteatend();

void main()
{
	int n;
	printf("Enter how many nodes you want to enter:");
	scanf("%d",&n);
	
	createlist(n);
	display();
	
	insertatbeg();
	display();
	
	insertatend();
	display();
	
	deleteatbeg();
	display();
	
	deleteatend();
	display();
	
	getch();
}


void createlist(int n)
{
	int i,data;
	struct node *newnode;
	head=(struct node *)malloc(sizeof(struct node));
	if(head==NULL)
	{
		printf("\nUnable to allocate memory");
	}
	else
	{
		printf("\nEnter data of node 1:");
		scanf("%d",&data);
		head->data=data;
		head->next=head;
	    temp=head;
		for(i=2;i<=n;i++)
		{
			newnode=(struct node *)malloc(sizeof(struct node));
			if(newnode==NULL)
			{
				printf("\nUnable to allocate memory");
			}
			else
			{
				printf("\nEnter data of node %d:",i);
				scanf("%d",&data);
				newnode->data=data;
				newnode->next=head;
				temp->next=newnode;
				temp=temp->next;
			}
		}
	}
}

void display()
{
	if(head==NULL)
	{
		printf("\nList is empty");
	}
	else{
		temp=head;
		printf("\nData in the list:");
		while(temp->next!=head)
		{
			printf("\n%d",temp->data);
			temp=temp->next;
		}
		printf("\n%d",temp->data);
	}
}


void insertatbeg()
{
	int data;
	struct node *newnode;
	newnode=(struct node *)malloc(sizeof(struct node));
	if(newnode==NULL)
	{
		printf("\nUnable to allocate memory");
	}
	else{
		printf("\nEnter data of new node:");
		scanf("%d",&data);
		newnode->data=data;
		newnode->next=head;
		temp=head;
		while(temp->next!=head)
		{
			temp=temp->next;
		}
		temp->next=newnode;
		head=newnode;
	}
}


void insertatend()
{
	int data;
	struct node *newnode;
	newnode=(struct node *)malloc(sizeof(struct node));
	if(newnode==NULL)
	{
		printf("\nUnable to allocate memory");
	}
	else{
		printf("\nEnter data of new node:");
		scanf("%d",&data);
		newnode->data=data;
		temp=head;
		while(temp->next!=head)
		{
			temp=temp->next;
		}
		temp->next=newnode;
		newnode->next=head;
	}
}


void deleteatbeg()
{
	struct node *t;
	if(head==NULL)
	{
		printf("\nList is empty");
	}
	else
	{
		t=temp=head;
		while(temp->next!=head)
		{
			temp=temp->next;
		}
		head=t->next;
		temp->next=head;
		printf("\nData to be deleted:%d",t->data);
		free(t);
	}
}


void deleteatend()
{
	struct node *t;
	if(head==NULL)
	{
		printf("\nList is empty");
	}
	else
	{
		temp=head;
		while(temp->next!=head)
		{
			t=temp;
			temp=temp->next;
		}
		t->next=temp->next;
		printf("\nData to be deleted:%d",temp->data);
		free(temp);
	}
}
