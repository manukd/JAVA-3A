public class Execution {
    public static void main(String[] args) {
        Etudiant Alice = new Etudiant("Dupont","Alice",21,"Pascal",0);
        Etudiant Benj = new Etudiant("Dujardin","Benjamin",22,"Ohm",0);
        Etudiant anonyme1 = new Etudiant();
        Etudiant anonyme2 = new Etudiant();

        Administratif Beatrice = new Administratif("Dupont","Béatrice",19,"administratif","secretaire");

        Enseignant Boris = new Enseignant("Machin","Boris",36,"enseignant","informatique","électronique");

        Personne[] tab = {Alice,Benj,anonyme1,anonyme2,Beatrice,Boris};
        Alice.ouMeTrouver();
        Beatrice.ouMeTrouver();
        Boris.ouMeTrouver();

        tab[0].ouMeTrouver();

        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.println(tab[i]);
        }

        anonyme1.setNom("Ancien ano 1 nom");
        anonyme1.setPrenom("Ancien ano 1 prenom");
        anonyme1.setAge(20);
        anonyme1.setPromotion("Pascal");

        anonyme2.setNom("Ancien ano 2 nom");
        anonyme2.setPrenom("Ancien ano 2 prenom");
        anonyme2.setAge(21);
        anonyme2.setPromotion("Ohm");

        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.println(tab[i]);
        }


    }
}
