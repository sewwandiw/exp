#include<stdlib.h>
#include<stdio.h>
#include<string.h>
#include<io.h>
#include <sys/types.h>
#include <dirent.h>
#define MAX_BUFF 100

void match_word(char *word,char*location){
	struct dirent *ep;
	FILE *fp;
	char *found;
	int j = 0;
	char *line[MAX_BUFF];
	DIR *directory;
	char new_location[MAX_BUFF];
	directory = opendir(location);
	strcpy(new_location,location);
	line[0]= (char *)malloc(MAX_BUFF*sizeof(char));

	if (directory == NULL){
		printf("No directory found");
	}
	else {
		while( (ep = readdir(directory)) != NULL){
			if (strcmp(ep->d_name,"word.txt")==0){
				strcat(new_location,"\\");
				strcat(new_location,"word.txt");
				fp = fopen(new_location,"r");
				if (fp == NULL){
					printf("cant open the file");
				}else{
					while(fgets(line[j],MAX_BUFF,fp) != NULL){
						found = strstr(line[j],word);
						if(found != NULL){
							printf("%s \n",line[j]);
						}
						j++;
                        line[j] = (char *)malloc(MAX_BUFF*sizeof(char));	
					}
				}

			}
		}
	}
}