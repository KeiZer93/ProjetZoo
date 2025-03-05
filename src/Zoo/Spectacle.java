package zoo;
import java.util.ArrayList;
import java.util.List;

public class Spectacle {
    private String nom;
    private Soigneur soigneur;
    private List<Animal> animaux;
    private String heure;
    private double prixEntree;

    public Spectacle(String nom, Soigneur soigneur, String heure, double prixEntree) {
        this.nom = nom;
        this.soigneur = soigneur;
        this.heure = heure;
        this.prixEntree = prixEntree;
        this.animaux = new ArrayList<>();
    }

    public void interactionAvecPublic() {
        System.out.println(" Le spectacle " + nom + " commence !");
        System.out.println("👨⚕️ " + soigneur.nomSoigneur1 + " présente les animaux au public.");
        for (Animal a : animaux) {
            System.out.println(" " + soigneur.specialite1 + " fait son numéro et produit un son : ");
            a.faireDuBruit();
        }
    }
    public void reactionDuPublic() {
        System.out.println(" Le public réagit avec enthousiasme !");
        System.out.println(" 'Wow, c'était incroyable !' ");
    }

    public void demarrerSpectacle() {
        interactionAvecPublic();
        reactionDuPublic();
        System.out.println(" Fin du spectacle !");
    }
}

