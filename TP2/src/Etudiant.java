public class Etudiant extends Personne {
    private String promotion;
    private int nbAbsences;

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public int getNbAbsences() {
        return nbAbsences;
    }

    public void setNbAbsences(int nbAbsences) {
        this.nbAbsences = nbAbsences;
    }

    public Etudiant() {
        this.promotion = "Aucune";
        this.nbAbsences = 0;
    }

    public Etudiant(String nom, String prenom, int age, String _promotion, int _absences)  {
        super(nom, prenom, age);
        this.promotion = _promotion;
        this.nbAbsences = _absences;
    }

    public void ouMeTrouver()
    {
        System.out.println("Je suis en cours tous les jours.");
    }

    @Override
    public String toString() {
        return super.toString() + " Et je suis étudiant.";
    }
}
