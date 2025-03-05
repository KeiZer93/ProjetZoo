package zoo;

import zoo.Animal;

public class Lion extends Animal {
    public Lion() {
        super("Lion", Integer.parseInt("5"), false);
    }


    @Override
    public void faireDuBruit() {
        System.out.println("Bruit: Le " + getName() + " rugit ");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Deplacement: Le " + getName() + " se deplace a 4 pattes ");

    }

    @Override
    public void manger() {
        System.out.println("Nourriture: " + getName() + " mange de la viande ");

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