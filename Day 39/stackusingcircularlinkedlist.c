/* 
Program: Implementation of stack using circular singly  linked list

Explanation: Stack follows Last In First Out . Element inserted at the end is the first to be deleted or removed.
Stack has two main methods push() for insertion of data into stack and pop() for deletion.
We have to implement this stack operations using circular singly linked list where the last node is connected with the first node.

Sample Input Insertion: 1 2 3
Sample Output after deletion: 1 2 

Use switch statement and let user select which operation he/she wants to perform [push() , pop() , display()]

*/

#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

struct node{
	int data;
	struct node *next;
}*top=NULL;

void push();
void pop();
void display();

void main()
{
	int ch;
	while(ch!=4)
	{
	printf("\n1.Push\n2.Pop\n3.Display\n4.Exit");
	printf("\nEnter your choice:");
	scanf("%d",&ch);
	
	switch(ch)
	{
		case 1:
			push();
			break;
		case 2:
			pop();
			break;
		case 3:
			display();
			break;
		case 4:
			printf("Exiting...");
			break;
		default:
			printf("\nEnter valid choice");
	}
	}	
	getch();
}


void push()
{
	int data;
	struct node *newnode,*temp;
	newnode=(struct node *)malloc(sizeof(struct node));
	if(newnode==NULL)
	{
		printf("\nUnable to allocate memory");
	}
	else{
		printf("Enter your value:");
		scanf("%d",&data);
		if(top==NULL)
		{
			newnode->data=data;
			newnode->next=newnode;
			top=newnode;
		}
		else{
			temp=top;
			newnode->data=data;
			newnode->next=top;
			while(temp->next!=top)
			{
				temp=temp->next;
			}
			temp->next=newnode;
			top=newnode;
		}
	}
}

void pop()
{	
	struct node *temp,*t;
	if(top==NULL)
	{
		printf("\nUnderflow");
	}
	else{
		t=top;
		temp=top;
		if(temp->next==temp)
		{
			printf("\nData to be deleted: %d",temp->data);
			free(temp);
			top=NULL;
		}
		else{
		while(temp->next!=top)
		{
			temp=temp->next;
		}
		top=top->next;
		temp->next=top;
		printf("\nData to be deleted: %d",t->data);
		free(t);
	}
	}
}

void display()
{
	struct node *temp;
	temp=top;
	if(top==NULL)
	{
		printf("Stack is empty");
	}
	else
	{
		printf("\nPrinting stack elements");
		while(temp->next!=top)
		{
			printf("\n%d",temp->data);
			temp=temp->next;
		}
			printf("\n%d",temp->data);
	}
}
