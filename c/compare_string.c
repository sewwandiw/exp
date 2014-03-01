#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX_BUFF  256

void comapare_string(char* source_1, char* source_2){
	char *line_1[100];
	char *line_2[100];
	int j;
	int l;
	int i = 0 ;
	int k = 0 ;
	FILE *source_p1 = fopen(source_1,"r");
	FILE *source_p2 = fopen(source_2,"r");
	line_1[0] = (char *)malloc(MAX_BUFF*sizeof(char));
	line_2[0] = (char *)malloc(MAX_BUFF*sizeof(char));

	while(fgets(line_1[i],MAX_BUFF,source_p1) != NULL){
		i++;
		line_1[i] = (char *)malloc(MAX_BUFF*sizeof(char));	
	}
	while(fgets(line_2[k],MAX_BUFF,source_p2) != NULL){
		k++;
		line_2[k] = (char *)malloc(MAX_BUFF*sizeof(char));
	}

	for (j = 0 ; j < i ; j++){
		for (l = 0 ; l < k ; l++){
			if (j == l){
				if (strcmp(line_1[j],line_2[l]) != 0 ){
					printf("Different lines are  \n%s of source 1 \n%s of sourde 2 ",line_1[j],line_2[l]);
				}
			}
		}
	}
	for (j = 0 ; j < i ; j++){
		free(line_1[j]);
	}

	for (j = 0 ; j < k ; j++){
		free(line_2[j]);
	}


	fclose(source_p1);
	fclose(source_p2);

}