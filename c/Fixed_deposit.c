#include<stdio.h>
#include<math.h>

int fixed_deposit(){
	float capital;
	float interst;
	float intest_get;
	int i;
	int year;
	float money;
	printf("Enter the capital, interst rate and the no of years \n");
	scanf("%f %f %d",&capital,&interst,&year);

	for (i = 1 ;i <= year ; i++){
	     
		intest_get = capital*interst/100;
		money = capital + intest_get;
		capital += intest_get; 
		printf("%d \t %f \t %f \n",i,intest_get,money);
	
	}

}
