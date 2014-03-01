#include <stdio.h>
#include <math.h>

int getpermutation(){
	int numbers[] = {1,2,3};
	int permutation[3];
    int len = sizeof(numbers)/sizeof(int);
	int no_of_permutation = 1;
	int i;
	int k ;
	int j = 0;
	for (i = len ; i > 0;  i--){
		no_of_permutation = no_of_permutation * i;
	}

	printf("%d \n", no_of_permutation);

	for (i = 0 ; i < 3 ; i++){
		for (j = 0 ; j <2 ; j++){
			permutation[0] = numbers[i];
			k = i + j + 1 ;
			if (k > 2){
				k = k - 3 ;}
			permutation[1] = numbers[k];
			printf("%d %d %d \n",permutation[0],permutation[1]);
		}
	}
}

