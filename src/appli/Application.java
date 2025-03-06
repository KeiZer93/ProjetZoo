package appli;
import zoo.*;


public class Application {


    public static void main(String[] args) {
        System.out.println("\n=== SERPENT ===");
        Serpent s = new Serpent();
        s.ageSante();
        s.faireDuBruit();
        s.manger();
        s.seDeplacer();
        s.setMalade(true);

        System.out.println("-------------------------------");

        System.out.println("\n=== Lion ===");
        zoo.Lion l = new zoo.Lion();
        l.ageSante();
        l.faireDuBruit();
        l.manger();
        l.seDeplacer();
        l.setMalade(true);

        System.out.println("-------------------------------");

        System.out.println("\n=== Oiseau ===");
        Oiseau o = new Oiseau();
        o.ageSante();
        o.faireDuBruit();
        o.manger();
        o.seDeplacer();

        o.setMalade(true);

        System.out.println("-------------------------------");

        System.out.println("\n=== Soigneur ===");
        Soigneur soigneur = new Veterinaire();
        soigneur.afficherInfoSoigneur();



        System.out.println("-------------------------------");

        System.out.println("\n=== veterinaire ===");
        Veterinaire v = new Veterinaire();
        v.afficheInfoVeterinaire();

        System.out.println("-------------------------------");

        System.out.println("\n=== Maladie ===");
        Animal animal = new Lion ();
        animal.tomberMalade();
        Animal animal2 = new Serpent ();
        animal2.tomberMalade();
        Animal animal3 = new Oiseau ();
        animal3.tomberMalade();


        Veterinaire veterinaire = new Veterinaire();
        veterinaire.soigner();
        System.out.println("-------------------------------");
        System.out.println("\n=== Enclos ===");

        Enclos enclos1 = new Enclos(1, 3);
        enclos1.ajouterAnimal(animal);

        enclos1.degradations();
        enclos1.afficherInfos();

        enclos1.nettoyerEnclos();
        enclos1.afficherInfos();

        Enclos enclos2 = new Enclos(2, 4);
        enclos2.ajouterAnimal(animal2);

        enclos2.degradations();
        enclos2.afficherInfos();

        enclos2.nettoyerEnclos();
        enclos2.afficherInfos();

        Enclos enclos3 = new Enclos(3, 5);
        enclos3.ajouterAnimal(animal3);

        enclos3.degradations();
        enclos3.afficherInfos();

        enclos3.nettoyerEnclos();
        enclos3.afficherInfos();

        System.out.println("-------------------------------");

        System.out.println("\n=== Visiteurs ===");
        Client visiteur1 = new Client("Alice", 25, 50);
        Client visiteur2 = new Client(" youssef ", 8, 5);
        System.out.println(visiteur1);
        System.out.println(visiteur2);


        visiteur1.payerBillet(20);
        visiteur2.payerBillet(10);


        System.out.println("-------------------------------");

        System.out.println("\n=== Spectacle ===");
        Spectacle spectacle = new Spectacle("Le Spectacle des Lions", soigneur, "15h00", 10);

        spectacle.demarrerSpectacle();

        System.out.println("-------------------------------");
        System.out.println("\n=== tarrif et rentabilité ===");

        Zoo z =new Zoo("la jungle",5000);
        z.enregistrerVisiteur(100, 10);

        z.calculerRevenu();




        z.afficherInfos();
    }
    }
