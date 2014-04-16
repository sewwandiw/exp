#ifndef BOOK_H
#define BOOK_H
#include<iostream>
#include<string>
using namespace std;

class Book
{
public:
	Book(int ISBN, string* Author, string* Title, string*  Available);
	~Book();

	int iISBN;
	string* sAuthor;
	string* sTitle;
	string*  Availability;
};

#endif