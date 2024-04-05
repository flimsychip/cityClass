package partD;

public class Major {
    private String name;
    private Professor professor;
    private Book textbook;

    public Major() {
    }

    public Major(String name, Professor prof, Book book) {
        this.name = name;
        this.professor = prof;
        this.textbook = book;
    }

    public String getName() {
        return this.name;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public Book getTextbook() {
        return this.textbook;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProfessor(Professor prof) {
        this.professor = prof;
    }

    public void setTextbook(Book book) {
        this.textbook = book;
    }

    public String toString() {
        return this.name + "\nprofessor " + this.professor + " | textbook: " + this.textbook;
    }
}
