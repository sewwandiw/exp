#include<stdio.h>
#include<math.h>

int get_min_max_avg(){
	int numbers[10];
	int count;
	int min;
	int max;
	int avg;
	float sum = 0;

	for (count =1 ; count <= 10 ; count ++){
		printf("Enter number %d \n",count);
		scanf("%d",&numbers[count-1]);
	}

	min = numbers[0];
	max = numbers[0];

	for (count = 0 ; count <10 ;count++){
		 sum = sum + numbers[count];
		if ((numbers[count+1]<min) && (count != 9))
			min = numbers[count+1];
		else 
			min = min;
		if (numbers[count+1]> max)
			max = numbers[count+1];
		else
			max = max;	

	}

	for (count =1 ; count <= 10 ; count ++){
		printf("Enter number %d \n",numbers[count-1]);
	}
	printf("min %d max %d avg %f \n",min,max,sum/2);
}