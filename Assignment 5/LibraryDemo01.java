/* Implement a class for a “Book”. Book contains a title (a String), a list of authors (array of authors), number of 
pages (an integer), price (floating point number), publisher (a String) etc. Write suitable constructor and 
accessor/modifier methods. Implement a class for “Library”. A library contains a list of books (array of Book). 
Write add (to add a book) and remove (to delete a book) methods for library. Write a main() function to create a 
“Library” and add five “Book” to library. Print the total price of all books. */

class Book
{
	String publisher;
	String authors[] = new String[3];
	String title;
	float price;
	int pages,noOfAuthors;
	
	Book()
	{
		title = "noTitle";
		publisher = "noPublisher";
		authors[0] = "noAuthor";
		pages = 180;
		price = 118.6f;
		noOfAuthors = 1;
	}
	
	void create( String t, String ps, int pg, float pr )
	{
		publisher = ps;
		title = t;
		price = pr;
		pages = pg;
	}
	void getAuthor( String a )
	{
		authors[0] = a;
		noOfAuthors = 1;
	}
	void getAuthor( String a, String b )
	{
		authors[0] = a;
		authors[1] = b;
		noOfAuthors = 2;
	}
	void getAuthor( String a, String b, String c )
	{
		authors[0] = a;
		authors[1] = b;
		authors[2] = c;
		noOfAuthors = 3;
	}
	void Display()
	{
		System.out.println("Book Details:- ");
		System.out.println("Title - "+title);
		System.out.println("Authors - ");
		for( int i=0; i<noOfAuthors; i++ )
			System.out.println(authors[i]);
		System.out.println("Pages - "+pages+" Price - "+price);
	}
}
public class LibraryDemo01 {

	Book obj[];
	int totalBooks = 0;
	
	LibraryDemo01( int n )
	{
		obj = new Book[n];
		for( int i=0; i<n; i++ )
			obj[i] = new Book();
	}
	LibraryDemo01()
	{
		obj = new Book[5];
		for( int i=0; i<5; i++ )
			obj[i] = new Book();
	}
	
	void Add(String t, String pb, int pg, float pr, String ... str )
	{
		//enter parameters as title, publisher, pages, price
		obj[ totalBooks].create( t, pb, pg, pr );
		int k = str.length;
		
		if( k == 1 )
		{
			String S = str[0];
			obj[totalBooks].getAuthor(S);
		}
		else if( k == 2)
		{
			String S = str[0];
			String S1 = str[1];
			obj[totalBooks].getAuthor(S, S1);
		}
		else if( k == 3)
		{
			String S = str[0];
			String S1 = str[1];
			String S2 = str[2];
			obj[totalBooks].getAuthor(S, S1, S2);
		}
		totalBooks++;
	}
	void Add()
	{
		totalBooks++;
	}
	void Remove()
	{
		totalBooks--;
	}
	void display()
	{
		System.out.println("All books in library- ");
		for( int i=0; i<totalBooks; i++ )
			obj[i].Display();
	}
	public static void main(String[] args) {
		
		LibraryDemo01 Lib = new LibraryDemo01(5);
		//enter parameters as title, publisher, pages, price
		Lib.Add("Sherlock", "Purlitzer", 1900, 999f, "Sir Arthur Conan Doyle" );
		Lib.Add();
		Lib.display();
	}

}


/* Output

All books in library- 
Book Details:- 
Title - Sherlock
Authors - 
Sir Arthur Conan Doyle
Pages - 1900 Price - 999.0
Book Details:- 
Title - noTitle
Authors - 
noAuthor
Pages - 180 Price - 118.6

*/