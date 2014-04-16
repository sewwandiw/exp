#include<iostream>
#include<math.h>
#include<malloc.h>
#include<ctime>


using namespace std;

enum EMove {
	keUp = 'w',
	keDown = 'z',
	keLeft = 'a',
	keRight = 's'
};

typedef struct point{
	int iRow;
	int iColomn;
};

void Move(char **cBoard,EMove Direction);
point LocateSpace(char **cBoard,EMove Direction);
void PrintBoard(char **cBoard);

void Initialize(char **cBoard){
	int k = 0 ;
	for (int i = 0 ; i < 2 ; i++){
		for (int j = 0 ; j < 4 ; j++){
			cBoard[i][j] = j+k+1+'0';
		}
		k = 4;
	}

	cBoard[2][0]= '9';
	cBoard[2][1]= 'A';
	cBoard[2][2]= 'B';
	cBoard[2][3]= 'C';
	cBoard[3][0]= 'D';
	cBoard[3][1]= 'E';
	cBoard[3][2]= 'F';
	cBoard[3][3]= ' ';
}

void PrintBoard(char **cBoard){
	for (int i  = 0 ; i < 4 ; i++){
		for (int j = 0 ; j < 4 ; j++){
			cout<< *(cBoard[i]+j)<<" ";
		}
		cout<<endl;
	}

}

void Randomize(char **cBoard){
	srand((unsigned int)time(0));
	for (int i = 0 ; i < 100000 ; i++){
		const int kimove = rand() %4;
		switch(kimove){
		case 0:{
			Move(cBoard,keUp);
			break;
			   }
		case 1:{
			Move(cBoard,keDown);
			break;
			   } 
		case 2:{
			Move(cBoard,keLeft);
			break;
			   }
		case 3:{
			Move(cBoard,keRight);
			break;
			   }
		}
	}

}

void Move(char **cBoard, const EMove Direction){
	point p;
	int NewRow;
	int NewColomn;
	p = LocateSpace(cBoard,Direction);
	if (p.iColomn == ' ' && p.iRow == ' '){
		return;
	}else{
		switch(Direction){
		case keUp:{
			NewRow = p.iRow - 1;
			NewColomn = p.iColomn;
			break;
				  }
		case keDown:{
			NewRow = p.iRow + 1;
			NewColomn = p.iColomn;
			break;
					}
		case keLeft:{
			NewRow = p.iRow;
			NewColomn = p.iColomn - 1;
			break;
					}
		case keRight:{
			NewRow = p.iRow;
			NewColomn = p.iColomn + 1;
			break;
					 }

		}
	}

	cBoard[p.iRow][p.iColomn] = cBoard[NewRow][NewColomn];;
	cBoard[NewRow][NewColomn] = ' ';

}
point LocateSpace(char **cBoard,EMove Direction){
	point p;
	p.iRow = ' ';
	p.iColomn = ' ';
	for (int i = 0 ; i < 4 ; i++){
		for (int j = 0; j < 4 ; j++){
			if (cBoard[i][j] == ' '){
				if ( (i == 3) && (Direction== keDown)){
					p.iColomn = ' ';
					p.iRow = ' ';
				} else if(( (j == 3) && (Direction== keRight))){
					p.iColomn = ' ';
					p.iRow = ' ';
				} else if ((i == 0) && (Direction== keUp)){
					p.iColomn = ' ';
					p.iRow = ' ';				
				} else if ((j == 0) && (Direction== keLeft)){
					p.iColomn = ' ';
					p.iRow = ' ';	
				}else{
					p.iRow = i;
					p.iColomn = j;	
				}

			}
		}
	}
	return p;
}

void Play(char **cBoard){
	char cNextMove;
	do{
		cout<<"Enter the request: UP - 'w' , DOWM - 'z' , Left - 'a' , Right - 's'"<<endl;
		cin >> cNextMove;
		EMove eNextMove = (EMove) cNextMove;
		if ((eNextMove == keUp) ||(eNextMove == keDown)|| (eNextMove == keLeft)|| (eNextMove == keRight)){
			Move(cBoard,eNextMove);
			cout<<endl;
			PrintBoard(cBoard);
		} else{
			cout<<"Invalid Move: try again"<<endl;
			Play(cBoard);
		}
	} while(true);

	free(cBoard);
}

void main(){
	char **cBoard;
	if ((cBoard = (char** )malloc( 4*sizeof(char*))) == NULL ){}
	for ( int i = 0; i < 4; i++ )
	{
		if ((cBoard[i] = (char*)malloc(4)) == NULL){}
	}

	std::cout<< "Initail board"<<std::endl;
	Initialize(cBoard);
	PrintBoard(cBoard);
	std::cout<<std::endl;
	std::cout<< "Randomized board"<<std::endl;
	Randomize(cBoard);
	PrintBoard(cBoard);
	std::cout<<std::endl;
	Play(cBoard);
		
}