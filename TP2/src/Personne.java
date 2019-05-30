public class Personne {
    private String nom;
    public String prenom;
    protected int age;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Personne()
    {
        nom = "Annyme";
        prenom = "Anonyme";
        age = -1;
    }

    public Personne( String nom, String prenom, int age)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public void ouMeTrouver()
    {
        System.out.println("Je ne sais pas où je suis.");
    }

    public String toString() {
        return (this.getNom() + " " + this.getPrenom() + " a " + this.getAge() + " ans.");
    }
}
