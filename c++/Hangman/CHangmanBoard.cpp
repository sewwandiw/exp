#include<iostream>
#include<string.h>
#include"CHangmanBoard.h"
#define SIZE 8
using namespace std;

CHangmanBoard::CHangmanBoard(){
	qBaord = new char*[SIZE];
		for(int i = 0; i < SIZE; ++i){
			qBaord[i] = new char[SIZE];
		}

		for (int iRow = 0 ; iRow < SIZE ; iRow++){
			for (int iColomn = 0 ; iColomn < SIZE ; iColomn++){
				if (iRow == 0){
					qBaord[iRow][iColomn] = '_';
				}
				else if ( (iColomn == 1) && (iRow >0)){
					qBaord[iRow][iColomn] = '|';
				}
				else if ( (iColomn == (SIZE-2)) && ( iRow < 3)){
					qBaord[iRow][iColomn] = '|';
				}
				else
				{
					qBaord[iRow][iColomn] = ' ';
				}
			}
		}


}

