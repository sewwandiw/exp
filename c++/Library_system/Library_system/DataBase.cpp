#include<iostream>
#include<string>
#include<fstream>
#include <vector>
#include<string.h>
#include "Book.h"
#include "DataBase.h"
using namespace std;


DataBase::DataBase(string fileName){
	sfileName = fileName;	
}

DataBase::~DataBase() {}

void DataBase:: BuildDataBase(Book *qBook){
	OFileDataBase.open(sfileName,std::ios_base::app);
	OFileDataBase << qBook->iISBN <<"\t"<< *(qBook->sAuthor)<<"\t"<< *(qBook->sTitle) <<"\t"<< *(qBook->Availability) << endl;
	OFileDataBase.close();
}

vector<Book*> DataBase::ReadDataBase(){
	IFilteDataBase.open(sfileName);
	Book *qBook;
	vector<Book*> qOBook;

    int qiISBN;
	string qsAuthor;
	string qsTitle;
	string Avala;

	while(!IFilteDataBase.eof()){
		qBook = (Book*) malloc(sizeof(Book));
		IFilteDataBase >> qiISBN >> qsAuthor >> qsTitle >> Avala;
		qBook->iISBN = qiISBN;
		qBook->sAuthor = new string(qsAuthor);
		qBook->sTitle = new string(qsTitle);
		qBook->Availability = new string(Avala);
		qOBook.push_back(qBook);
	}
	IFilteDataBase.close();
	return qOBook;

}