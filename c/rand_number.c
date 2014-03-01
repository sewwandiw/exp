#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int rand_number(int M,int N){
	int r, i;
	r = M + rand() / (RAND_MAX / (N - M + 1) + 1);   
	return r;
}