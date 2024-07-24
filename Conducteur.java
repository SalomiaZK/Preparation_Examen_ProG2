package salomia.Simulation;

import java.time.LocalDate;

import static java.lang.Integer.parseInt;

public class Conducteur extends Voyageur {
    private boolean majeur = true;
    private String numeroDePermis;

    public Conducteur(boolean majeur, String numeroDePermis) {
        super();
        this.majeur = majeur;
        this.numeroDePermis = numeroDePermis;
    }

    public Conducteur() {
        super();
    }

    public void setMajeur(boolean majeur) {
        this.majeur = majeur;
    }

    public void setNumeroDePermis(String numeroDePermis) {
        this.numeroDePermis = numeroDePermis;
    }

    public String getNumeroDePermis() {
        return numeroDePermis;
    }

    public boolean isMajeur() {
        if(LocalDate.now().getYear()- this.getBirthdate().getYear() >= 18){
            majeur = true;
        }else {
            majeur = false;
        }

        return majeur;
    }
}

