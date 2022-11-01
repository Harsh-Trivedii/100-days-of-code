#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define SIZE 5
int queue[SIZE];
int front=-1;
int rear=-1;

void enqueue(int);
int dequeue();
int display();

void main()
{
	int value,ch;
	while(1)
	{
		printf("\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
		printf("\nEnter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				printf("\nEnter your data:");
				scanf("%d",&value);
				enqueue(value);
				break;
			case 2:
				value=dequeue();
				if(value!=NULL)
				{
					printf("\nData deleted:%d",value);
				}
				break;
			case 3:
				value=display();
				if(value!=NULL)
				{
					printf("\nData at the front:%d",value);
				}
				break;
			case 4:
				exit(0);
		}
		
	}
	getch();
}


void enqueue(int data)
{
	if(front>SIZE-1)
	{
		printf("\nQueue is full");
	}
	else if(front==-1)
	{
		front=rear=0;
		queue[rear]=data;
	}
	else{
		rear=rear+1;
		queue[rear]=data;
	}
	printf("\nData inserted:%d",data);
}


int dequeue()
{
	int data;
	if(front<=-1 || front>rear)
	{
		printf("\nQueue is empty");
	}
	else{
		data=queue[front];
		front=front+1;
	}
	return(data);
}

int display()
{
	int data;
	if(front<=-1 || front>rear)
	{
		printf("\nQueue is empty");
	}
	else{
		data=queue[front];
	}
	return(data);
}
