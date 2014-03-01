#include <stdio.h>
#include <math.h>

int get_time(){
	float second;
	float f_min;
	int min;
	float f_hour;
	int hour;
	float i_sec;
	int sec;

	printf("Enter the seconds \n");
	scanf("%f", &second);

	f_hour = second/3600;
	hour = second /3600;

	f_min = (f_hour - hour)*60;
	min = (f_hour - hour)*60;

	i_sec = (f_min-min)*60;

	if (i_sec >= ((int)i_sec  + 0.5)) {
		sec = (int)i_sec + 1;
	}
	else{
		sec = (int) i_sec;
	}

	printf("%d \n",(int) f_hour);
	printf("%d \n",(int) f_min);
	printf("%d \n",sec);


}