#include<stdlib.h>
#include<stdio.h>
#include<string.h>

#define MAX_BUFF 100
static char temp_string[MAX_BUFF];
static int k = 0;

char* split_string(char *string ,char *delimeter){
	int j, isfound = 0;
	int length_string = 0;
	int length_delemeter;
	int i = 0 ;

	if (string != NULL){
		memset(&temp_string,'\0',MAX_BUFF);
		strcpy(temp_string,string);	
		length_string = strlen(string);
	} else { 
		if ((temp_string[k]) != '\0'){
			length_string = strlen(&(temp_string[k]));
			string = (char *)malloc(length_string*sizeof(char));
			strcpy(string,&temp_string[k]);
		}
	}

	length_delemeter = strlen(delimeter);

	for (i = 0 ; i < length_string ; i++){
		if (string[i] != NULL){
			for (j = 0 ; j < length_delemeter; j++){
				if (string[i] == delimeter[j]){
					strncpy(string+i,"\0",1);
					isfound =1 ;
					break;
				}
			}
		}
		if (string[i] == NULL)
		{
			break;
		}
		if (isfound == 1){
			break;
		}
		k += 1;
	}
	k += 1;
	return string;
}