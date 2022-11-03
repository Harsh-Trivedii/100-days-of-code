/* queue using singly linked list */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
}*front=NULL,*rear=NULL;

void enqueue(int);
void dequeue();
void display();

void main()
{
	int data,ch;
	while(1)
	{
		printf("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
		printf("\nEnter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				printf("\nEnter Data:");
				scanf("%d",&data);
				enqueue(data);
				break;
			case 2:
				dequeue();
				break;
			case 3:
				display();
				break;
			case 4:
				exit(0);			
		}
	}
	getch();
}


void enqueue(int data)
{
	struct node *newnode;
	newnode=(struct node *)malloc(sizeof(struct node));
	newnode->data=data;
	newnode->next=NULL;
	if(front==NULL)
	{
	
		front=rear=newnode;
	}
	else{
		rear->next=newnode;
		rear=newnode;
	}
	printf("\nData inserted:%d",rear->data);
}

void dequeue()
{
	struct node *temp;
	if(front==NULL)
	{
		printf("\nQueue is empty");
	}
	else{
		temp=front;
		printf("\nData deleted:%d",temp->data);
		front=front->next;
		free(temp);
	}
}

void display()
{
	struct node *temp;
	temp=front;
	if(front==NULL)
	{
		printf("\nQueue is empty");
	}
	else{
		printf("\nData in the queue:");
		while(temp!=NULL)
		{
			printf("\n%d",temp->data);
			temp=temp->next;
		}
	}
}
