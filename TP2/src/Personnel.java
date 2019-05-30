public class Personnel extends Personne{
    private String service;

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Personnel()
    {
        super();
        this.service = "Aucun";
    }

    public Personnel( String nom, String prenom, int age, String service)
    {
        super(nom,prenom,age);
        this.service = service;
    }
    public void afficherAge()
    {
        System.out.println("Ce personnel a " + age + " an(s)");
    }
}
