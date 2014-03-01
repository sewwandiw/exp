#include<io.h>
#include <sys/types.h>
#include <dirent.h>
#include <stdio.h>
#include<stdlib.h>
#define MAX_BUFF 100

typedef struct{
	char*dp_N[MAX_BUFF];
	int count;
} dir_content;

dir_content scan_dir(char *name){
	dir_content dir;
	DIR *dp;
	int access_result;
	char *dp_inside[MAX_BUFF];
	int i = 0 ;
	int j = 0;
	struct dirent *ep;  
	dp = opendir (name);
	dir.dp_N[0] = (char *)malloc(MAX_BUFF*sizeof(char));
	if (dp != NULL)
	{
		while (ep = readdir (dp)){
			puts(ep->d_name);
			strcpy(dir.dp_N[j],name); 
			strcat(dir.dp_N[j],"\\");
			dp_inside[j] = ep->d_name;
			strcat(dir.dp_N[j],dp_inside[j]);
			access_result = access(dir.dp_N[j],04);
			if (access_result == 0 ){
				printf("Readonly \t");
			} else {
				printf("writeonly \t");
			}
			//printf("%s \n",dir.dp_N[j]);
			j++;
			dir.dp_N[j] = (char *)malloc(MAX_BUFF*sizeof(char));
		}

		(void) closedir (dp);	
	}
	else
		perror ("Couldn't open the directory");
	dir.count = j ;
	return dir;
}