#include<stdio.h>
#define least_bit(x,n,result) \
	{int i; \
	for (i = 0 ; i < 8 ; i++){\
	if (i == n){\
	result = *(x+i);\
	}}}


int* binary_converter(unsigned char number);
void bit_operation(char x){
	int i ;
	int result;
	int *binary;
	binary = binary_converter(x);
	for (i = 0 ; i < 8 ;i++){
		printf("%d",*(binary+i));
	}
	printf("\n");
	least_bit(binary,7,result)
	printf("%d",result);
}