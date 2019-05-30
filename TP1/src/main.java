public class main {


    public static void main(String[] args) {
        Ville dijon = new Ville("Dijon",40.41,375831);
        Ville beaune = new Ville("Quetigny",8.19,9690);
        Ville Quetigny = new Ville("Beaune",31.33,52741);
        Ville Macon = new Ville("Macon",27.0,100172);
        Ville Chalon = new Ville("Chalon-sur-Saône",15.22,133557);
        Departement coteDor = new Departement(21,"Côte d'or",3);
        Departement saoneEtLoire = new Departement(21,"Saône-et-Loire",2);

        coteDor.ajouterVille(dijon);
        coteDor.ajouterVille(beaune);
        coteDor.ajouterVille(Quetigny);
        saoneEtLoire.ajouterVille(Macon);
        saoneEtLoire.ajouterVille(Chalon);

        //System.out.println(saoneEtLoire);
        //System.out.println(coteDor);
        if(Ville.sontIdentiques(dijon,beaune))
        {
            System.out.println("Sont identiques");
        }
        else
        {
            System.out.println("ne sont pas identiques");
        }

    }
}
