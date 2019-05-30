public class Administratif extends Personnel {
    private String fonction;

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Administratif() {
        this.fonction = "Aucune";
    }

    public Administratif(String nom, String prenom, int age, String service, String fonction) {
        super(nom, prenom, age, service);
        this.fonction = fonction;
    }

    public void ouMeTrouver()
    {
        System.out.println("Le plus facile c'est de passer à mon bureau.");
    }

    @Override
    public String toString() {
        return super.toString() + " Et je suis dans l'administratif.";
    }
}
