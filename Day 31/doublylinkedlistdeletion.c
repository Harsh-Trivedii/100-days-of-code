/* doubly linked list deletion at beg , mid and end */

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
void deleteatbeg();
void deleteatend();
void deleteatmid();
int len();

void main()
{
	int n;
	printf("Enter how many nodes you want to enter:");
	scanf("%d",&n);
	createlist(n);
	
	printf("\nData in the list:");
	display();
		
	deleteatbeg();
	printf("\nData in the list after delete at beg:");
	display();
	
	deleteatend();
	printf("\nData in the list after delete at end:");
	display();
	
	deleteatmid();
	printf("\nData in the list after delete at mid:");
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


void deleteatbeg()
{
	if(head==NULL)
	{
		printf("\nlist is empty");
	}
	else{
		temp=head;
		head=temp->next;
		head->prev=NULL;
		free(temp);
	}
}


void deleteatend()
{
	struct node *t;
	if(head==NULL)
	{
		printf("\nList is empty");
	}
	else{
		temp=head;
		while(temp->next!=NULL)
		{
			t=temp;
			temp=temp->next;
		}
		t->next=NULL;
		temp->prev=NULL;
		free(temp);
	}
}


void deleteatmid()
{
	int p,s,i;
	struct node *t;
	printf("\nEnter your position:");
	scanf("%d",&p);
	s=len();
	if(p>s || p<0)
	{
		printf("Enter valid location");
	}
	else{
		temp=head;
		if(p==1)
		{
			head=temp->next;
			head->prev=NULL;
			free(temp);
		}
		else{
			for(i=2;i<=p-1;i++)
			{
				t=temp;
				temp=temp->next;
			}
			t->next=temp->next;
			temp->next->prev=t;
			free(temp);
		}
	}
}
