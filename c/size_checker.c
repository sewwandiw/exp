#include<stdio.h>
#include<math.h>

int size_checker(){
	int number[2];
	char name[10];
	int large;
	printf("Enter the 2 numbers \n");
	scanf("%d %d %s",&number[0],&number[1],&name);
	if (number[0] != number[1]){
		large = (number[0] > number[1]) ? number[0] : number[1];
		printf("largest is %d %s \n", large,name);}
	else{
		printf("word Error \n");
	}
}