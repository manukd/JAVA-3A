public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
    private int[] notes;
    private int nbMatieres = 3;
    private int nbNotes;

    public Etudiant(String nom, String prenom, int age, int _nbNotes) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.notes = new int[_nbNotes];
    }

    public void ajouterNotes(int note) throws ErreurNotes {
        /*if((nbNotes >= nbMatieres) || (note >= 0 || note <=20))
        {
            notes[nbNotes] = note;
            nbNotes++;
        }
        else
        {
            System.out.println("Erreur");
        }*/
        if((nbNotes >= nbMatieres) || (note < 0 || note > 20))
            throw new ErreurNotes(this.nbNotes,this.nbMatieres,note);
        notes[nbNotes] = note;
        nbNotes++;
    }

    public void afficherNotes()
    {
        for (int i = 0 ; i < nbNotes ; i++)
        {
            System.out.print(notes[i] + "\t");
        }
        System.out.println();
    }
}
