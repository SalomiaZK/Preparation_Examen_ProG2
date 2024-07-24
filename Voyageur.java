package salomia.Simulation;

import java.time.LocalDate;

public class Voyageur  extends  Personne{
    private LocalDate travelingDate;



    public Voyageur(String name, String lastName, String adresse, String birthdate, int weight, LocalDate travelingDate) {
        super(name, lastName, adresse, birthdate, weight);
        this.travelingDate = travelingDate;
    }



    public void setTravelingDate(LocalDate travelingDate) {
        this.travelingDate = travelingDate;
    }

    public LocalDate getTravelingDate() {
        return travelingDate;
    }
}
