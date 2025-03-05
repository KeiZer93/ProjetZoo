package zoo;

public class Client {
    private String nom;
    private int  age;
    private String typeBillet;
    private double argent;

    public Client(String nom, int age, double argent) {
        this.nom = nom;
        this.age = age;
        this.argent = argent;
        this.typeBillet = (age < 12) ? "enfant" : "adulte";
    }

    public boolean payerBillet(double prix) {
        if (argent >= prix) {
            argent -= prix;
            System.out.println(nom + " a payé son billet (" + typeBillet + "). Il reste " + argent + "€.");
            return true;
        } else {
            System.out.println(nom + " n'a pas assez d'argent pour payer son billet !");
            return false;
        }
    }

    public void interagirAvecAnimal(Animal animal) {
        System.out.println(nom + " observe l'animal " + animal.getName() + ". " + animal.getName() + " fait du bruit : ");
        animal.faireDuBruit();
    }

    @Override
    public String toString() {
        return "Visiteur : " + nom + " | Âge : " + age + " | Billet : " + typeBillet + " | Argent : " + argent + "€";
    }
}
