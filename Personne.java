package salomia.Simulation;

import java.time.LocalDate;
import java.util.Date;

public class Personne {
    private String name;
    private String lastName;
    private String adresse;
    private LocalDate birthdate;
    private int weight;

    public void voyager(){
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdresse() {
        return adresse;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Personne() {
    }

    public Personne(String name, String lastName, String adresse, String birthdate, int weight) {
        this.name = name;
        this.lastName = lastName;
        this.adresse = adresse;
        this.birthdate = LocalDate.parse(birthdate);
        this.weight = weight;
    }
}
