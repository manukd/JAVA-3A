public abstract class FormeGeometrique {
    protected double longeur;
    protected double largeur;
    protected double rayon;
    protected double epaisseurTrait;

    public FormeGeometrique(double epaisseurTrait) {
        this.epaisseurTrait = epaisseurTrait;
    }

    public abstract double calculPerimetr();
    public abstract double calculSuperficie();

    public abstract String toString();
}
