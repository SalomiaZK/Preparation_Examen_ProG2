package salomia.Simulation;

import java.lang.constant.Constable;
import java.time.LocalDateTime;

public class Vehicule {
    //son poids à vide, sa longueur (en mètres), sa réserve de carburant (en nombre
    //de litres) et un conducteur
    private String model;
    private String immatriculation;
    private int kilometrage;
    private int poidAVide;
    private int longueur;
    private int reserveDeCarburant;
    private int poidsTotal;
    private Conducteur conducteur; // tokony ho majeur

    public void ChangerdeConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }
    public void rouler(int kilometrage){
        this.kilometrage += kilometrage;
    }

    public  int getPoids(int charge){
        return this.poidAVide + this.reserveDeCarburant + charge;
    }

    public Conducteur getConducteur() {
        if(conducteur.isMajeur()) {
            return conducteur;
        }
        else {

            return null;
        }
    }

    public String getModel() {
        return model;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public int getKilometrage() {
        return kilometrage;
    }

    public int getPoidAVide() {
        return poidAVide;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getReserveDeCarburant() {
        return reserveDeCarburant;
    }

    public Vehicule(String model, String immatriculation, int kilometrage, int poidAVide, int longueur, int reserveDeCarburant, int poidsTotal, Conducteur conducteur) {
        this.model = model;
        this.immatriculation = immatriculation;
        this.kilometrage = kilometrage;
        this.poidAVide = poidAVide;
        this.longueur = longueur;
        this.reserveDeCarburant = reserveDeCarburant;
        this.poidsTotal = poidsTotal;
        this.conducteur = conducteur;
    }

    public Vehicule() {
    }
}
