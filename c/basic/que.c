//#include<stdio.h>
//#include<stdlib.h>
//#include<ctype.h>
//
//#define FALSE 0
//#define NULL 0
//
//typedef struct {
//	int data;
//	struct listelements *link;
//} listelements;
//
//void action_perform();
//void menu(int *choice);
//listelements *add_item( listelements *listpointer,int dataitem);
//listelements *remove_item( listelements *listpointer);
//void printqueue(listelements *linkpointer);
//void clear_queue(listelements *linkpointer);
//
//
//void action_perform(){
//	listelements *listpointer;
//	int dataitem,choice;
//
//	listpointer = NULL;
//	do{
//		menu(&choice);
//		switch(choice){
//		case 1 :
//			printf("Enter the data to be added \n");
//			scanf("%d",&dataitem);
//			listpointer  = add_item(listpointer,dataitem);
//			break;
//		case 2:
//			if (listpointer == NULL){
//				printf("Queue is empty");
//			}
//			else{
//				listpointer = remove_item(listpointer);
//			}
//		case 3 :
//			printqueue(listpointer);
//			break;
//		case 4:
//			break;
//		default:
//			printf("Invalid menu \n");
//		}
//	}
//	while (choice != 4);
//	clear_queue(listpointer);
//}
//
//void menu(int *choice){
//	char request;
//	printf("Enter 1 to add item \nEnter 2 to remove item \nEnter 3 to print que \nEnter 4 to quit \n ");
//	do{
//		request = getchar();
//		if ((isdigit (request) == FALSE) && (request!= '\n')) {
//			printf ("\nyou must enter an integer.\n");
//			printf ("Enter 1 to add, 2 to remove, 3 to print, 4 to quit\n");
//		}
//	} while (isdigit ((unsigned char) request) == FALSE);
//	*choice = (int)request - '0';
//
//}
//
//listelements *add_item( listelements *listpointer,int dataitem){
//	listelements *IP = listpointer;
//
//	if (listpointer != NULL){
//		while (listpointer ->link != NULL){
//			listpointer = listpointer->link;
//		}
//		listpointer->link = (struct listelements *)malloc (sizeof(listelements));
//		listpointer = listpointer->link;
//		listpointer->link = NULL;
//		listpointer->data = dataitem;
//		return IP;
//	}
//	else{
//		listpointer = (struct listelements *)malloc(sizeof(listelements));
//		listpointer->link = NULL;
//		listpointer->data = dataitem;
//		return listpointer;
//	}
//
//}
//
//
//listelements *remove_item( listelements *listpointer){
//	listelements *temp ;
//	printf("Element %d removed \n",listpointer ->data);
//	temp = listpointer->link;
//	free(listpointer);
//	return temp;
//}
//
//
//
//void printqueue(listelements *linkpointer){
//	if (linkpointer == NULL){
//		printf("Queue is empty \n");
//	}
//	else{
//		while (linkpointer != NULL){
//			printf("%d \n",linkpointer->data);
//			linkpointer = linkpointer->link;
//		}
//	}
//
//}
//
//void clear_queue(listelements *linkpointer){
//	while(linkpointer != NULL){
//		linkpointer = remove_item(linkpointer);
//	}
//
//}