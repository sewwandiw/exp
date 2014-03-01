#include<io.h>
#include <sys/types.h>
#include <dirent.h>
#include <stdio.h>
#include<stdlib.h>
#define MAX_BUFF 100

typedef struct{
	char*dp_N[MAX_BUFF];
	int count;
} dir_content;

dir_content scan_dir(char *name);
void match_word(char *word,char*location);

int main(){
	//dir_content dir;
	//int j;
	//char *name = "E:\\Programing\\C";
	//dir = scan_dir(name);
	//for (j = 0 ; j < dir.count ; j++){
	//	scan_dir(dir.dp_N[j]);
	//}
	char *location = "E:\\Programing\\C\\Experiment\\Marshall\\Marshall";
	char *word = "Line";
	match_word(word,location);
	
}


