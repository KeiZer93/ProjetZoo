import zoo.Lion;
import zoo.Oiseau;
import zoo.Serpent;

public class Main {
    public static void main(String[] args)

{System.out.println("\n=== SERPENT ===");
Serpent s = new Serpent();
s.ageSante();
s.faireDuBruit();
s.manger();
s.seDeplacer();

System.out.println("-------------------------------");

System.out.println("\n=== Lion ===");
Lion l = new Lion();
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

System.out.println("-------------------------------");





    }
}