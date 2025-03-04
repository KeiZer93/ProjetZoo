package appli;
import zoo.Lion;
import zoo.Oiseau;
import zoo.Serpent;
import zoo.Soigneur;


public class Application {


    public static void main(String[] args) {
        System.out.println("\n=== SERPENT ===");
        Serpent s = new Serpent();
        s.ageSante();
        s.faireDuBruit();
        s.manger();
        s.seDeplacer();

        System.out.println("-------------------------------");

        System.out.println("\n=== Lion ===");
        zoo.Lion l = new zoo.Lion();
        l.ageSante();
        l.faireDuBruit();
        l.manger();
        l.seDeplacer();

        System.out.println("-------------------------------");

        System.out.println("\n=== Oiseau ===");
        Oiseau o = new Oiseau();
        o.ageSante();
        o.faireDuBruit();
        o.manger();
        o.seDeplacer();

        System.out.println("\n=== Soigneurs ===");
        Soigneur soigneur1 = new Soigneur("jack", " du Lion");
        Soigneur soigneur2 = new Soigneur("Louis", " du Serpent");
        Soigneur soigneur3 = new Soigneur("jade", " de l'Oiseau");

        soigneur1.afficheInfo();
        soigneur2.afficheInfo();
        soigneur3.afficheInfo();
    }
}

