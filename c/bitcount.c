#include<stdio.h>
#include<stdlib.h>

int bitcount(unsigned char x) 

{ int count;

for (count=0; x != 0; x>>=1)
	printf("%d \n",x);
	if ( x & 01){
		count++;
		printf("%d \n",x);
	}
return count;
}


