#ifndef CHANGMANBOAR_H
#define CHANGMANBOAR_H
#include<iostream>
#include<string.h>
#define SIZE 8
using namespace std;


class CHangmanBoard{
public:
	char** qBaord;
	CHangmanBoard();
	virtual char** UpdateBoard() = 0 ;

};
#endif
