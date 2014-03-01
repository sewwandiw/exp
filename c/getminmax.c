#include <stdio.h>
#include <math.h>
#include <conio.h>
int getminmax()
{

	int min;
	int max;
	int len;
	int x ;
	char no[20];
	int  numbers[20] ;

	printf("Enter the 10 numbers seperated by , \n");
	scanf("%s", & no);

	for ( x = 0; x < 20 ; x++ ) { 
		numbers[x] = -1;
		if (no[2*x+1] == ',' ){
			numbers[x] = no[2*x] - '0';		
		}
	}

	for (x = 0 ; x < 20 ; x++){
		printf("%d \n" , numbers[x]);
	}

	//int numbers[] = {23,34,12,11,204,99,16};
	len = sizeof(numbers)/sizeof(int);
	min = numbers[0];
	max = numbers[0];

	for (x = 0 ; x < len; x++){

		if (x == len-1){
			break;
		}

		if (numbers[x] == -1){
			break;
		}

		if ((min > numbers[x+1]) && (numbers[x+1] != -1)){
			min = numbers[x+1];
		}

		if((max < numbers[x+1]) && (numbers[x+1] != -1)){
			max = numbers[x+1];
		}		
	}
	printf(" min %d \n",min);
	printf(" max %d \n",max);
}






