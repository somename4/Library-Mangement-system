package entities;

import java.util.Date;

public class BookCopy {
    	//properties of the book Copy
	private long id;
	private String bookIsbn, shelfLocation;
	private Date addedToLibrary, lentDate;
	private boolean lent;
	
	
	
	public BookCopy(long id, String bookIsbn, String shelfLocation, 
			Date addedToLibrary, boolean lent, Date lentDate) {
		this.id = id;
		this.bookIsbn = bookIsbn;
		this.shelfLocation = shelfLocation;
		this.addedToLibrary = addedToLibrary;
		this.lent = lent;
		this.lentDate = lentDate;
		
		
	}


	
	/*
	 * getter and setter of the properties
	 */
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getShelfLocation() {
		return shelfLocation;
	}


	public void setShelfLocation(String shelfLocation) {
		this.shelfLocation = shelfLocation;
	}


	public Date getAddedToLibrary() {
		return addedToLibrary;
	}


	public void setAddedToLibrary(Date addedToLibrary) {
		this.addedToLibrary = addedToLibrary;
	}


	public String getBookIsbn() {
		return bookIsbn;
	}


	public void setBookIsbn(String bookIsbn) {
		this.bookIsbn = bookIsbn;
	}


	public boolean isLent() {
		return lent;
	}


	public void setLent(boolean lent) {
		this.lent = lent;
	}


	public Date getLentDate() {
		return lentDate;
	}


	public void setLentDate(Date lentDate) {
		this.lentDate = lentDate;
	}
	

    
}
