#include<stdlib.h>
#include<stdio.h>
#include<WinSock2.h>

int create_socket(){
	WSADATA wsa;
	SOCKET F_socket;

	printf("Initialiing the socket... \n");
	if(WSAStartup(MAKEWORD(2,2),&wsa) != 0){
		printf("Failed. Error code: %d",WSAGetLastError);
		return 1;
	} else{
		printf("Initialized \n");	
	}

	if( (F_socket = socket(AF_INET,SOCK_STREAM,0)) == INVALID_SOCKET){
		printf("Could not create the socket %d",WSAGetLastError);

	}
	else{
		printf("Socket created. \n");
	}

	return 0;
}