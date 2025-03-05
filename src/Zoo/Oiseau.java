package zoo;
import zoo.Animal;

public class Oiseau extends Animal {
    public Oiseau() {
        super("Oiseaux", Integer.parseInt("4"), false);
    }

    @Override
    public void faireDuBruit() {
System.out.println("bruit : l'" +getName()+  " fait cui cui ");
    }

    @Override
    public void seDeplacer() {
        System.out.println("deplacer : l'" +getName()+  " vole");

    }

    @Override
    public void manger() {
        System.out.println("manger : l'" +getName()+  " mange des ver ");

    }
}
