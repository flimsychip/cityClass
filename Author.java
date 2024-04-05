package partD;

public class Author extends Person {
    private String publisher;

    public Author() {
        super();
    }

    public Author(String name, String age, String publisher) {
        super(name, age);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String toString() {
        return super.toString() + " | publisher: " + this.publisher;
    }
}
