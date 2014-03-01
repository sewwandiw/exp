#include<stdlib.h>
#include<stdio.h>
#include<WinSock2.h>
#include<string.h>

int get_IP(){
	WSADATA wsa;
	char *hostname = "www.google.com";
	char IP[100];
	struct hostent *host;
	struct in_addr **add_list;
	int i ;

	printf("Initializing ...\n");
	if ((WSAStartup(MAKEWORD(2,2),&wsa)) != 0 ){
		printf("Error initialization.code: %d \n",WSAGetLastError);

	}else{
		printf("Initailaized \n ");
	}

	if ( (host = gethostbyname(hostname)) == NULL) {
		printf("no IP found.code: %d \n",WSAGetLastError);

	}else{
		add_list = (struct in_addr**)host->h_addr_list;
		for (i = 0 ; add_list[i] != NULL ; i++){
			strcpy(IP,(inet_ntoa)(*add_list[i]));
		}
	}
	
	printf("%s resolved to : %s\n" , hostname , IP);
	return 0;
}
