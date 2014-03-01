#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define TRUE 1
#define FALSE 0

int palindrome(char *string){
	char *temp_string;
	int k = 0;
	int result = TRUE ;
	int length = strlen(string);
	temp_string = (char *)malloc(length);

	while(length >= 0){
		*(temp_string + k)  = *(string +length-1);
		k++;
		length--;	
	}
	for (length = 0 ; length < k ; length++){
		if (temp_string[length] != string[length]){
			result = FALSE ;
			break;
		}
	}
	return result;

}



