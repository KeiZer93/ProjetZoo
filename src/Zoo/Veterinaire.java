package zoo;

public class Veterinaire extends Soigneur {
    public Veterinaire() {
        super("albert", "jack", "robert", "louis", "lions", "serpents", "oiseaux");


    }


    @Override
    public void soigner() {
        if (animal != null) {
            if (animal.isMalade()) {
                System.out.println(nomVeterinaire + " soigne l'animal " + animal.getName());
                animal.setMalade(false);  // L'animal est guéri
                System.out.println(animal.getName() + " est maintenant en bonne santé !");
            } else {
                System.out.println(animal.getName() + " n'a pas besoin de soins, il est en bonne santé.");
            }
        } else {
            System.out.println("Aucun animal à soigner.");
        }
    }

        @Override
        public void afficheInfoVeterinaire () {
            System.out.println("Vétérinaire : " + nomVeterinaire + " soignera les " + specialite1 + " les " + specialite2 + " les " + specialite3 + " en cas de blessure ou maladie.");


        }



}