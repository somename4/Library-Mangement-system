package entities;

import java.time.LocalDate;

public class BookCopy {
    	//properties of the book Copy
	private long id;
	private String bookIsbn, shelfLocation;
	private LocalDate addedToLibrary, lentDate;
	private boolean lent;
	
	
	
	public BookCopy(long id, String bookIsbn, String shelfLocation, 
			LocalDate addedToLibrary, boolean lent, LocalDate lentDate) {
		this.id = id;
		this.bookIsbn = bookIsbn;
		this.shelfLocation = shelfLocation;
		this.addedToLibrary = addedToLibrary;
		this.lent = lent;
		this.lentDate = lentDate;
	}



	public void printBookCopyInfo(){
		System.out.println(id + "\t" + bookIsbn + "\t" + shelfLocation + "\t" + addedToLibrary.toString() + "\t" + Boolean.toString(lent) + "\t" + lentDate.toString());
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


	public LocalDate getAddedToLibrary() {
		return addedToLibrary;
	}


	public void setAddedToLibrary(LocalDate addedToLibrary) {
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


	public LocalDate getLentDate() {
		return lentDate;
	}


	public void setLentDate(LocalDate lentDate) {
		this.lentDate = lentDate;
	}
	

    
}
