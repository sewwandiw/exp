#include<stdio.h>
#include<stdlib.h>

#define NULL 0

typedef struct{
	int data;
	struct node *left;
	struct node *right;
} node;

node *add_node(int dataitem, node *head);
void build_tree(){
	node *head;
	int dataitem = NULL;
	head = NULL;

	do{
		printf("Enter the data to be added \n");
		scanf("%d",&dataitem);

		head = add_node(dataitem,head);
		printf("%d \n",head->data);

	}
	while(dataitem != NULL);
}
node *add_node(int dataitem,node *head){
	node *new_node;
	node *right_node = head;
	node *left_node = head;

	if(head == NULL){
		head = (struct node *)malloc(sizeof(node));
		head->data = dataitem;
		head->left = NULL;
		head->right = NULL;
		return head;
	} else {
		new_node = (struct node *)malloc(sizeof(node));
		if ((head->left == NULL) || (head->right == NULL)){
			if(head->data > dataitem){
				head->left = new_node;
				new_node->left = NULL;
				new_node->right = NULL;
				new_node->data = dataitem;
				return head;
			} else {
				head->right = new_node;
				new_node->right = NULL;
				new_node->left =NULL;
				new_node->data = dataitem;
				return head;
			}
		} else {
			right_node = right_node->right;
			left_node = left_node->left;

			if(dataitem > right_node->data){
				right_node->right = new_node;
				new_node->right = NULL;
				new_node->left = NULL;
				new_node->data = dataitem;
				return right_node;

			}else if (dataitem < right_node->data){
				right_node->left = new_node;
				new_node->right = NULL;
				new_node->left = NULL;
				new_node->data = dataitem;
				return right_node;			

			} else if(dataitem < left_node->data){
				left_node->left = new_node;
				new_node->right = NULL;
				new_node->left = NULL;
				new_node->data = dataitem;
				return left_node;

			} else if(dataitem > left_node->data){
				left_node->right = new_node;
				new_node->right = NULL;
				new_node->left = NULL;
				new_node->data = dataitem;
				return left_node;


			}
		}
	}

}