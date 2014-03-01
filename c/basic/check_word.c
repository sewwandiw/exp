#include<stdio.h>
#include<string.h>
#include<malloc.h>

int check_word(char *word,int length,char *match){
	int i;
	int p = 0;
	int k = 0;
	int q = 0;
	char value; 
	char pt[100][100];
	int j = 0; 

	memset(pt, '\0', sizeof(pt));


	for (i = 0 ; i < length; i++){
		value = *word++;
		pt[j][q] = value;
		//printf("%c",pt[j][q]);
		q++;
		if ((value == ' ') || (value == '\n') ){
			j++;
			q = 0;
			printf("\n");
		}
	}

	for (k = 0 ; k <= q  ; k ++){
		for (i = 0 ; i < 100 ;i++ ){
			if (pt[k][i] != '\0')
			{
				//printf("%c",pt[k][i]);	

			}
		}
	}

	for (k = 0 ; k <= j  ; k ++){
		//printf("%s",pt[k]);
		if( strcmp(pt[k],match)==0){
			p+=1;
		}
	}
	printf("The word is %s \n",match);
	printf("in the sentence %s \n",word);
	printf("occurede %d \n",p);
}