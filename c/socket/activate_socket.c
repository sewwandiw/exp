#include<stdint.h>
#include<stdio.h>
#include<WinSock2.h>

#define MAX_BUFF 2000

int activate_socket(){
	WSADATA wsa;
	SOCKET F_socket;
	struct sockaddr_in server;
	char *message;
	char server_reply[MAX_BUFF];
	int recieve_size;

	memset(server_reply,'\0',MAX_BUFF);

	if( WSAStartup(MAKEWORD(2,2),&wsa) != 0){
		printf("Error code: %d \n",WSAGetLastError);
	} else{
		printf("Initialied \n");
	}
	if((F_socket = socket(AF_INET,SOCK_STREAM,0)) == INVALID_SOCKET){	
		printf("Error code: %d \n",WSAGetLastError);
	} else{
		printf("socket created \n");
	}
	server.sin_addr.S_un.S_addr = inet_addr("74.125.225.50");
	server.sin_family = AF_INET;
	server.sin_port = htons(80);

	if ( connect(F_socket, (struct sockaddr *)&server,sizeof(server)) < 0){

		printf("Connection failed.Error code: %d \n",WSAGetLastError);
	} else{
		printf("connected");
	}

	message = "GET / HTTP/1.1\r\n\r\n";
	if(send(F_socket,message,strlen(message),0) < 0){
		printf("send failed.Error code: %d \n",WSAGetLastError);
	} else{
		printf("sent");
	}

	if ((recieve_size = recv(F_socket,server_reply,sizeof(server_reply),0)) < 0){
		printf("receive failed.Error code: %d \n",WSAGetLastError);
		return 1;
	} else{
		printf("received");
	}
	puts(server_reply);	
	closesocket(F_socket);
	WSACleanup();
	return 0 ;
}





