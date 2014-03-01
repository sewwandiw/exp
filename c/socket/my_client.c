#include<stdio.h>
#include<stdlib.h>
#include<WinSock2.h>
#include<string.h>

#define MAX_DATA 256

int my_client(){

	WSADATA wsa;
	SOCKET my_socket;
	struct sockaddr_in client;
	char message[MAX_DATA],buffer[MAX_DATA];
	int c = sizeof(client);

	printf("Initializing...\n");
	if (WSAStartup(MAKEWORD(2,2),&wsa) != 0 ){
		printf("Initialziation error: %d \n",WSAGetLastError);
		return 1;
	} else{
		printf("Initaizaed.\n");
	}

	if ((my_socket = socket(AF_INET,SOCK_DGRAM,0)) == INVALID_SOCKET){
		printf("creation error: %d \n",WSAGetLastError);
		return 1;
	} else{
		printf("created.\n");
	}

	memset((char *)&client,0,sizeof(client));
	client.sin_addr.S_un.S_addr = inet_addr("127.0.0.1");
	client.sin_family = AF_INET;
	client.sin_port = htons(8888);

	while(1){
		printf("Enter the message: \n");
		gets(message);

		if (sendto(my_socket,message,strlen(message),0,(struct sockaddr*)&client,c) == SOCKET_ERROR){
			printf("sned error: %d \n",WSAGetLastError);
			return 1;
		} else{
			printf("sent.\n");
		}

		memset(buffer,'\0',MAX_DATA);
		if(recvfrom(my_socket,buffer,MAX_DATA,0,(struct sockaddr *)&client,&c) == SOCKET_ERROR){
			printf("receive error: %d \n",WSAGetLastError);
			return 1;
		} else{
			printf("recived \n");
			puts(buffer);
		}	

	}


	closesocket(my_socket);
	WSACleanup();




}