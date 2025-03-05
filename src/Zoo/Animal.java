package zoo;

public abstract class Animal {

    protected String name;
    protected int age;
    protected Boolean sante;

    public Animal(String name, int age, Boolean sante) {
        this.name = name;
        this.age = age;
        this.sante = (Math.random() < 0.5);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean Sante() {
        return sante;
    }

    public void setSante(Boolean sante) {
        this.sante = sante;
    }

    public void ageSante() {
        System.out.println(String.format("Âge : %d ans | Santé : %s", age, sante));


    }

    public void tomberMalade() {
        if (Math.random() < 0.5) {  // Chance de 50% de tomber malade
            this.sante = true;
            System.out.println(name + " est tombé malade !");
        } else {
            this.sante = false;
            System.out.println(name + " est en bonne santé.");
        }
    }

    public abstract void faireDuBruit();

    public abstract void seDeplacer();

    public abstract void manger();


}