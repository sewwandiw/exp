#include<stdio.h>
#include<stdlib.h>


void read_array(){
	int no;
	int *ARR;
	int i ;
	printf("Enter the number of integers to be added \n");
	scanf("%d",&no);
	ARR = (int *)malloc(no*sizeof(int));
	if (ARR == 0){
		printf("Outof memory");
	}
	else{
		for (i =0 ; i < no ;i++){
			printf("Enter integers to be stored \n" );
			scanf("%d",ARR+i);	
		}
	}
	  for (i =0 ; i < no ;i++){
		  printf("%d \n",*(ARR+i));	  
	  }
}