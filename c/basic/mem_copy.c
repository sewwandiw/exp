#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include <memory.h>

char* memry_copy(char* String){
	int i;
	char *new_string;
	int length = strlen(String);
	new_string = (char*)malloc((length+1)*sizeof(char));
	memset(new_string,'\0',length+1);

	for (i =0 ; i < length ; i++){
		new_string[i] = String[length-i-1];
	}
	return new_string;

}