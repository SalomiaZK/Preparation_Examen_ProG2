package salomia.Simulation;

public class Coli {
    private String description;
    private String poids;


    public Coli(String description, String poids) {
        this.description = description;
        this.poids = poids;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getDescription() {
        return description;
    }

    public String getPoids() {
        return poids;
    }
}
