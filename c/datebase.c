//#include <stdio.h>
//#include<stdlib.h>
//#include<time.h>
//#include<string.h>
//
//typedef struct {
//	int student_no;
//	char name[30];
//	int age;
//}student;
//
////int build_student(student s,int i);
//int build_ALL_student(student s[10],int i);
//
//int main(){
//	student s[10] = {NULL,NULL,NULL};
//	int i = 0;
//	char result[4];
//
//	printf("Do you want to enter student details \n");
//	scanf("%s",&result);
//
//	while( (strcmp(result,"yes") == 0 || strcmp(result,"Yes") == 0) && i < 10){
//
//		printf("Enter Name student name and age \n");
//		scanf("%s %d",&s[i].name,&s[i].age);
//		s[i].student_no = i+1;
//		//build_student(s[i],i+1);
//		printf("Do you want to enter student details \n");
//		scanf("%s",&result);		
//		i++;
//	}
//	build_ALL_student(s,i);
//}
//int build_student(student s,int i){
//	int j;
//	for (j = 0; j < i ; j++){
//		printf("%d \t %s \t %d \n",s.student_no,s.name,s.age);
//	}
//}
//
//int build_ALL_student(student s[10],int i){
//	int j;
//	printf("Student ID \t Name \t age \n");
//	for (j = 0; j < i ; j++){
//		printf("%d \t\t %s \t %d\n",s[j].student_no,s[j].name,s[j].age);
//	}
//}
