#include<stdlib.h>
#include<stdio.h>


int* binary_converter(unsigned char number);
int rotate_bits(unsigned x,int y){
	int *binary;
	int i;
	int *temp;
	int temp_binary[8];
	int k = 0 ;
	int w = 0;
	binary = binary_converter(x);
	temp = (int *)malloc(y*sizeof(int));

	for (i = 0 ; i < 8 ;i++){
		temp_binary[i]  = *(binary +i);
	}

	for (i = 0 ; i < 8 ;i++){
		printf("%d",*(binary+i));
	}

	printf("\n");

	for (i = 0 ; i < 8 ; i++){
		if((7 - i)< y){
			*(temp + w) = *(binary+i);
			w++;
		}	
	}
	for (i = 0 ; i < 8 ; i++){
		if(i >= w){
			*(binary+i) = *(temp_binary+i-y);
		}else {
			*(binary+i) = *(temp+k);
			k++;
		}
	}

	printf("\n");
	for (i = 0 ; i < 8 ;i++){
		printf("%d",*(binary+i));
	}

}