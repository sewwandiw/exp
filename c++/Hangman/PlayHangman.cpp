#include<iostream>
#include<string>
#include<string.h>
#include<ctime>
#include"CUpdateBoard.h"
#include"PlayHugman.h"

PlayHangman::PlayHangman(string *sWords, int iNofWords){
	time_t qTime;
	time(&qTime);
	srand((unsigned int)qTime);
	int selction = (rand()% iNofWords);
	string Word = sWords[selction]; 
	Length = Word.length();
	cWord = (char*) malloc(Length*sizeof(char));
	BuildWord = (char*) malloc(Length*sizeof(char));

	for (int i = 0 ; i < Length; i++){
		strncpy(&cWord[i],&Word.at(i),1);
		BuildWord[i] = 'x';
	}
}

void PlayHangman::Game(char Input){

	OldCount = CorrectCount;	

	for (int i = 0 ; i < Length; i++){
		if (cWord[i] == Input){
			BuildWord[i] = Input;
			CorrectCount++;
		}
	}

	for (int i = 0 ; i < Length; i++){
		cout  << BuildWord[i];
	}
	cout<<endl;

	if (OldCount == (Length)){
		cout<<" You Win! "<< endl;
	}else if (OldCount == CorrectCount){
		Count++;
	}
	if (Count > 6){
		cout<<" You Lost! "<< endl;
	}
	if ((OldCount <= CorrectCount) && (Count <= 6)){
		CUpateBoard newBoard(Count);
		Board = newBoard.UpdateBoard();
		newBoard.PrintBoard(Board);
	}

}


