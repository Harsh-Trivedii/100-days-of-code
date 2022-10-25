#include<stdio.h>
#include<conio.h>

void main()
{
	int n,a[10],temp,i,j,min;
	printf("\nEnter how many numbers you want:");
	scanf("%d",&n);
	printf("\nEnter your numbers:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		min=i;
		for(j=i+1;j<n;j++)
		{
			if(a[j]<a[min])
			{
				min=j;
			}
		}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
	printf("\nAfter selection sort:\n");
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
}
