#include<stdio.h>
#include<stdlib.h>
#include<WinSock2.h>
#include<string.h>
#define MAX_DATA 32 

int UDP_socket(){
	WSADATA wsa;
	SOCKET my_socket;
	struct sockaddr_in server,client;
	char buff[MAX_DATA];
	int receive_data_length,c;

	printf("Initailazing...\n");
	if( WSAStartup(MAKEWORD(2,2),&wsa)!= 0){
		printf("Initialziation error: %d \n",WSAGetLastError);
		return 1;
	} else{
		printf("Initaizaed.\n");
	}

	if( (my_socket = socket(AF_INET,SOCK_DGRAM,0))==INVALID_SOCKET){
		printf("creation error: %d \n",WSAGetLastError);
		return 1;
	} else{
		printf("created.\n");
	}

	server.sin_addr.S_un.S_addr = INADDR_ANY;
	server.sin_family = AF_INET;
	server.sin_port = htons(8888);

	if (bind(my_socket,(struct sockaddr*)&server,sizeof(server))==SOCKET_ERROR){
		printf("bind error: %d \n",WSAGetLastError);
		return 1;
	} else{
		printf("bound.\n");
	}

	while(1){
		printf("Waiting for data..\n");
		fflush(stdout);
		memset(buff,'\0',MAX_DATA);

		c = sizeof(struct sockaddr_in);
		if((receive_data_length = recvfrom(my_socket,buff,MAX_DATA,0,(struct sockaddr *)&client,&c))== SOCKET_ERROR){
			printf("receive error: %d \n",WSAGetLastError);
			return 1;
		} else{
			printf("receved from %d %s.\n" ,ntohs(client.sin_port),inet_ntoa(client.sin_addr));
		}

		if(sendto(my_socket,buff,receive_data_length,0,(struct sockaddr*)&client,c )==SOCKET_ERROR){
			printf("send error: %d \n",WSAGetLastError);
			return 1;
		} else{
			printf("sent \n");
		}
	}


	
	closesocket(my_socket);
	WSACleanup();
	return 0;
}