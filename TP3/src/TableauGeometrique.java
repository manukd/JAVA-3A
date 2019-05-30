import java.text.Normalizer;

public class TableauGeometrique {
    private int nbFormeGeometrique;
    private FormeGeometrique[] tabFormeGeometrique;
    private int indexActuel = 0;

    public TableauGeometrique(int _tailleTab) {
        nbFormeGeometrique = _tailleTab;
        this.tabFormeGeometrique = new FormeGeometrique[nbFormeGeometrique];
    }

    public void ajouterForme(FormeGeometrique _forme)
    {
        if(indexActuel < nbFormeGeometrique)
        {
            tabFormeGeometrique[indexActuel] = _forme;
            indexActuel++;
        }
        else
        {
            System.out.println("Tableau plein");
        }
    }

    public void afficherTab()
    {
        for (int i = 0 ; i < this.nbFormeGeometrique ; i++)
        {
            System.out.println(this.tabFormeGeometrique[i]);
        }
    }

    public void trierTab()
    {
        FormeGeometrique temp;
        for (int i = 0 ; i < this.nbFormeGeometrique-1 ; i++)
        {
            for (int j = i+1 ; j < this.nbFormeGeometrique ; j++)
            {
                if (this.tabFormeGeometrique[i].calculSuperficie() > this.tabFormeGeometrique[j].calculSuperficie())
                {
                    temp = this.tabFormeGeometrique[i];
                    this.tabFormeGeometrique[i] = this.tabFormeGeometrique[j];
                    this.tabFormeGeometrique[j] = temp;
                }
            }
        }
    }
}
