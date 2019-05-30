public class Enseignant extends Personnel {
     private String matierePrincipale;
     private String matiereSecondaire;


    public String getMatierePrincipale() {
        return matierePrincipale;
    }

    public void setMatierePrincipale(String matierePrincipale) {
        this.matierePrincipale = matierePrincipale;
    }

    public String getMatiereSecondaire() {
        return matiereSecondaire;
    }

    public void setMatiereSecondaire(String matiereSecondaire) {
        this.matiereSecondaire = matiereSecondaire;
    }

    public Enseignant(String service, String matierePrincipale, String matiereSecondaire) {
        this.matierePrincipale = "Aucune" ;
        this.matiereSecondaire = "Aucune" ;
    }

    public Enseignant(String nom, String prenom, int age, String service, String matierePrincipale, String matiereSecondaire) {
        super(nom, prenom, age, service);
        this.matierePrincipale = matierePrincipale;
        this.matiereSecondaire = matiereSecondaire;
    }
    public void ouMeTrouver()
    {
        System.out.println("Ce n'est pas le peine de me cherchern je saurai vous trouver !");
    }

    @Override
    public String toString() {
        return super.toString() + " Et je suis enseignant.";
    }
}
