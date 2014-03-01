#include<stdio.h>
#undef Max(a,b) ((a)>(b) ? (a):(b)) 
#define swap(type, i, j) \
                 {type t = i;\
				 i = j;\
				 j = t;}

int swap_variable(char a,char b){
	printf("Before swap. a: %c, b: %c\n", a, b);
	swap(char, a, b)
	printf("After swap. a: %c, b: %c\n", a, b);
	return 0;
}