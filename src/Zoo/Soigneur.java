package zoo;

public abstract class Soigneur {
    protected String nomVeterinaire;
    protected String nomSoigneur1;
    protected String nomSoigneur2;
    protected String nomSoigneur3;
    protected String specialite1;
    protected String specialite2;
    protected String specialite3;
    protected Animal animal;

    public Soigneur(String nomVeterinaire,String nomSoigneur1, String nomSoigneur2, String nomSoigneur3 ,String specialite1,String specialite2,String specialite3) {
        this.nomVeterinaire = nomVeterinaire;
        this.nomSoigneur1 = nomSoigneur1;
        this.nomSoigneur2 = nomSoigneur2;
        this.nomSoigneur3 = nomSoigneur3;
        this.specialite1 = specialite1;
        this.specialite2 = specialite2;
        this.specialite3 = specialite3;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;  // Affecte un animal au soigneur
    }

    public Animal getAnimal() {
        return this.animal;  // Récupère l'animal pris en charge par le soigneur
    }



    public void diagnostiquer(){
        if (animal != null && animal.isMalade()) {
            System.out.println("Le soigneur diagnostique l'animal : " + animal.getName() + " est malade.");
        }
    }

    public void entretientEnclos(){

    }
    public void afficherInfoSoigneur() {
        System.out.println("Soigneur 1  : " + nomSoigneur1 + " s'occupe des " + specialite1);
        System.out.println("Soigneur 2  : " + nomSoigneur2 + " s'occupe des " + specialite2);
        System.out.println("Soigneur 3  : " + nomSoigneur3 + " s'occupe des " + specialite3);


    }
    public abstract void soigner();
    public abstract void afficheInfoVeterinaire();
}