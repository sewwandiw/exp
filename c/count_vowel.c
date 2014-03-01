#include<stdio.h>
#include<math.h>
#include<string.h>

int count_vowel(){
	char word[30];
	int i;
	int a_count = 0;
	int e_count =0;
	int i_count =0;
	int o_count =0;
	int u_count =0;
	int w_count =0;
	int null = 0;
	memset(word,'\0',30);
	printf("Enter the word \n");
	gets(word);
	
	for (i = 0 ; i <30 ; i++){
		switch (word[i]){
		case 'a':
			a_count += 1;
			break;
		case 'e':
			e_count += 1;
			break;
		case 'i':
			i_count += 1;
			break;	
		case 'o':
			o_count += 1;
			break;

		case 'u':
			u_count += 1;
			break;
		case '\0':
			null += 1;
			break;
		default:
			w_count += 1;
			break;
		}
	}


	printf("a %d \t e %d  \t i %d \t o %d \t u %d \t other word %d \n",a_count,e_count,i_count,o_count,u_count,w_count);

}
