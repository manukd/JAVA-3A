public class Ville {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    private String nom;
    private double superficie;
    private int population;

    public Ville() {
        this.nom = "inconnu";
        this.superficie = 0;
        this.population = 0;
    }

    public Ville(String _nom, double _superficie, int _population) {
        this.nom = _nom;
        this.superficie = _superficie;
        this.population = _population;
    }

    public String toString() {
        return (this.nom + ", " + this.superficie + " kilomèetres carrées, pour " + this.population + " habitants");
    }

    public boolean estIdentiqueA(Ville ville)
    {
        boolean res = true;
        if (this.nom != ville.getNom() || this.population != ville.getPopulation() || this.superficie != ville.getSuperficie())
        {
            res = false;
        }
        return res;
    }

    static public boolean sontIdentiques(Ville ville, Ville ville1)
    {
        boolean res = true;
        if (ville1.getNom() != ville.getNom() || ville1.getPopulation() != ville.getPopulation() || ville1.getSuperficie() != ville.getSuperficie())
        {
            res = false;
        }
        return res;
    }
}
