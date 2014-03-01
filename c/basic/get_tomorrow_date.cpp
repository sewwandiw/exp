//
//#include <stdio.h>
//#include<stdlib.h>
//#include<time.h>
//#include<string.h>
//
//int  i;
//
//typedef enum  {
//	Monday,Tuesday,Wednsday,Thursday,Friday,Satrurday,Sunday
//}days;
//
//void print_date(days d,char* day,int today_date);
//int main(){
//	char buffer[32];
//	char date_b[10];
//    int today;
//	size_t last;
//	struct tm *ts;
//	time_t timestamp = time(NULL);
//	time_t now;
//	time_t date;
//	time(&now);
//	//printf("%s \n", ctime(&now));
//	ts   = localtime(&timestamp);
//	last = strftime(buffer, 32, "%A", ts);
//	date = strftime(date_b, 10, "%d", ts);
//	today = atoi(date_b);
//	//printf("%d\n",today );
//	print_date(1,buffer,today);
//	return 0 ;
//}
//
//void print_date(days d,char* day,int today_date){
//
//	const char* days[] = {"Monday","Tuesday","Wednsday","Thursday","Friday","Saturday","Sunday"};
//	printf(" today is %d %s\n",today_date,day);
//	for (i = d ;i <= Sunday; i++){
//		if (strcmp(days[i],day) == 0){
//			if (i <=5)
//				printf(" tomorrow is  %d %s \n",today_date+1,days[i+1]);
//			else
//				printf("tomorrow is %d %s \n",today_date,days[0]);
//		}
//
//	}
//
//}