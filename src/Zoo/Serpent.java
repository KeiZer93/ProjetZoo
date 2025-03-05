package zoo;
import zoo.Animal;

public class Serpent extends Animal {

    public Serpent() {
        super("Serpents", Integer.parseInt("4"),false);
    }

    @Override
    public void faireDuBruit() {
        System.out.println("Bruit :Le " +getName()+  " siffle ");

    }

    @Override
    public void manger() {
        System.out.println(" Nourriture:Le " +getName()+  " manges oiseaux ,Rongeur,oeuf ,etc ");

    }

    @Override
    public void seDeplacer() {
        System.out.println("deplacement: le " +getName()+  "  se  déplacent en formant des vagues ou des courbes avec sont corps. " );

    }
}