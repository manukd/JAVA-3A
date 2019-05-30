public class Departement {
    private int numero;
    private String nom;
    private int nbVillesSaisies = 0;
    private int nbVilleMax;
    private Ville[] tabVilles;

    public Departement(int nbVilles) {
        this.nbVilleMax = nbVilles;
        this.tabVilles = new Ville[nbVilles];
        this.numero = 0;
        this.nom = "inconnu";
    }

    public Departement(int _numero, String _nom, int nbVilles) {
        this.nbVilleMax = nbVilles;
        this.tabVilles = new Ville[nbVilles];
        this.numero = _numero;
        this.nom = _nom;
    }

    public void ajouterVille(Ville ville)
    {
        if (this.nbVillesSaisies < this.nbVilleMax)
        {
            this.tabVilles[nbVillesSaisies] = ville;
            this.nbVillesSaisies++;
        }
        else
        {
            System.out.println("L'action est impossible, le nombre de ville maximum à été atteint");
        }
    }

    public String toString() {
        String res;
        res = "Villes du département " + this.nom + " :";
        for (int i = 0 ; i < this.nbVillesSaisies ; i ++)
        {
            res += "\n"+ i +". " + this.tabVilles[i].toString();
        }
        return res;
    }

}
