#include <stdio.h>
#include <math.h>

int get_clock(){
	float start_time;
	float duration;
	float end_time_t;
	int i_end_time_t;
	int end_time_p1;
	int end_time_p2;
	float end_time_min;
	printf("Enter the starting time \n");
	scanf("%f",&start_time);
	printf("Enter the duration \n");
	scanf("%f",&duration);

	end_time_t = (start_time + duration)/100;
	i_end_time_t = (int) end_time_t;
	end_time_min = (end_time_t - i_end_time_t) *100;

	if ( end_time_min >=60 ){
		end_time_p1 = floor(end_time_t) + 1 ;
		end_time_p2 = (int) (end_time_min - 60) ;}
	else{
		end_time_p1 = floor(end_time_t) ;
		end_time_p2 = (int) end_time_min;}

	if (end_time_p2 >= 10){
		printf("Starting time %f duration %f end time %d %d\n" ,start_time,duration, end_time_p1,end_time_p2);}
	else {
		printf("Starting time %f duration %f end time %d %d %d\n" ,start_time,duration, end_time_p1,0,end_time_p2);}
}