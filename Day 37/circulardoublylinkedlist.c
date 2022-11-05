/* circular doubly linked list insertion and deletion */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node{
	struct node *prev;
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
	printf("\nData in the list:");
	display();
	
	insertatbeg();
	printf("\nData in the list after insert at beginning:");
	display();
	
	insertatend();
	printf("\nData in the list after insert at end:");
	display();
	
	deleteatbeg();
	printf("\nData in the list after delete at beg:");
	display();
	
	deleteatend();
	printf("\nData in the list after delete at end:");
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
		head->next=head;
		head->prev=head;
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
				newnode->prev=temp;
				temp->next=newnode;
				newnode->next=head;
				head->prev=newnode;
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
	else
	{
		temp=head;
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
	struct node *newnode;
	int data,i;
	newnode=(struct node *)malloc(sizeof(struct node));
	if(newnode==NULL)
	{
		printf("\nUnable to allocate memory");
	}
	else
	{
		printf("\nEnter data of new node:");
		scanf("%d",&data);
		newnode->data=data;
		newnode->next=head;
		head->prev=newnode;
		temp=head;
		while(temp->next!=head)
		{
			temp=temp->next;
		}
		temp->next=newnode;
		newnode->prev=temp;
		head=newnode;
	}
}

void insertatend()
{
	struct node *newnode;
	int data,i;
	newnode=(struct node *)malloc(sizeof(struct node));
	if(newnode==NULL)
	{
		printf("\nUnable to allocate memory");
	}
	else
	{
		printf("\nEnter data of new node:");
		scanf("%d",&data);
		newnode->data=data;
		newnode->next=head;
		head->prev=newnode;
		temp=head;
		while(temp->next!=head)
		{
			temp=temp->next;
		}
		temp->next=newnode;
		newnode->prev=temp;
    }
}


void deleteatbeg()
{
	if(head==NULL)
	{
		printf("\nList is empty");
	}
	else{
		temp=head;
		while(temp->next!=head)
		{
			temp=temp->next;
		}
		temp->next=head->next;
		head->next->prev=temp;
		printf("\nData to be deleted:%d",head->data);
		free(head);
		head=temp->next;
	}
}

void deleteatend()
{
	if(head==NULL)
	{
			printf("\nList is empty");
	}
	else{
		temp=head;
		while(temp->next!=head)
		{
			temp=temp->next;
		}
		head->prev=temp->prev;
		temp->prev->next=head;
		printf("\nData to be deleted:%d",temp->data);
		free(temp);
	}
}
