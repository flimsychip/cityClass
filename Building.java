package partD;

public class Building {
    private String name;
    private String neighborhood;

    public Building() {
    }

    public Building(String name, String neighborhood) {
        this.name = name;
        this.neighborhood = neighborhood;
    }

    public String getName() {
        return this.name;
    }

    public String getNeighborhood() {
        return this.neighborhood;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String toString() {
        return "building name: " + this.name + " | neighborhood: " + this.neighborhood;
    }
}