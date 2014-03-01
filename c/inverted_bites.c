#include<stdio.h>

int* binary_converter(unsigned char number);
int inverted_bits(unsigned char x){
	int *binary;
	int i;
	binary = binary_converter(x);

	for (i = 0 ; i < 8 ;i++){
		printf("%d",*(binary+i));
	}
	printf("\n");

	for (i = 0 ; i < 8 ; i++){
		if (binary[i]==0){
			binary[i] = 1;
		}else{
			binary[i] = 0;
		} 
	}

	for (i = 0 ; i < 8 ;i++){
		printf("%d",*(binary+i));
	}
	printf("\n");

}