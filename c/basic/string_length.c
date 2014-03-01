#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX_BUFF 256

int string_length(char *string){
	int length = 0;
	char temp_string[MAX_BUFF];
	memset(temp_string,'\0',MAX_BUFF);
	strcpy(temp_string,string);

	while(temp_string[length]!= '\0'){
		length++;
	}
	return length;
}