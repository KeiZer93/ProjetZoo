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
        s.setSante(true);

        System.out.println("-------------------------------");

        System.out.println("\n=== Lion ===");
        zoo.Lion l = new zoo.Lion();
        l.ageSante();
        l.faireDuBruit();
        l.manger();
        l.seDeplacer();
        l.setSante(true);

        System.out.println("-------------------------------");

        System.out.println("\n=== Oiseau ===");
        Oiseau o = new Oiseau();
        o.ageSante();
        o.faireDuBruit();
        o.manger();
        o.seDeplacer();

        o.setSante(true);

        System.out.println("-------------------------------");

        System.out.println("\n=== Soigneur ===");
        Soigneur soigneur = new Veterinaire();
        soigneur.afficherInfoSoigneur();



        System.out.println("-------------------------------");

        System.out.println("\n=== veterinaire ===");
        Veterinaire v = new Veterinaire();
        v.afficheInfoVeterinaire();


    }
}