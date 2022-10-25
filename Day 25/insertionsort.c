#include<stdio.h>
#include<conio.h>

void main()
{
	int i,j,a[10],temp,n;
	printf("\nEnter how many numbers you want to enter: ");
	scanf("%d",&n);
	printf("\nEnter your numbers:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(i=1;i<n;i++)
	{
		temp=a[i];
		j=i-1;
		while(j>=0 && a[j]>temp)
		{
			a[j+1]=a[j];
			j=j-1;
		}
		a[j+1]=temp;
	}
	printf("\nAfter insertion sort:\n");
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
}
