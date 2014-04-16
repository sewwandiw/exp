#include<iostream>
#include<string>
#include<string.h>
#include<ctime>

#include"CUpdateBoard.h"

static char *BuildWord;
static int Count = 0;
static int CorrectCount = 0;

class PlayHangman{
private:
	char *cWord;
	char **Board;
	int Length;
	int OldCount;
public:
	PlayHangman(string *sWords, int iNofWords);	
	void Game(char Input);
	

};