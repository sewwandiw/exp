#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#include <ctype.h>

char* upper_case(char* string){
	char *new_string;
	for (new_string = string ; new_string < string+ strlen(string) ; new_string++){
		if(islower(*new_string)){
		putchar(_toupper(*new_string));
		}
		else{
		putchar(*new_string);
		}
	}
	return new_string;

}