package entities;

import java.util.List;

public class Book {


    private String isbn, tiltle, publsiher, edition;
	private List<String> authors;

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTiltle() {
		return tiltle;
	}

	public void setTiltle(String tiltle) {
		this.tiltle = tiltle;
	}

	public String getPublsiher() {
		return publsiher;
	}

	public void setPublsiher(String publsiher) {
		this.publsiher = publsiher;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
    
}
