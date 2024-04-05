package partD;

public class Library extends Building {
    private int numBooks;
    private Librarian librarian;

    public Library() {
        super();
    }

    public Library(String name, String neighborhood, int numBooks, Librarian librarian) {
        super(name, neighborhood);
        this.numBooks = numBooks;
        this.librarian = librarian;
    }

    public int getNumBooks() {
        return this.numBooks;
    }

    public Librarian getLibrarian() {
        return this.librarian;
    }

    public void setNumBooks(int num) {
        this.numBooks = num;
    }

    public void setLibrarian(Librarian lib) {
        this.librarian = lib;
    }

    public String toString() {
        return super.toString() + "\nthis building is a library. number of books: " + this.numBooks + "\nlibrarian " + this.librarian;
    }
}
