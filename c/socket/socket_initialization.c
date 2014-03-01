#include<WinSock2.h>
#include<stdlib.h>
#include<stdio.h>


int socket_initialization(){
	WSADATA wsa;

	printf("\nInitialising Winsock...");
	if (WSAStartup(MAKEWORD(2,2),&wsa) != 0)
	{
		printf("Failed. Error Code : %d",WSAGetLastError());
		return 1;
	}

	printf("Initialised.\n");
	return 0 ;
}