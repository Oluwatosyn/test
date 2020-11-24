
public class Book {

	private String title;
	private String author;
	private String publisher;
	private int copiesSold;
	
	
//constructor
	public Book(String tit, String aut,String  pub,int cop) {
		
		title = tit;
		author = aut;
		publisher = pub;
		 copiesSold = cop;
		}
	
	//Setter
	public void setTitle(String t) {
		title = t;
	}
	
	public void setAuthor(String a) {
		author = a;
	}
	
	public void setPublisher(String p) {
		publisher = p;
	}
	
	public void setCopiesSold(int c) {
		copiesSold = c;
	}
	
	// Getter
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public String getPublisher() {
		return publisher;
	}
	public int getCopiesSold() {
		return copiesSold;
	}
	
}
