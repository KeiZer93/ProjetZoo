package zoo;

public class Veterinaire extends Soigneur {
    public Veterinaire() {super("albert","jack","robert","louis","lions","serpents" ,"oiseaux");


    }


    @Override
    public void soigner() {

    }

    @Override
    public void afficheInfoVeterinaire() {
        System.out.println("Vétérinaire : " + nomVeterinaire + " soignera les " + specialite1 + " les " + specialite2 + " les " + specialite3 + " en cas de blessure ou maladie.");


    }
}
