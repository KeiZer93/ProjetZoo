package zoo;

import zoo.Animal;

public class Lion extends Animal {
    public Lion() {
        super("Lion", Integer.parseInt("5"), "a definir");
    }
    

    @Override
    public void faireDuBruit() {
System.out.println("Bruit: Le " +getName()+  " rugit ");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Deplacement: Le "+getName()+  " se deplace a 4 pattes ");

    }

    @Override
    public void manger() {
        System.out.println("Nourriture: "+getName()+  " mange de la viande ");

    }
}
