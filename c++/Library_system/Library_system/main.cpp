#include<iostream>
#include<string>
#include <vector> 
#include"Book.h"
#include"DataBase.h"
#include"Library.h"
using namespace std;

int main(){
	int ISBN;
	string Autour;
	string title;
	string Available;
	bool isAvailable = true;
	DataBase qDataBase("Books.txt");
	int request;

	while(true){
		cout<< "Enter the request \n 1 : Add books, 2: Read database, 3:Remove book, 4: check Availability,5: Reserve Book, 6:quit"<<endl<<endl;
		cin >> request;
		switch(request){
		case 1:{
			cout<<"ISBN "<<"Autor "<<"Title "<< "Availability"<<endl<<endl;		
			cin >> ISBN >> Autour >> title >> Available;
			Book qBook(ISBN, &Autour,&title,&Available);
			qDataBase.BuildDataBase(&qBook);
			break;}
		case 2:{
			vector<Book*> qpBook;
			qpBook = qDataBase.ReadDataBase();
			for (int i = 0 ; i < (qpBook.size()-1);i++){
				cout << (qpBook.at(i)->iISBN)<<" "<< *(qpBook.at(i)->sAuthor)<<" "<< *(qpBook.at(i)->sTitle)<<" "<< *(qpBook.at(i)->Availability)<< endl;
			}
			break;}
		case 3:{
			cout<<"ISBN " <<endl<<endl;	
			cin >> ISBN;
			Autour = "Dummy";
			title ="Dummy";
			Available = "Dummy";
			Book qBook(ISBN, &Autour, &title, &Available);
			Library NewRequest(&qBook,"Books.txt");
			NewRequest.removeBook();
			break;}
		case 4:{
			cout<<"ISBN "<<endl<<endl;		
			cin >> ISBN ;	
			Autour = "Dummy";
			title ="Dummy";
			Available = "Dummy";
			Book qBook(ISBN, &Autour, &title, &Available);
			Library NewRequest(&qBook,"Books.txt");
			if (isAvailable = NewRequest.checkAvailability()){
				cout << "Book is Available"<<endl;
			}else{
				cout << "Book is not available"<<endl;
			}
			break;  }
		case 5:{
			cout<<"ISBN "<<endl<<endl;		
			cin >> ISBN ;	
			Autour = "Dummy";
			title ="Dummy";
			Available = "Dummy";
			Book qBook(ISBN, &Autour, &title, &Available);
			Library NewRequest(&qBook,"Books.txt");
			NewRequest.reserveBook();
			break;}
		case 6:
			break;
		default:
			break;
		}
	}
	EXIT_SUCCESS;
}