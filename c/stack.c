#include<stdio.h>
#include<stdlib.h>
#include<ctype.h>

#define FALSE 0
#define NULL 0

typedef struct {
	int data;
	struct listelements *link;
} listelements;

void action_perform_stack();
void menu(int *choice);
listelements *add_item( listelements *head,int dataitem);
listelements *remove_item( listelements *head);
void print_stack(listelements *head);
void clear_stack(listelements *head);


void action_perform_stack(){
	listelements *head; // Last in
	int dataitem,choice;

	head = NULL;
	do{
		menu(&choice);
		switch(choice){
		case 1 :
			printf("Enter the data to be added \n");
			scanf("%d",&dataitem);
			head  = add_item(head,dataitem);
			break;
		case 2:
			if (head == NULL){
				printf("Stack is empty");
			}
			else{
				head = remove_item(head);
			}
			break;
		case 3 :
			print_stack(head);
			break;
		case 4:
			break;
		default:
			printf("Invalid menu \n");
		}
	}
	while (choice != 4);
	clear_stack(head);
}

void menu(int *choice){
	char request;
	printf("Enter 1 to add item \nEnter 2 to remove item \nEnter 3 to print que \nEnter 4 to quit \n ");
	do{
		request = getchar();
		if ((isdigit (request) == FALSE) && (request!= '\n')) {
			printf ("\nyou must enter an integer.\n");
			printf ("Enter 1 to add, 2 to remove, 3 to print, 4 to quit\n");
		}
	} while (isdigit ((unsigned char) request) == FALSE);
	*choice = (int)request - '0';

}

listelements *add_item( listelements *head,int dataitem){
	listelements *temp;

	if (head != NULL){
		temp = (struct listelements *)malloc (sizeof(listelements));
		temp->link = head;
		temp->data = dataitem;
		head = temp;
		return head;
	}
	else{
		head = (struct listelements *)malloc(sizeof(listelements));
		head->link = NULL;
		head->data = dataitem;
		return head;
	}

}


listelements *remove_item( listelements *head){
	listelements *new_head;
	printf("Element %d removed \n",head ->data);
	new_head = head->link;
	free(head);
	return new_head;
}



void print_stack(listelements *head){
	if (head == NULL){
		printf("stack is empty \n");
	} else {
		while (head!= NULL){
			printf("%d \n",head->data);
			head = head->link;			
		}
	}
}

void clear_stack(listelements *head){
	while(head != NULL){
		head = remove_item(head);	
	}
}