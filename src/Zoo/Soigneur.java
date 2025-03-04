package zoo;

public class Soigneur {
    private String nom;
    private String specialiste;

    public Soigneur(String nom, String specialiste) {
        this.nom = nom;
        this.specialiste = specialiste;
    }


    public void diagnostique (){


    }

    public void soigner(){
        
    }
    public void afficheInfo() {
        System.out.println(" Nom: " + nom + " S'occupe " + specialiste);
    }

}
