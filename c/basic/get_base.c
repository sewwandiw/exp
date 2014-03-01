#include<stdio.h>
#include<math.h>
#include <string.h>

int ger_base(){
	int base;
	int number;
	char n[20];
	int count;
	int i;
	float result =0;
	memset(n, '\0', 20);
	printf(" Enter the base and the number \n");
	scanf("%d %d",&base,&number);
	sprintf(n,"%d",number);

	for (count = 0 ;count <20 ;count++){
		if (n[count] == '\0'){
			break;}
		else{ 
			i = count+1;}
	}

	for (count = i ;count > 0 ;count--){
		result = result + (n[count-1] - '0')*pow(base,(float)(i-count));
	
	}

	printf("result %f \n",result);


}