public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(1,5);
        Cercle cercle1 = new Cercle(1,3);
        Rectangle rectangle = new Rectangle(1,8,4);
        Rectangle rectangle1 = new Rectangle(1,8,8);
        Rectangle rectangle2 = new Rectangle(1,1,2);

        cercle.calculPerimetr();
        cercle.calculSuperficie();

        rectangle.calculPerimetr();
        rectangle.calculSuperficie();

        TableauGeometrique tab = new TableauGeometrique(5);
        tab.ajouterForme(cercle);
        tab.ajouterForme(cercle1);
        tab.ajouterForme(rectangle);
        tab.ajouterForme(rectangle1);
        tab.ajouterForme(rectangle2);

        tab.afficherTab();
        tab.trierTab();
        tab.afficherTab();
    }
}
