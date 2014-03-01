#include<stdio.h>
#include<math.h>
#include<stdlib.h>

char read_line(){
	int j ;
	int k ;
	int  i = 0 ;
	int SUM_C = 0;
	int SUM_S = 0 ;
	int SUM_T = 0;
	int SUM_N = 0;
	int SUM_CO = 0;
	static const char filename[] = "CP.txt";
	FILE *file = fopen ( filename, "r" );
	static char line [128][128]; 
	while ( fgets ( line[i], sizeof line, file ) != NULL ) 
	{
		//fputs ( line, stdout ); 
		i += 1;
	}

	printf("no of lines are %d \n",i);
	fclose ( file );

	for (k = 0 ; k <i ;k++){ 
		for (j = 0 ; j <128 ;j++)
			if (line[k][j]!= '\0'){
				//printf("%c",line[k][j]);
				SUM_C += 1;

				switch (line[k][j]){
				case ' ':
					SUM_S += 1;
					break;
				case '\t':
					SUM_T += 1 ;
					break;
				case '\n':
					SUM_N += 1 ;
					break;
				case '\*':
					SUM_CO += 1 ;
					break;
				}
			}
			else{
				break;
			}

	}
	printf("no of charactors are %d \n",SUM_C);
	printf("no of spaces are %d \n",SUM_S);
	printf("no of tabes are %d \n",SUM_T);
	printf("no of new lines are %d \n",SUM_N);
	printf("no of comments are %d \n",SUM_CO);
}