#include<stdio.h>
#include<stdlib.h>

int rand_number(int M,int N);
int* UK_lottery(){
	int *no;
	int i;
	no = (int *)malloc(6*sizeof(int));
	for (i = 0 ; i <6 ;i++){
		*(no+i) = rand_number(1,49);	
	}
	
	return no;
}