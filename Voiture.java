package salomia.Simulation;

import java.util.ArrayList;

public class Voiture {
    private ArrayList<Personne> passagers;
    private int passagersMax;

    public void monter(Personne p){
        if(passagersMax <= passagers.size() + 1) {
            this.passagers.add(p);
        }
        else {
            System.out.println("too much");
        }
    }
    public void descendre(Personne p){
        if(passagers.contains(p)){
            passagers.remove(passagers.indexOf(p));
        }else{
            System.out.println("wasn't there");
        }
    }

    public Voiture() {
    }

    public Voiture(ArrayList<Personne> passagers, int passagersMax) {
        this.passagers = passagers;
        this.passagersMax = passagersMax;
    }

    public ArrayList<Personne> getPassagers() {
        return passagers;
    }

    public int getPassagersMax() {
        return passagersMax;
    }

    public void setPassagers(ArrayList<Personne> passagers) {
        this.passagers = passagers;
    }

    public void setPassagersMax(int passagersMax) {
        this.passagersMax = passagersMax;
    }
}
