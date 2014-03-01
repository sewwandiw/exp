#include<stdio.h>
#include<string.h>
#include<math.h>
#include <time.h>
#include <stdlib.h>

int i;
int print_word_count(){
	char ch;
	i= 0;
	while(ch=getchar(),ch >0){
		if (ch=='\n'){break;}
		i ++ ;

	}

	return i;
}

char* get_word(int count){
	char ch;
	static char word[20];
	memset(word,'\0',20);
	i = 0;
	while(ch =getchar(),ch >0){
		word[i] = ch;
		if (ch=='\n'){break;}
		i +=1; ;		
	}

	return word;
}
char print_reverse(int count,char word[]){
	for (i = count-1 ; i >= 0 ; i --){
		printf("%c", word[i]);	
		if (i ==0){printf("\n");}
	}


}


