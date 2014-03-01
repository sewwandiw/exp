#include<stdio.h>
#include<string.h>

int scan_array(char *numbers,int length){
	int i;
	char value;
	for (i = 0 ; i <length ;i++){
	    value = *numbers++;
		if (value == 's')
		printf("OK");			
	}
	
}