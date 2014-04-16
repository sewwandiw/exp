#include <iostream>
#define Numbers 9

void TicTacToe(){
	int i;
	char cPlayer[2];
	bool bwin(false);
	cPlayer[0] = 'O';
	cPlayer[1] = 'X';
	int iNumber;
	char AllNumbers[Numbers];

	for (i = 0; i < Numbers ; i ++){
		AllNumbers[i] = (i+1)+'0' ;
		std::cout<< AllNumbers[i];
		std::cout<<" ";
		if (((i+1) % 3)==0){
			std::cout << std::endl;
			std::cout <<"-+-+-+"<<std::endl;
		}	  
	}

	while(1){
		std::cout<<"Enter the 1st palyer move"<<std::endl;
		std::cin >>iNumber;
		for (i = 0; i < Numbers ; i ++){
			if ( ((i + 1) == iNumber)){
				if ((AllNumbers[i] != cPlayer[0]) || (AllNumbers[i] != cPlayer[1]) ){
					AllNumbers[i] = cPlayer[0];
				} else{
					std::cout<<"Enter valid number"<<std::endl;
				}
			}
		}
		std::cout<<"Enter the 2nd palyer move"<<std::endl;
		std::cin >>iNumber;
		for (i = 0; i < Numbers ; i ++){
			if ( ((i + 1) == iNumber)){
				if ((AllNumbers[i] == cPlayer[0]) || (AllNumbers[i] == cPlayer[1])){				
					std::cout<<"Enter valid number"<<std::endl;
				} else{
					AllNumbers[i] = cPlayer[1];
				}
			}
		}

		for (i = 0; i < Numbers ; i ++){
			std::cout<<AllNumbers[i];
			std::cout<<" ";
			if (((i+1) % 3)==0){
				std::cout << std::endl;
				std::cout <<"-+-+-+"<<std::endl;
			}	
		}
		for (i = 0; i < 2 ; i ++){
			if ((((AllNumbers[0]==cPlayer[i]) && (AllNumbers[1]==cPlayer[i]) && (AllNumbers[2])==cPlayer[i])) ||
				(((AllNumbers[0]==cPlayer[i]) && (AllNumbers[3]==cPlayer[i]) && (AllNumbers[6])==cPlayer[i])) ||
				(((AllNumbers[0]==cPlayer[i]) && (AllNumbers[4]==cPlayer[i]) && (AllNumbers[8])==cPlayer[i])) ||
				(((AllNumbers[1]==cPlayer[i]) && (AllNumbers[4]==cPlayer[i]) && (AllNumbers[7])==cPlayer[i])) ||
				(((AllNumbers[2]==cPlayer[i]) && (AllNumbers[5]==cPlayer[i]) && (AllNumbers[8])==cPlayer[i])) ||
				(((AllNumbers[2]==cPlayer[i]) && (AllNumbers[4]==cPlayer[i]) && (AllNumbers[6])==cPlayer[i])) ||
				(((AllNumbers[3]==cPlayer[i]) && (AllNumbers[4]==cPlayer[i]) && (AllNumbers[5])==cPlayer[i])) ||
				(((AllNumbers[6]==cPlayer[i]) && (AllNumbers[7]==cPlayer[i]) && (AllNumbers[8])==cPlayer[i]))){
					std::cout<<"Player "<< (i+1) <<" Win"<<std::endl;
					bwin = true;
					break;
			}
		}
		if (bwin == true){
			break;
		}
	}
}

void main(){
	TicTacToe();
}