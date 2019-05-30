public class Exec {
    public static void main(String[] args) {
        Etudiant etu = new Etudiant("DEREPAS","Emmanuel", 20,10);

        try{
            etu.ajouterNotes(12);
            etu.ajouterNotes(13);
            etu.ajouterNotes(7);
            //etu.ajouterNotes(7);
            etu.afficherNotes();
        }
        catch (ErreurNotes e)
        {
            System.out.println("Exception soulevée");
            System.out.println(e.recuperMessageErreur());
        }
    }
}
