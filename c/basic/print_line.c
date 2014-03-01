#include<stdio.h>
#include<stdlib.h>

int print_line(int n){
	int i = 0;
	int j;
	static const char filename[] = "CP.txt";
	FILE *file = fopen ( filename, "r" );
	static char line [128][128]; 
	while ( fgets ( line[i], sizeof line, file ) != NULL ) 
	{
		//fputs ( line, stdout ); 
		i += 1;
	}
	printf("%d \n",i);
	j = i - n ;
	while ( fgets ( line[j], sizeof line, file ) != NULL ) 
	{
		fputs ( line[j], stdout ); 
		j += 1;
	}

	for (j = i-n ; j < i ;j++){
	 printf("%s \n",line[j]);
	}

}