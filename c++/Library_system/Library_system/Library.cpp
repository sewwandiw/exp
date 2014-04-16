#include<iostream>
#include<string>
#include<fstream>
#include <vector>
#include<string.h>
#include <cstdio>
#include <sstream>
#include<time.h>
#include "Book.h"
#include "DataBase.h"
#include "Library.h"

using namespace std;

Library::Library(Book *RBook, string FileName)
{
	qRBook = RBook ;
	sOFileName = FileName;
	TempFileName = "Temp.txt";
}
Library::~Library(){}

void Library::removeBook(){

	outFile.open(TempFileName);
	inFile.open(sOFileName);
	DataBase qOdataBase(TempFileName);

	Book *qBook;
	vector<Book*> qOBook;
	int qiISBN;
	string qsAuthor;
	string qsTitle;
	string Avail;

	while(!inFile.eof()){
		qBook = (Book*) malloc(sizeof(Book));
		inFile >> qiISBN >> qsAuthor >> qsTitle >> Avail;
		qBook->sAuthor = new string(qsAuthor);
		qBook->sTitle = new string(qsTitle);
		qBook->Availability = new string(Avail);

		if ( (qBook->iISBN = qiISBN) == (qRBook->iISBN)){
			cout<<"Removed"<< endl;
			break;
		}else{
			qOBook.push_back(qBook);
		}
	}
	for (int i = 0 ; i < (qOBook.size());i++){
		qOdataBase.BuildDataBase(qOBook.at(i));
	}

	inFile.close();
	outFile.close();
	remove(sOFileName.c_str());
	rename(TempFileName.c_str(),sOFileName.c_str());
	system("pause");
}

bool Library::checkAvailability(){
	inFile.open(sOFileName);
	Book *qBook;
	int qiISBN;

	string qsAuthor;
	string qsTitle;
	string Avail;
	string check("A");

	bool isAvailable = true;

	while(!inFile.eof()){
		qBook = (Book*) malloc(sizeof(Book));
		inFile >> qiISBN >> qsAuthor >> qsTitle >> Avail;
		qBook->sAuthor = new string(qsAuthor);
		qBook->sTitle = new string(qsTitle);
		qBook->Availability = new string(Avail);
		qBook->iISBN = qiISBN;

		if ( (qBook->iISBN = qiISBN) == (qRBook->iISBN)){
			if (check.compare(*(qBook->Availability)) == 0) {
				isAvailable = true;
			}else{
				isAvailable = false;
			}
		}
	}
	inFile.close();
	return isAvailable;

}

void Library::reserveBook(){
	inFile.open(sOFileName);
	outFile.open(TempFileName);
	DataBase qOdataBase(TempFileName);
	vector<Book*> qOBook;

	Book *qBook;
	int qiISBN;
	string qsAuthor;
	string qsTitle;
	string Avail;
	string Reserve("R");
	string check("A");
	bool isAvailabe = false;

	while(!inFile.eof()){
		qBook = (Book*) malloc(sizeof(Book));
		inFile >> qiISBN >> qsAuthor >> qsTitle >> Avail;
		qBook->sAuthor = new string(qsAuthor);
		qBook->sTitle = new string(qsTitle);
		qBook->Availability = new string(Avail);
		qBook->iISBN = qiISBN;

		if ( (qBook->iISBN = qiISBN) == (qRBook->iISBN)){
			if (check.compare(*(qBook->Availability)) == 0) {
				cout << "Book is reserved" << endl;
				isAvailabe = true;
				char date[9];
				_strdate(date);
				*(qBook->Availability) = Reserve.append(date);
			}
		}
		qOBook.push_back(qBook);
	}

	for (int i = 0 ; i < (qOBook.size());i++){
		qOdataBase.BuildDataBase(qOBook.at(i));
	}

	if(!isAvailabe){
		cout<<"Book cannot reserved"<<endl;
	}

	inFile.close();
	outFile.close();
	remove(sOFileName.c_str());
	rename(TempFileName.c_str(),sOFileName.c_str());
	system("pause");
}