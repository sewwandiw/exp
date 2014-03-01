#include<stdio.h>
#include<math.h>

int get_Date(){
	int Date;
	int month;
	int year;
	int Max_Date =0 ;
	int next_date;
	printf("Enter the date month and year \n");
	scanf("%d %d %d",&Date,&month,&year);
	next_date = Date + 1;

	if (month %2 != 0 || month == 6){
		Max_Date = 31;}
	else{Max_Date = 30;}

	if ((next_date) > Max_Date){
		month = month + 1;
		Date = next_date -Max_Date;
		if (month > 12){ 
			year = year + 1;
			month = month -12;}
	}
	else{
		Date = next_date;}
	printf("following date is it %d:%d:%d \n", Date ,month,year);
}