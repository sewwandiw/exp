#include<stdio.h>
#include<stdlib.h>

int rotate_word(int *a,int *b ,int *c){
	int *temp1;
	int *temp2;
	
	temp1 = c;
	temp2 = a ;
	a = temp1;
	temp1 = b;
	b = temp2;
	c = temp1;
	
	printf("%d %d %d",*a,*b,*c);

}