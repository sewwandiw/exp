#include <stdio.h>
# include <math.h>

const float pi = 3.414;

float get_circle_area(){
	float radius;
	float area;
	printf("Enter the radius of the cirlce \n");
	scanf("%f",&radius);

	if(radius > 0) {
		area = pow(radius,2)*pi;
		printf("Area is %f  \n",area);
	}
	else{
		printf("Enter positive radius \n");
	}

}