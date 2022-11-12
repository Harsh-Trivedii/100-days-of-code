#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node{
	struct node *prev;
	int data;
	struct node *next;
}*front=NULL,*rear=NULL;

void insert();
void delete_elem();
void display();

void main()
{
	int ch;
	while(ch!=4)
	{
		printf("\n1.Enqueue\n2.Delete\n3.Display\n4.Exit");
		printf("\nEnter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				insert();
				break;
			case 2:
				delete_elem();
				break;
			case 3:
				display();
				break;
			case 4:
				printf("\nExiting...");
				break;
			default:
				printf("\nEnter valid choice");
				break;
		}
	}
	getch();

}

void insert()
{
	struct node *newnode;
	newnode=(struct node *)malloc(sizeof(struct node));
	int data;
	printf("\nEnter data:");
	scanf("%d",&data);
	newnode->data=data;
	if(front==NULL)
	{
		newnode->prev=newnode;
		newnode->next=newnode;
		front=rear=newnode;
	}
	else
	{
		rear->next=newnode;
		newnode->next=front;
		newnode->prev=rear;
		front->prev=newnode;
		rear=newnode;
	}
}

void delete_elem()
{
	struct node *temp,*t;
	t=temp=front;
	if(front==NULL)
	{
		printf("\nUnderflow");
	}
	else if(front->next==front)
	{
		printf("\nData to be deleted:%d",front->data);
		front=NULL;
		free(front);
	}
	else{
		while(temp->next!=front)
		{
			temp=temp->next;
		}
		temp->next=front->next;
		front->next->prev=temp;
		front=front->next;
		printf("\nData to be deleted:%d",t->data);
		free(t);
	}
}

void display()
{
	struct node *temp;
	if(front==NULL)
	{
		printf("\nQueue is empty");
	}
	else
	{
		temp=front;
		printf("\nData in the queue:");
		while(temp->next!=front)
		{
			printf("\n%d",temp->data);
			temp=temp->next;
		}
		printf("\n%d",temp->data);
	}
}
