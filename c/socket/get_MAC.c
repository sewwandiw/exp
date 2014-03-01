#include<stdio.h>
#include<WinSock2.h>
#include<IPHlpApi.h>

void get_MAC(unsigned char* mac,struct in_addr des_IP);
int get_data(){
	unsigned char mac[6];
	struct in_addr source_IP;
	char IP[32];
	WSADATA fist_socket;

	printf("Initializaing...\n");
	if(WSAStartup(MAKEWORD(2,2),&fist_socket) != 0) {
		printf("initialization failed.%d \n",WSAGetLastError);
	}else{
		printf("Initialized. \n");
	}

	printf("Enter the IP address. \n");
	scanf("%s",&IP);
	source_IP.S_un.S_addr = inet_addr(IP);

	get_MAC(mac,source_IP);
	printf("Selected device has mac address : %.2X-%.2X-%.2X-%.2X-%.2X-%.2X",mac[0],mac[1],mac[2],mac[3],mac[4],mac[5]);
	printf("\n");   
	return 0;
}

void get_MAC(unsigned char* mac,struct in_addr des_IP){
	DWORD ret;
	IPAddr src_IP;
	ULONG mac_add[2];
	ULONG phy_add_len = 6;
	int i;

	src_IP = 0;
	ret = SendARP((IPAddr)des_IP.S_un.S_addr,src_IP,mac, &phy_add_len);

	if (phy_add_len){

		BYTE *bmac_add = (BYTE *)&mac_add;
		for (i = 0 ; i <phy_add_len ;i++){
			mac[i] = (char) bmac_add[i];

		}	

	}

}