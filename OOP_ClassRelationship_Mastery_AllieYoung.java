package partD;

public class OOP_ClassRelationship_Mastery_AllieYoung {
    public static void main(String[] args) {
        displayCityInfo();
    }

    static void displayCityInfo() {
        Museum museum = new Museum("exploratorium", "piers/embarcadero", "science & technology");

        Author author = new Author("william s. burroughs", "45 (at time of writing)", "grove press");
        Book libFavBook = new Book("naked lunch", author);
        Librarian lib = new Librarian("bob", "25", 50000, 5, libFavBook);
        Library library = new Library("sf public library main branch", "civic center/downtown", 200000, lib);

        Author textbookAuthor = new Author("daniel y. liang", "63", "pearson college div");
        Book textbook = new Book("introduction to java programming", textbookAuthor);
        Professor prof = new Professor("alice", "40", 75000, 10, 3.7);
        Major compSci = new Major("computer science", prof, textbook);
        Student prinFavStudent = new Student("carly", "19", compSci);
        President sfsuPres = new President("lynn mahoney", "59", 400000, 5, prinFavStudent);
        School school = new School("sfsu", "parkmerced", 25000, sfsuPres);

        City sf = new City("sf", 800000, school, library, museum);
        System.out.println(sf);
    }
}
