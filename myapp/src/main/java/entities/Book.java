package entities;

import java.time.Year;
import java.util.List;

public class Book {


    private String isbn, titel, publsiher, city;
	
	private List<String> authors;

	private Year year;
	private int edition;

	public Book(String isbn, String titel, List<String> authors,Year year, String publisher, String city, int edition){
		this.isbn = isbn;
		this.titel = titel;
		this.authors = authors;
		this.year = year;
		this.publsiher = publisher;
		this.city = city;
		this.edition = edition;
	}

	public void printBookInfo(){
		System.out.println(isbn+ "\t"+ titel+ "\t"+ authors.toString()+ "\t"+ year.getValue()+ "\t"
		+ publsiher + "\t" + city + "\t" + edition);
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTiltle() {
		return titel;
	}

	public void setTiltle(String tiltle) {
		this.titel = tiltle;
	}

	public String getPublsiher() {
		return publsiher;
	}

	public void setPublsiher(String publsiher) {
		this.publsiher = publsiher;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
    
}
