public class Books {
	
	public String bookAuthor;
	public String bookTitle;
	public String bookPublisher;
	public String bookDate;
	public String bookDesc;
	
	public Books (String title, String author, String publisher, String date)
	{
		bookTitle = title;
		bookAuthor = author;
		bookPublisher = publisher;
		bookDate = date;
	}
	
	public Books (String desc)
	{
		bookDesc = desc;
	}
	
	public String getBookDesc()
	{
		return bookDesc;
	}
	
	public String getBookInfo() 
	{ 
		return bookTitle + bookAuthor + bookPublisher + bookDate; 
	}


}
