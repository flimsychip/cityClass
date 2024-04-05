package partD;

public class City {
    private String name;
    private int population;
    private School school;
    private Library library;
    private Museum museum;

    public City() {
    }

    public City(String name, int pop, School school, Library library, Museum museum) {
        this.name = name;
        this.population = pop;
        this.school = school;
        this.library = library;
        this.museum = museum;
    }

    public String getName() {
        return this.name;
    }

    public int getPopulation(){
        return this.population;
    }

    public School getSchool() {
        return this.school;
    }

    public Library getLibrary() {
        return this.library;
    }

    public Museum getMuseum() {
        return this.museum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPopulation(int pop) {
        this.population = pop;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public void setMuseum(Museum museum) {
        this.museum = museum;
    }

    public String toString() {
        return "city: " + this.name + " | population: " + this.population + "\n\nhere are some buildings in this city.\n\n" + this.museum + "\n\n" + this.library + "\n\n" + this.school;
    }
}
