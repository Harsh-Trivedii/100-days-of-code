/* Singly Linked List */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node {
	int data;
	struct node *next;
}*head,*temp;

void createlist(int n);
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
	printf("\nData in the list after insert at beginning:");
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
	struct node *newnode;
	int data,i;
	head=(struct node *)malloc(sizeof(struct node));
	if(head==NULL)
	{
		printf("Unable to allocate memory");
	}
	else{
		printf("Enter data of node 1:");
		scanf("%d",&data);
		head->data=data;
		head->next=NULL;
		temp=head;
		for(i=2;i<=n;i++)
		{
			newnode=(struct node *)malloc(sizeof(struct node));
			if(newnode==NULL)
			{
				printf("Unable to allocate memory");
			}
			else{
				printf("\nEnter data of node %d:",i);
				scanf("%d",&data);
				newnode->data=data;
				newnode->next=NULL;
				temp->next=newnode;
				temp=temp->next;
			}
		}
		printf("\nSingly Linked list created successfully");
	}
}



void display()
{
	
	if(head==NULL)
	{
		printf("List is empty");
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
		printf("Unable to allocate memory");
	}
	else{
		printf("\nEnter data of new node:");
		scanf("%d",&data);
		newnode->data=data;
		newnode->next=head;
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
		printf("Unable to allocate memory");
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
		temp=temp->next;

        }
}

int len()
{
	int c;
	temp=head;
	if(temp==NULL)
	{
		printf("List is empty");
	}
	else{
		while(temp->next!=NULL)
		{
			temp=temp->next;
			c++;
		}
	}
	return c;
}


void insertatmid()
{
	int data,s,p,i;
	struct node *newnode;
	s=len();
	printf("\nEnter your position:");
	scanf("%d",&p);
	if(p>s || p<0)
	{
		printf("\nEnter valid position");
	}
	else{
		newnode=(struct node *)malloc(sizeof(struct node));
		if(newnode==NULL)
		{
			printf("\nUnable to allocate memory");
		}
		else{
			printf("\nEnter data of newnode:");
			scanf("%d",&data);
			newnode->data=data;
			temp=head;
			for(i=1;i<=p-1;i++)
			{
				temp=temp->next;
			}
			newnode->next=temp->next;
			temp->next=newnode;
			temp=temp->next;
		}
	}
}
