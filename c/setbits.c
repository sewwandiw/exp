#include<stdlib.h>
#include<stdio.h>

int* binary_converter(unsigned char number);
void setbits(unsigned char x,unsigned char y,int p,int q){
	int j ;

	int*x_temp;
	int*y_temp;
	int *temp;
	int k  = 0;
	int w = 0 ;
	x_temp = binary_converter(x);
	y_temp = binary_converter(y);
	temp = (int *)malloc((p+1)*sizeof(int));

	for (j = 0 ; j < 8 ;j++){
		printf("%d",*(x_temp+j));
	}
	printf("\n");

	for (j = 0 ; j < 8 ;j++){
		printf("%d",*(y_temp+j));
	}

	printf("\n");

	for (j = 0 ; j < 8 ;j++){
		if((7-j)<=p){
			*(temp+k) = *(x_temp+j);
			k++;
		}
	}

	for (j = 0 ; j < 8 ;j++){
		if((7-j) <= q){
			if (w > p){
				break;
			}else{
				*(y_temp+j) = *(temp+w);
				w++;
			}			
		}
	}

	printf("\n");
	for (j = 0 ; j < 8 ;j++){
		printf("%d",*(x_temp+j));
	}
	printf("\n");

	for (j = 0 ; j < 8 ;j++){
		printf("%d",*(y_temp+j));
	}


}