package salomia.Simulation;

import java.util.ArrayList;


public class Camion extends Vehicule{
    private ArrayList<Coli> Cargaison;

    public void setCargaison(ArrayList<Coli> cargaison) {
        Cargaison = cargaison;
    }

    public ArrayList<Coli> getCargaison() {
        return Cargaison;
    }

    public Camion(String model, String immatriculation, int kilometrage, int poidAVide, int longueur, int reserveDeCarburant, int poidsTotal, Conducteur conducteur) {
        super(model, immatriculation, kilometrage, poidAVide, longueur, reserveDeCarburant, poidsTotal, conducteur);
    }

    public Camion(String model, String immatriculation, int kilometrage, int poidAVide, int longueur, int reserveDeCarburant, int poidsTotal, Conducteur conducteur, ArrayList<Coli> cargaison) {
        super(model, immatriculation, kilometrage, poidAVide, longueur, reserveDeCarburant, poidsTotal, conducteur);
        Cargaison = cargaison;
    }

    public Camion(ArrayList<Coli> cargaison) {
        Cargaison = cargaison;
    }

    public void ajouterColi(Coli e){
        this.Cargaison.add(e);
    }

    public void retireColi(Coli e){
        this.Cargaison.remove(this.Cargaison.indexOf(e));
    }
}
