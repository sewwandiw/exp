#include<stdio.h>
#include<stdlib.h>

int filer_reader(){
	char words[100];
	int ch,i;
	FILE* in_file;

	fopen_s(&in_file,"story.txt","r");

	if(!in_file){
		printf("can't read the file \n");
		exit(-1);
	}

	ch = fgetc(in_file);
	for (i = 0 ; i<100 ; i++){
		words[i] = (char) ch;
		ch = fgetc(in_file);
	}
	words[99] = '\0';

	for (i = 0 ;i < 100 ;i++){
		if (words[i] ==' ' ){
			printf("\n");
		}
		else{
			printf("%c",words[i]);
		}
	}
	fclose(in_file);

}