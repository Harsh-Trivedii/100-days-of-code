/* Stack using array */

#include<stdio.h>
#include<conio.h>

#define SIZE 5
int top=-1;
int stack[SIZE];
void push();
int pop();
int peep();

void main()
{
	int data,ch;
	int con=1;
	while(con==1)
	{
		printf("\n1.Push operation");
		printf("\n2.Pop operation");
		printf("\n3.Peep operation");
		printf("\nEnter your choice:");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
				push();
				break;
			case 2:
				data=pop();
				if(data!=NULL)
				{
					printf("Data popped out:%d",data);
				}
				break;
			case 3:
				data=peep();
				if(data!=NULL)
				{
					printf("Element at the top:%d",data);
				}
				break;
			default:
				printf("\nInvalid choice");
				break;
		}
		printf("\nDo you want to continue(1/0)");
		scanf("%d",&con);
	}
	getch();
}


void push()
{
	int data;
	if(top>SIZE-1)
	{
		printf("\nStack overflow push not possible");
	}
	else{
		printf("Enter data:");
		scanf("%d",&data);
		top=top+1;
		stack[top]=data;
	}
}


int pop()
{
	int data=NULL;
	if(top<=-1)
	{
		printf("\nStack underflow, pop not possible");
	}
	else{
		data=stack[top];
		top=top-1;
	}
			return(data);
}


int peep()
{
	int data=NULL;
	if(top<=-1)
	{
		printf("\nStack is empty");
	}
	else{
		data=stack[top];
	}
		return(data);
}
