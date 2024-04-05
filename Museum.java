package partD;

public class Museum extends Building {
    private String theme;

    public Museum() {
        super();
    }

    public Museum(String name, String neighborhood, String theme) {
        super(name, neighborhood);
        this.theme = theme;
    }

    public String getTheme() {
        return this.theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String toString() {
        return super.toString() + "\nthis building is a museum. theme: " + this.theme;
    }
}
