#include<stdio.h>
#include<math.h>

int get_one(){
	int number;
	int count = 0 ;
	printf("Enter the number \n");
	scanf("%d",&number);

	while (number != 1){
		count += 1;
		if( number %2 == 0){
			number = number/2;
		}
		else{
			number = 3*number +1 ;
		}
		printf("next vealue is %d \n",number);

	}

	printf("No of iterations %d \n" ,count);
}