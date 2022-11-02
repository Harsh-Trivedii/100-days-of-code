/* stack using singly linked list */

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *next;
}*top=NULL;

void push(int);
void pop();
void peep();

void main()
{
	int value,ch;
	while(1)
	{
		printf("\n1.push\n2.pop\n3.peep\n4.exit");
		printf("\nEnter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				printf("\nEnter your value:");
				scanf("%d",&value);
				push(value);
				break;
			case 2:
				pop();
				break;
			case 3:
				peep();
				break;
			case 4:
				exit(0);
		}
	}
	getch();
}


void push(int data)
{
	struct node *newnode;
	newnode=(struct node *)malloc(sizeof(struct node));
	newnode->data=data;
	if(top==NULL)
	{
		newnode->next=NULL;
		top=newnode;
	}
	else{
		newnode->next=top;
		top=newnode;
	}
	printf("Node inserted:%d",top->data);
}


void pop()
{
	struct node *temp;
	if(top==NULL)
	{
		printf("Stack is empty");
	}
	else{
		temp=top;
		top=temp->next;
		printf("\nDeleted node data:%d",temp->data);
		free(temp);
	}
}

void peep()
{
	if(top==NULL)
	{
		printf("Stack is empty");
	}
	else{
		printf("Data on the top:%d",top->data);
	}
}
