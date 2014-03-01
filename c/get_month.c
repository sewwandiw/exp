#include <stdio.h>
#include <string.h>

char get_month(){
	int number;
	int i;
	char Month[4];
	memset(Month, '\0', 4);
	printf("Enter a letter 1-12 \n");
	scanf("%d",&number);
	
	switch(number){
	case 1:
		strncpy(Month, "JAN", 3);
		break;

	case 2:
		strncpy(Month, "FEB", 3);
		break;

	case 3:
		strncpy(Month, "MARCH", 3);
		break;


	default:
		strncpy(Month, " ", 3);
		break;
	}	

	printf("%s \n", Month);
}
