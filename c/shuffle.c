/*
** Use random numbers to shuffle the "cards" in the deck.  The second
** argument indicates the number of cards.  The first time this
** function is called, srand is called to initialize the random
** number generator.
*/
#include <stdlib.h>
#include<stdio.h>
#include <time.h>
#define	TRUE	1
#define	FALSE	0

void shuffle(char *deck)
{
	//int	i;
	//static	int	first_time = TRUE;

	///*
	//** Seed the random number generator with the current time
	//** of day if we haven't done so yet.
	//*/
	//if( first_time ){
	//	first_time = FALSE;
	//	srand( (unsigned int)time( NULL ) );
	//}

	///*
	//** "Shuffle" by interchanging random pairs of cards.
	//*/
	//for( i = n_cards - 1; i > 0; i -= 1 ){
	//	int	where;
	//	int	temp;

	//	where = rand() % i;
	//	temp = deck[ where ];
	//	deck[ where ] = deck[ i ];
	//	deck[ i ] = temp;
	//}
	float i;

	i = atof(deck);
	printf("%f",i);

}