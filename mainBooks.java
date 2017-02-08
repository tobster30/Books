public class mainBooks {
	
	public static void main (String[] args)
	{
		Books book1 = new Books ("Lord of the Rings ", " Tolkien ", " Pearson ", " 2017 ");
		Books book1Desc = new Books ("tsch, Hobbits.");
		
		Books book2 = new Books ("Game of Thrones ", " George R.R Martin ", " Pearson ", " 2017 ");
		Books book2Desc = new Books ("Dragon Tits.");
		
		Books book3 = new Books ("The Road ", " Cormac McCarthy ", " Pearson ", " 2017 ");
		Books book3Desc = new Books ("cannibals");

		System.out.println(book1.getBookInfo());
		System.out.println(book1Desc.getBookDesc());
		
		System.out.println(book2.getBookInfo());
		System.out.println(book2Desc.getBookDesc());
		
		System.out.println(book3.getBookInfo());
		System.out.println(book3Desc.getBookDesc());

	}

}
