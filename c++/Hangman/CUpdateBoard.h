#ifndef CUPDATEBOARD_H
#define CUPDATEBOARD_H
#include<iostream>
#include<string>
#include"CHangmanBoard.h"

using namespace std;

class CUpateBoard : public CHangmanBoard{
private:
	int sCount;
public:
	CUpateBoard(int iIndex);
	char** UpdateBoard();
	void PrintBoard(char **qBaord);

};

#endif