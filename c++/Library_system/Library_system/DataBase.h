#ifndef DATABASE_H
#define DATABASE_H

#include<iostream>
#include<fstream>
#include<string>
#include <vector> 
#include"Book.h"


using namespace std;

class DataBase
{
public:
	DataBase(string fileName);
	~DataBase();
	void BuildDataBase(Book *qBook);
	vector<Book*> ReadDataBase();

	string sfileName;
	ofstream OFileDataBase;
	ifstream IFilteDataBase;

};

#endif