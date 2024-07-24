package salomia.Simulation;

import java.util.ArrayList;

public class CarFerry extends Vehicule{
    private ArrayList<Personne> personnes;
    private Conducteur conducteur;
    private ArrayList<Vehicule> vehicule;
    private ArrayList<Camion> camion;

    public void setPersonnes(ArrayList<Personne> personnes) {
        this.personnes = personnes;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public void setVehicule(ArrayList<Vehicule> vehicule) {
        this.vehicule = vehicule;
    }

    public void setCamion(ArrayList<Camion> camion) {
        this.camion = camion;
    }

    public ArrayList<Personne> getPersonnes() {
        return personnes;
    }

    @Override
    public Conducteur getConducteur() {
        return conducteur;
    }

    public ArrayList<Vehicule> getVehicule() {
        return vehicule;
    }

    public ArrayList<Camion> getCamion() {
        return camion;
    }

    public void embarquer(Camion p){this.camion.add(p);}

    public CarFerry(String model, String immatriculation, int kilometrage, int poidAVide, int longueur, int reserveDeCarburant, int poidsTotal, Conducteur conducteur, ArrayList<Personne> personnes, Conducteur conducteur1, ArrayList<Vehicule> vehicule, ArrayList<Camion> camion) {
        super(model, immatriculation, kilometrage, poidAVide, longueur, reserveDeCarburant, poidsTotal, conducteur);
        this.personnes = personnes;
        this.conducteur = conducteur1;
        this.vehicule = vehicule;
        this.camion = camion;
    }

    public CarFerry(ArrayList<Personne> personnes, Conducteur conducteur, ArrayList<Vehicule> vehicule, ArrayList<Camion> camion) {
        this.personnes = personnes;
        this.conducteur = conducteur;
        this.vehicule = vehicule;
        this.camion = camion;
    }

    public CarFerry(String model, String immatriculation, int kilometrage, int poidAVide, int longueur, int reserveDeCarburant, int poidsTotal, Conducteur conducteur) {
        super(model, immatriculation, kilometrage, poidAVide, longueur, reserveDeCarburant, poidsTotal, conducteur);
    }

    public void debarquer(Camion p){
        if(camion.contains(p)){
            camion.remove(camion.indexOf(p));
        }else{
            System.out.println("wasn't there");
        }
    }
        public String chercherVoyageur(Personne p){
        if(personnes.contains(p)){
            return "hell yeah, he's here";
        }else return "not there";
        }
}
