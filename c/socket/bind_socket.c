#include<stdio.h>
#include<WinSock2.h>

int bind_socket(){

	WSADATA wsa;
	SOCKET my_socket;
	struct sockaddr_in server;

	printf("Initializing....\n");
	if(WSAStartup(MAKEWORD(2,2),&wsa) != 0){
		printf("Initialzation failed. Error: %d \n",WSAGetLastError);

	}else{
		printf("Initialzed. \n");	
	}

	if ( (my_socket = socket(AF_INET,SOCK_STREAM,0))== INVALID_SOCKET){
		printf("creation failed. Error: %d \n",WSAGetLastError);
		return 1;
	}else{
		printf("socket created. \n");	
	}

	server.sin_addr.S_un.S_addr =INADDR_ANY;
	server.sin_family = AF_INET;
	server.sin_port = htons(8888);

	if (bind(my_socket, (struct sockaddr *)&server,sizeof(server)) == SOCKET_ERROR){
		printf("bind failed. Error: %d \n",WSAGetLastError);
	}else{
		printf("socket bound. \n");	
	}

	closesocket(my_socket);
	return 0;

}