#include<stdio.h>
int main()
{
	int rollno = 10,age = 20;
	
	int encode = rollno^age;
	
	printf("the encoded data : %d \n",encode);
	printf("the decoded rollno : %d \n",encode^age);
	printf("the encoded age : %d \n",encode^rollno);
	
	return 0;
}
