#include<iostream>
#include<string>
#include"CUpdateBoard.h"
#include"CHangmanBoard.h"

CUpateBoard::CUpateBoard(int iIndex) : sCount(iIndex) {}
char** CUpateBoard::UpdateBoard(){
	for (int iRow = 0 ; iRow < SIZE ; iRow++){
		for (int iColomn = 0 ; iColomn < SIZE ; iColomn++){
			if (sCount ==1 ){
				qBaord[3][SIZE-2] = '0';
			}
			else if ((sCount== 2)){
				qBaord[3][SIZE-2] = '0';
				qBaord[4][SIZE-2] = 'X';
			}
			else if ((sCount== 3)){
				qBaord[3][SIZE-2] = '0';
				qBaord[4][SIZE-2] = 'X';
				qBaord[4][SIZE-3] = '/';
			}
			else if ((sCount== 4)){
				qBaord[3][SIZE-2] = '0';
				qBaord[4][SIZE-2] = 'X';
				qBaord[4][SIZE-3] = '/';
				qBaord[4][SIZE-1] = '\\';
			}
			else if ((sCount== 5)){
				qBaord[3][SIZE-2] = '0';
				qBaord[4][SIZE-2] = 'X';
				qBaord[4][SIZE-3] = '/';
				qBaord[4][SIZE-1] = '\\';
				qBaord[5][SIZE-3] = '/';
			}
			else if ((sCount== 6)){
				qBaord[3][SIZE-2] = '0';
				qBaord[4][SIZE-2] = 'X';
				qBaord[4][SIZE-3] = '/';
				qBaord[4][SIZE-1] = '\\';
				qBaord[5][SIZE-3] = '/';
				qBaord[5][SIZE-1] = '\\';
			}
		}
	}
	return qBaord;		
}

void CUpateBoard::PrintBoard(char **qBaord){
	for (int iRow = 0 ; iRow < SIZE ; iRow++){
		for (int iColomn = 0 ; iColomn < SIZE ; iColomn++){
			cout << qBaord[iRow][iColomn];
		}
		cout <<endl;
	}


}
