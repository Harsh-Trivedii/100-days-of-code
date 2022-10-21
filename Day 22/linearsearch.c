#include<stdio.h>
#include<conio.h>

void main()
{
	int i,n,arr[50],elem,f=0;
	printf("\nEnter how many number you want to enter:");
	scanf("%d",&n);
	printf("\nEnter your numbers:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\nEnter element you want to search:");
	scanf("%d",&elem);
	for(i=0;i<n;i++)
	{
		if(arr[i]==elem)
		{
			f=1;
			break;
		}
	}
	if(f==1)
	{
		printf("\nThe value is found at index:%d",i);
	}
	else{
		printf("\nValue not found");
	}
}
