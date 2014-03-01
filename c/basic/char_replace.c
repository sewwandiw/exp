#include <stdio.h>
#include<string.h>

int replace(char string[]){
	char ch[100];
	int i,j ;	
	int count = 0 ;	
	i = strlen(string);
	for (j =0 ; j < i ; j++){
		ch[j] = string[j];
		if (string[j]==' '){
			ch[j] = '-' ;
			count += 1;
		}
	}

	for (j = 0 ; j < i ; j++){
		printf("%c",ch[j]);
	}

	return count;

}