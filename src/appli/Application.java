package appli;
import zoo.*;


public class Application {


    public static void main(String[] args) {
        System.out.println("\n=== SERPENT ===");
        Serpent s = new Serpent();
        s.ageSante();
        s.faireDuBruit();
        s.manger();
        s.seDeplacer();
        s.setMalade(true);

        System.out.println("-------------------------------");

        System.out.println("\n=== Lion ===");
        zoo.Lion l = new zoo.Lion();
        l.ageSante();
        l.faireDuBruit();
        l.manger();
        l.seDeplacer();
        l.setMalade(true);

        System.out.println("-------------------------------");

        System.out.println("\n=== Oiseau ===");
        Oiseau o = new Oiseau();
        o.ageSante();
        o.faireDuBruit();
        o.manger();
        o.seDeplacer();

        o.setMalade(true);

        System.out.println("-------------------------------");

        System.out.println("\n=== Soigneur ===");
        Soigneur soigneur = new Veterinaire();
        soigneur.afficherInfoSoigneur();



        System.out.println("-------------------------------");

        System.out.println("\n=== veterinaire ===");
        Veterinaire v = new Veterinaire();
        v.afficheInfoVeterinaire();

        System.out.println("-------------------------------");

        System.out.println("\n=== Maladie ===");
        Animal animal = new Lion ();
        animal.tomberMalade();
        Animal animal2 = new Serpent ();
        animal2.tomberMalade();
        Animal animal3 = new Oiseau ();
        animal3.tomberMalade();

        Veterinaire veterinaire = new Veterinaire();
        veterinaire.soigner();







    }
}