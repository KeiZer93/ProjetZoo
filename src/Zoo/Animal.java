package zoo;

public abstract class Animal {

    protected String name;
    protected int age;
    protected Boolean malade;

    public Animal(String name, int age, Boolean sante) {
        this.name = name;
        this.age = age;
        this.malade = (Math.random() < 0.5);

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

    public Boolean isMalade() {
        return malade;
    }

    public void setMalade(Boolean malade) {
        this.malade = malade;
    }

    public void ageSante() {
        System.out.println("Âge : " +age+ " ans ");


    }

    public abstract void tomberMalade() ;

    public abstract void faireDuBruit();

    public abstract void seDeplacer();

    public abstract void manger();


}