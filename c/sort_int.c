#include<stdlib.h>
#include<stdio.h>
#include<math.h>
#include<string.h>


typedef struct{
	int *intval[10];
	int length;
} int_array;

typedef struct{
	int min;
	int max;
	int *accending[10];
	int *decending[10];
}sort_array;

void get_int(int_array *my_array);
void min_max(int_array *my_array, sort_array *sorted_array);
void build_order(int_array *my_array, sort_array *sorted_array,int iteration,int*min, int*max,char request);

int sort_int(char request){
	int i = 0;
	int result_min;
	int result_max;
	int_array my_array;
	sort_array sorted_array;
	int *min;
	int *max;
	min = (int *)malloc(10*sizeof(int));
	max = (int *)malloc(10*sizeof(int));
	get_int(&my_array);

	for (i = 0 ; i < my_array.length ; i ++){
		min_max(&my_array,&sorted_array);
		build_order(&my_array, &sorted_array ,i,min,max,request);
	}
	for (i = 0 ; i < my_array.length ; i ++){
		if (request == 'D'){
			printf(" %d ",*sorted_array.decending[i]);
		} else {
			printf(" %d ",*sorted_array.accending[i]);	
		}
	}
}

void get_int(int_array *my_array){
	int *input[10];
	int i  = 0;
	do{
		input[i] = (int *)malloc(sizeof(int));  
		if (input[i] == NULL){
			printf("No memorry");
			break;
		}else{
			printf("Enter the integer \n");	
			scanf("%d",input[i]);
			my_array->intval[i] = input[i];
		}
		i++;
	}while (*(input[i-1]) > 0);	

	my_array->length = i-1;
}

void min_max(int_array *my_array,sort_array *sorted_array){
	int i;

	for (i =0 ; i < my_array->length ; i ++){
		if (*my_array->intval[i] != -1){
			sorted_array->max = *my_array->intval[i];
			sorted_array->min = *my_array->intval[i];
			break;
		}
	}
	for (i = 1 ; i < my_array->length ; i++){
		if ( (sorted_array->min > *my_array->intval[i]) && (*my_array->intval[i] != -1)){
			sorted_array->min = *my_array->intval[i];				
		}else if ( (sorted_array->min < *my_array->intval[i]) && (*my_array->intval[i] != -1)) {
			sorted_array->min = sorted_array->min;
		}else if((sorted_array->max = *my_array->intval[i]) || (sorted_array->min = *my_array->intval[i])){
			sorted_array->max = sorted_array->max;
			sorted_array->min = sorted_array->min;
		}

		if ( (sorted_array->max < *my_array->intval[i]) && (*my_array->intval[i] != -1)){
			sorted_array->max = *my_array->intval[i];
		}else if ( (sorted_array->max > *my_array->intval[i]) && (*my_array->intval[i] != -1)){
			sorted_array->max = sorted_array->max;
		}
		else if((*my_array->intval[i] == -1)){
			sorted_array->max = sorted_array->max;
			sorted_array->min = sorted_array->min;
		}else if((sorted_array->max = *my_array->intval[i]) || (sorted_array->min = *my_array->intval[i])){
			sorted_array->max = sorted_array->max;
			sorted_array->min = sorted_array->min;
		}
	}
}

void build_order(int_array *my_array, sort_array *sorted_array,int iteration, int *min, int*max,char request){
	int i = iteration;	

	if (request == 'A'){
		*(min + i) = sorted_array->min;
		sorted_array->accending[iteration] = min+i;
		for (i = 0 ; i < my_array->length ; i ++){
			if (*my_array->intval[i] == sorted_array->min){
				*my_array->intval[i] = -1;		
			}
		}
	}else{
		*(max + i) = sorted_array->max;
		sorted_array->decending[iteration] = max+i;
		for (i = 0 ; i < my_array->length ; i ++){
			if (*my_array->intval[i] == sorted_array->max){
				*my_array->intval[i] = -1;		
			}
		}
	}
}