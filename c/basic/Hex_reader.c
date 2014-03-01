#include<stdio.h>

int hex_reader(){
    int i;
	char letter[2];
	int hex[2];

	printf("Enter the first charactor \n");
	scanf("%c", &letter[0]);
	getchar();
	printf("Enter the second charactor \n");
	scanf("%c", &letter[1]);
	getchar();


	for (i = 0 ; i < 2 ;i++){
		switch(letter[i]){
		case 'A':
			hex[i] =10;
			break;
		case 'B':
			hex[i] =11;
			break;
		case 'C':
			hex[i] =12;
			break;
		case 'D':
			hex[i] =13;
			break;
		case 'E':
			hex[i] =14;
			break;
		case 'F':
			hex[i] =15;
			break;
		default:
			hex[i] = 0;
			break;
		}
			printf("%d",hex[i]);
	}

}