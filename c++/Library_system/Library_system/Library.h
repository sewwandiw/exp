#ifndef LIBRARY_H
#define LIBRARY_H

#include<iostream>
#include<string>
#include<fstream>
#include <vector>
#include<string.h>
#include "Book.h"
#include "DataBase.h"
using namespace std;

class Library
{
public:
	Library(Book *RBook,string FileName);
	~Library();
	void removeBook();
	bool checkAvailability();
	void reserveBook();

	Book *qRBook;
	string sOFileName;
	ifstream inFile;
	ofstream outFile;
	string TempFileName;
};

#endif