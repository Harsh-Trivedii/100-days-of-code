/* doubly linked list insertion at beg , mid and end */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node {
	int data;
	struct node *prev;
	struct node *next;
}*head,*temp;

void createlist(int);
void display();
void insertatbeg();
void insertatend();
void insertatmid();
int len();

void main()
{
	int n;
	printf("Enter how many nodes you want to enter:");
	scanf("%d",&n);
	createlist(n);
	
	printf("\nData in the list:");
	display();
	
	insertatbeg();
	printf("\nData in the list after insert at beg:");
	display();
	
	insertatend();
	printf("\nData in the list after insert at end:");
	display();
	
	insertatmid();
	printf("\nData in the list after insert at mid:");
	display();
	
	getch();
}



void createlist(int n)
{
	int data,i;
	struct node *newnode;
	head=(struct node *)malloc(sizeof(struct node));
	if(head==NULL)
	{
		printf("\nUnable to allocate memory");
	}
	else{
		printf("\nEnter data of node 1:");
		scanf("%d",&data);
		head->data=data;
		head->prev=NULL;
		head->next=NULL;
		temp=head;
		for(i=2;i<=n;i++)
		{
			newnode=(struct node *)malloc(sizeof(struct node));
			if(newnode==NULL)
			{
				printf("\nUnable to allocate memory");
			}
			else{
				printf("\nEnter data of node %d:",i);
				scanf("%d",&data);
				newnode->data=data;
				newnode->next=NULL;
				newnode->prev=temp;
				temp->next=newnode;
				temp=temp->next;
			}
		}
		printf("\nDoubly linked list created successfully.");
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
		while(temp!=NULL)
		{
			printf("\n%d",temp->data);
			temp=temp->next;
		}
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
		newnode->prev=NULL;
		newnode->next=head;
		head->prev=newnode;
		head=newnode;
	}
}


void insertatend()
{
	int data,i;
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
		newnode->next=NULL;
		temp=head;
		while(temp->next!=NULL)
		{
			temp=temp->next;
		}
		temp->next=newnode;
		newnode->prev=temp;
		temp=temp->next;
	}
}


int len()
{
	int c;
	if(head==NULL)
	{
		printf("\nList is empty");
	}
	else{
		temp=head;
		while(temp!=NULL)
		{
			temp=temp->next;
			c++;
		}
	}
	return c;
}

void insertatmid()
{
	int p,s,i,data;
	struct node *newnode;
	s=len();
	printf("\nEnter ur position:");
	scanf("%d",&p);
	if(p>s || p<0)
	{
		printf("\nEmter valid position");
	}
	else{
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
			for(i=2;i<=p-1;i++)
			{
				temp=temp->next;
			}
			newnode->next=temp->next;
			temp->next=newnode;
			newnode->prev=temp;
			temp=temp->next;
		}
			}
	
}


