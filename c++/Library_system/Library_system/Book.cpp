#include <iostream>
#include <string>

#include"Book.h"
using namespace std;

Book::Book(int ISBN, string* Author, string* Title, string* Available) {
	iISBN = ISBN;
	sAuthor = Author ;
	sTitle = Title ;
	Availability = Available;
}

Book::~Book() {}
