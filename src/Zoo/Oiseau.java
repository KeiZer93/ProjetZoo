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

    @Override
    public void tomberMalade() {
        if (Math.random() < 0.5) {  // Chance de 50% de tomber malade
            this.malade = true;
            System.out.println(name + " est tombé malade !");
        } else {
            this.malade = false;
            System.out.println(name + " est en bonne santé.");
        }
    }
}
