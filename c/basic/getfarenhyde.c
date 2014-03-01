#include <stdio.h>
#include <math.h>

float getfarenhyde(){
	float cel;
    float far;


	printf("Enter the celsicus values \n");
	scanf("%f",& cel);

	far = cel * 9 /5 + 32;
	printf("Farehdie is %f \n",far);

}