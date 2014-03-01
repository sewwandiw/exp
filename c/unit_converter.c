#include <stdio.h>
#include <math.h>

float unit_converter(){
	float cm;
	float f_feet;
	float f_inch;
	int feet;

	printf("Enter the cm values to be converted \n");
	scanf("%f",&cm);

	f_inch = cm/2.54;
	f_feet = f_inch/12;
	feet = (int) f_feet;
	f_inch = (f_feet - feet)*12;

	printf("%f cm values in feet is %d and %f 333 \n" , cm,feet,f_inch);

}