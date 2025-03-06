package zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nom;
    private int capital;
    private double venteBillet;
    private List<Animal> animaux;
    private List<Soigneur> soigneurs;
    private List<Enclos> enclos;

    public Zoo(String nom, int capital) {
        this.nom = nom;
        this.capital = capital;
        this.venteBillet = 0;
        this.animaux = new ArrayList<>();
        this.soigneurs = new ArrayList<>();
        this.enclos = new ArrayList<>();
    }


    public void enregistrerVisiteur(int nombre, double prixBillet) {
        this.venteBillet += nombre * prixBillet;
        this.capital += nombre * prixBillet;
        System.out.println(nombre + " visiteurs sont entrés. Recette des billets : " + venteBillet + "€.");
    }


    public double calculerRevenu() {
        System.out.println("Total des ventes de billets : " + venteBillet + "€.");
        return venteBillet;
    }





    public  void afficherInfos() {
        System.out.println(" Zoo : " + nom);
        System.out.println(" Capital : " + capital + "€");
        System.out.println("️ Revenus des billets : " + venteBillet + "€");

    }
}

