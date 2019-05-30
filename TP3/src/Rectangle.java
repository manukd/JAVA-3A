public class Rectangle extends FormeGeometrique {
    public Rectangle(double epaisseurTrait, double _longeur, double _largeur) {
        super(epaisseurTrait);
        this.largeur = _largeur;
        this.longeur = _longeur;
    }

    @Override
    public double calculPerimetr() {
        return 2*this.longeur+2*this.largeur;
    }

    @Override
    public double calculSuperficie() {
        return this.longeur*this.largeur;
    }

    @Override
    public String toString() {
        return "C'est un rectangle de " + this.calculSuperficie();
    }
}
