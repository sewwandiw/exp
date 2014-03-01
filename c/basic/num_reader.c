#include <stdio.h>
#include<math.h>

int num_reader(){
	int count = 1000;
	int sum = 0;

	while(count != -999){
		sum = sum + count;
		count = count -1;
		if (count == -999){ break;}
	} 

	printf("sum is %d \n" ,sum);

}