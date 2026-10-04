/* vSearch for a given element in the array*/
#include<stdio.h>
int main()
{
	int n,i;
	printf("Enter the size of the array:");
	scanf("%d",&n);
	int arr[n];
	for(i=0;i<n;i++)
	{
		printf("Enter the element arr[%d]:",i);
		scanf("%d",&arr[i]);
	}
	int item;
	printf("Enter the elements to search : ");
	scanf("%d",&item);
	for(i=0;i<n;i++)
	{
		if(arr[i] == item)
		{
			printf("item found at index %d ",i);
			break;	
		}
	}
	return 0;
}
