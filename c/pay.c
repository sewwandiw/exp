#include<stdio.h>
#include<math.h>

void pay(int rate,int hours){
	float pay;

	if (hours<= 40){
		pay = hours*rate;}
	else if (40 <hours<= 60){
		pay = 40*rate + (hours - 40)*1.5*rate;
	}
	else if (hours > 60){
		pay = 40*rate + 20*1.5*rate + (hours - 60)*2*rate;
	}

	printf("pay at %d for %d hours is %f \n",rate,hours,pay/100);
}





