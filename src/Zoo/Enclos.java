package zoo;
import java.util.ArrayList;
import java.util.List;

public class Enclos {

        private int id;
        private int capacite;
        private int proprete;
        private List<Animal> animaux;

        public Enclos(int id, int capacite) {
            this.id = id;
            this.capacite = capacite;
            this.proprete = 100; // 100 = très propre
            this.animaux = new ArrayList<>();
        }

        public void ajouterAnimal(Animal animal) {
            if (animaux.size() < capacite) {
                animaux.add(animal);
                System.out.println(animal.getName() + " a été ajouté à l’enclos.");
            } else {
                System.out.println("L'enclos est plein, impossible d’ajouter " + animal.getName());
            }
        }
            public void nettoyerEnclos() {
                proprete = 100;
                System.out.println("L'enclos a été nettoyé !");
            }

            public void degradations() {
                proprete -= 10;
                if (proprete < 0) proprete = 0;
                System.out.println("L'enclos se dégrade. Niveau de propreté : " + proprete);
            }

            public void afficherInfos() {
                System.out.println("Enclos ID: " + id + ", Capacité: " + capacite + ", Propreté: " + proprete);
                System.out.println("Animaux présents : ");
                for (Animal a : animaux) {
                    System.out.println("- " + a.getName());
                }
            }

        }

