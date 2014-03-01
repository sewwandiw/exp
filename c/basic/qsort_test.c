#include<stdio.h>
#include<stdlib.h>
#include<search.h>

typedef struct {
	int   keyword[10];
	int    length;
} Record; 

void build_array(Record *my_array);
int cmpfunc(const void * a, const void * b);

int qsort_line(){
	int i ;
	Record my_array;
	build_array(&my_array);

	printf("\nBefore  sorting the list is: \n");
	for( i = 0 ; i < my_array.length; i++ ) {
		printf("%d ", my_array.keyword[i]);
	}

	qsort(my_array.keyword, my_array.length, sizeof(int), cmpfunc);

	printf("\nAfter sorting the list is: \n");
	for( i = 0 ; i < my_array.length; i++ ) {
		printf("%d ", my_array.keyword[i]);
	}

	return(0);
}

void build_array(Record *my_array){
	int *input[10];
	int i  = 0;
	do{
		input[i] = (int *)malloc(sizeof(int));  
		if (input[i] == NULL){
			printf("No memorry");
			break;
		}else{
			printf("Enter the integer \n");	
			scanf("%d",input[i]);
			my_array->keyword[i] = *input[i];
		}
		i++;
	}while (*(input[i-1]) > 0);	

	my_array->length = i-1;
}

int cmpfunc(const void * a, const void * b)
{
	return ( *(int*)a - *(int*)b );
}