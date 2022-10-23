#include<stdio.h>
#include<conio.h>

void main()
{
	int n,i,j,s,beg,end,a[10],temp,mid,elem;
	printf("\nEnter how many numbers you want to enter:");
	scanf("%d",&n);
	printf("\nEnter your numbers:");
	for(i=0;i<n;i++)
	{
		scanf("\n%d",&a[i]);
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		    }
		}
	}
	printf("\nELements after bubble sort:\n");
	for(i=0;i<n;i++)
	{
		printf("%d\t",a[i]);
	}
	beg=0;
	end=n-1;
	mid=(beg+end)/2;
	printf("\nEnter element you want to search:");
	scanf("%d",&elem);
	while(beg<=end)
	{
		if(a[mid]>elem)
		{
			end=mid-1;
		}
		else if(a[mid]==elem)
		{
			printf("Element found at location:%d",mid+1);
			break;
		}
		else{
			beg=mid+1;
		}
		mid=(beg+end)/2;
	}
	if(beg>end)
	{
		printf("\nNo such element");
	}
	getch();
}


