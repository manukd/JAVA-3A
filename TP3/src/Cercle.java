public class Cercle extends FormeGeometrique {
    public Cercle(double epaisseurTrait, double _rayon) {
        super(epaisseurTrait);
        this.rayon = _rayon;
    }

    @Override
    public double calculPerimetr() {
        return 2*Math.PI*this.rayon;
    }

    @Override
    public double calculSuperficie() {
        return Math.PI*(this.rayon*this.rayon);
    }

    @Override
    public String toString() {
        return "C'est un cercle de " + this.calculSuperficie();
    }
}
