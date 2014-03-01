#include<stdio.h>
#include<WinSock2.h>
#include<stdlib.h>

int connect_server(){
	WSADATA wsa;
	SOCKET F_socket;
	struct sockaddr_in server;

	printf("initializing...\n");
	if(WSAStartup(MAKEWORD(2,2),&wsa) != 0){
		printf("Error code: %d",WSAGetLastError);
		return 1;
	} else{
		printf("Initialized \n");
	}

	if( (F_socket = socket(AF_INET,SOCK_STREAM,0)) == INVALID_SOCKET){
		printf("Error code: %d",WSAGetLastError);
		return 1;		
	} else{
		printf("socket created \n");
	}

	server.sin_addr.S_un.S_addr= inet_addr("74.125.225.50");
	server.sin_family = AF_INET;
	server.sin_port = htons(80);

	if (connect(F_socket , (struct sockaddr *)&server , sizeof(server)) < 0)
	{
		puts("connect error");
		return 1;
	}else{

		puts("Connected");
	}
	return 0;

}