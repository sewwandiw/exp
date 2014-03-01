#include<stdlib.h>
#include<stdio.h>
#include<WinSock2.h>
#include<string.h>

#define MAX_CLIENT 30
#define MAX_Data 1024

int TCP_socket(){

	WSADATA wsa;
	SOCKET server_socket;
	SOCKET client_socket[MAX_CLIENT];
	SOCKET new_socket;
	SOCKET temp_client;
	struct sockaddr_in server;
	struct sockaddr_in clients;
	int length ;
	int i;
	int socket_handled, data_read, error_code;
	char *message;
	char* incoming_data;
	fd_set read;

	printf("Initialising...\n");
	if (WSAStartup(MAKEWORD(2,2),&wsa) != 0 ){
		printf("Initialization error. %d \n",WSAGetLastError);

	}else{
		printf("Initialized.\n");
	}

	if( (server_socket = socket(AF_INET,SOCK_STREAM,0))== INVALID_SOCKET){
		printf("creation error. %d \n",WSAGetLastError);

	}else{
		printf("port created.\n");
	}

	server.sin_addr.S_un.S_addr = INADDR_ANY;
	server.sin_family  = AF_INET;
	server.sin_port = htons(8888);

	if( (bind(server_socket,(struct sockaddr *)&server,sizeof(server))) == SOCKET_ERROR ){
		printf("bind error. %d \n",WSAGetLastError);

	}else{
		printf("bound.\n");
	}

	listen(server_socket,3);
	printf("Waiting for incoming connection.\n");

	length =sizeof (struct sockaddr_in);

	for (i = 0 ; i < MAX_CLIENT ; i++){
		client_socket[i] = 0 ;	
	}

	while(TRUE){
		FD_ZERO(&read);
		FD_SET(server_socket,&read);

		for (i = 0 ; i < MAX_CLIENT ; i++){
			temp_client = client_socket[i];
			if (temp_client > 0){
				FD_SET(temp_client,&read);	
			}
		}
	}
	socket_handled = select(0,&read,NULL,NULL,NULL);
	if (socket_handled == SOCKET_ERROR){
		printf("select error. %d \n",WSAGetLastError);
		exit(EXIT_FAILURE);
	}

	message = "ECHO Daemon v1.0 \r\n";
	incoming_data = (char*)malloc((MAX_Data+1)*sizeof(char));

	if(FD_ISSET(server_socket,&read)){
		if ( (new_socket = accept(server_socket, (struct sockaddr *)&client_socket,&length)) == INVALID_SOCKET){
			perror("Accept");
			exit(EXIT_FAILURE);
		} else {
			printf("New connection. socket fd is %d ip is %s port is %d \n",new_socket,inet_ntoa(clients.sin_addr),ntohs(clients.sin_port));
			send(server_socket,message,strlen(message),0);
			puts("Welcome from server \n");
		}

		for (i = 0 ; i < MAX_CLIENT ; i++){

			if(client_socket[i]==0){
				client_socket[i] = new_socket;
				printf("Adding new client at index %d \n", i);
				break;
			}
		}

	} else {
		for (i = 0 ; i < MAX_CLIENT ; i++){
			if( FD_ISSET(client_socket[i],&read)){
				getpeername(client_socket[i], (struct sockaddr *)&clients,&length);
				data_read = recv(client_socket[i],incoming_data,MAX_Data,0);
			}		
			if (data_read == SOCKET_ERROR){
				error_code = WSAGetLastError();
				if (error_code == WSAENOTCONN){
					puts("The socket is not connected.");
					closesocket(client_socket[i]);
					client_socket[i] = 0 ;
				}
				else{
					printf("Error code is %d \n",WSAGetLastError);				
				}

			}
			else if (data_read ==  0){
				printf("connection has been gracefully closed. \n");

				closesocket(client_socket[i]);
				client_socket[i] = 0 ;
			} else {
				incoming_data[data_read] = '\0';
				printf("%s:%d - %s \n" , inet_ntoa(clients.sin_addr) , ntohs(clients.sin_port), incoming_data);
				send(client_socket[i],incoming_data,strlen(incoming_data),0);
			}

		}

	}

	closesocket(server_socket);
	WSACleanup();
	return 0;

}