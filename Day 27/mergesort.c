#include<stdio.h>
#include<conio.h>

void mergesort(int,int,int);
void merge(int,int,int,int,int);

void main()
{
	int n,a[10],i;
	printf("\nEnter how many numbers you want:");
	scanf("%d",&n);
	printf("\nEnter your numbers:");
	for(i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	mergesort(a,0,n-1);
	printf("\nSorted Array:\n");
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
	getch();
}

void mergesort(int a[],int low,int high)
{
	if(low<high)
	{
		mid(low+high)/2;
		mergesort(a,low,mid);
		mergesort(a,mid+1,high);
		merge(a,low,mid,mid+1,high);
	}
}


void merge(a,low,mid,mid+1,high)
{
	int temp[10];
	low1=mid+1;
	int k=0;
	while(low<=mid && low1<=high)
	{
		if(a[low]<a[low1])
		{
			temp[k]=a[low];
			low++;
			k++;
		}
	    else{
		temp[k]=a[low1];
		low1++;
		k++;
	}
	}
	while(low<=mid)
	{
		temp[k]=a[low];
		low++;
		k++;
	}
	while(low1<=high)
	{
		temp[k]=a[low1];
		low1++;
		k++;
	}
	for()
}
