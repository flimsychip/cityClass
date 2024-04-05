package partD;

public class Librarian extends Employee {
    private Book favBook;

    public Librarian() {
        super();
    }

    public Librarian(String name, String age, int salary, int years, Book book) {
        super(name, age, salary, years);
        this.favBook = book;
    }

    public Book getFavBook() {
        return this.favBook;
    }

    public void setFavBook(Book book) {
        this.favBook = book;
    }

    public String toString() {
        return super.toString() + " | favorite book: " + this.favBook;
    }
}
