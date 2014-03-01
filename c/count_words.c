#include<stdio.h>
#include<stdlib.h>

int count_words(){
	FILE *in_file;
	int ch,i,j;
	char words[100];
	fopen_s(&in_file,"story.txt","r");


	if(!in_file){
		printf("File not exist");
		exit(0);
	}

	ch = fgetc(in_file);
	for ( i = 0 ; i <100 ;i++){
		words[i] = (char) ch;
		ch = fgetc(in_file);

	}
	j = 0;
	for (i = 0 ; i <100 ; i ++){
		j += 1 ;
		if (words[i] == ' '){
			printf("word length is %d \n",j-1);
			j = 0 ;	
		}	

	}



}