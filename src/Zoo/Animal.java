package zoo;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String sante;

    public Animal(String name, int age, String sante) {
        this.name = name;
        this.age = age;
        this.sante = sante;

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

    public String getSante() {
        return sante;
    }

    public void setSante(String sante) {
        this.sante = sante;
    }

    public void ageSante() {
        System.out.println(String.format("Âge : %d ans | Santé : %s", age, sante));


    }

    public abstract void faireDuBruit();

    public abstract void seDeplacer();

    public abstract void manger();
}


