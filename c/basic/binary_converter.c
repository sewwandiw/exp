#include<stdlib.h>
#include<stdio.h>


int* binary_converter(unsigned char number){
	int count;
	int j;
	int *num;
    num = (int *)malloc(8*sizeof(int));
	for (j = 0 ; j < 8 ;j++){
		*(num+j) = 0;
	}
	for (count = 0; number != 0; number>>=1 ){
		if (number %2 == 0){
			*(num+7-count)= 0;
		}else{
			*(num+7-count)= 1;
		}
		if (number == 1){
			*(num+7-count) = 1;
		}else if (number == 0){
			*(num+7-count) = 0;
		}		
		count++;
	}

	return num;
}






