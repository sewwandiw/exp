
#include <stdlib.h>
#include <stdio.h>
#include<fcntl.h>
#include<string.h>
#include<io.h>

void read_file(char* source_file, char* destination_file){
	FILE *source_p;
	FILE *destination_p;
	char *line[100];
	int i = 0;
	int k = 0 ;	
	line[0]= (char *)malloc(256*sizeof(char));
	source_p = fopen(source_file,"r");
	destination_p =fopen(destination_file,"w");
	if (source_p == NULL){
		printf("can't open the file");
	} else{
		//while (!feof(source_p)){
		//	fscanf(source_p,"%s",str);
		//	if (strcmp(str,"\n") == 0){
		//		fprintf(destination_p,"%s \n",str);
		//	} else {
		//		fprintf(destination_p,"%s",str);
		//	}
		//}	
		while ( fgets(line[i],256,source_p) != NULL){
			//fputs(line[i],destination_p);
			i++;
			line[i] = (char *)malloc(256*sizeof(char));								
		}
		for (k = i-5 ; k < i ; k++){
			//printf("%s",line[k]);	
			fputs(line[k],destination_p);
		}
	}
	for (k = 0 ; k < i ; k++){
		free(line[k]);
	}
	fclose(destination_p);
	fclose(source_p);
}






