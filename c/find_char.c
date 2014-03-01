#include<stdio.h>

int find_char(){
	int i ;
	int numbers[] = {1,3,4,5,6,7,10,11,34,37,8,8};
	int length = sizeof(numbers)/sizeof(int);

	for (i = 0 ; i < length ; i++){
		if(numbers[i] == 8){
			printf("index is %d \n",i+1);}
		
	}

}