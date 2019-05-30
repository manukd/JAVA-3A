public class ErreurNotes extends Exception {
    private int nbNotes;
    private int nbMatieres;
    private int note;

    public ErreurNotes(){
        System.out.println("Vous avez sollicité un gestionnaire d'exceptions ?");
    }

    public ErreurNotes(int _nbNotes, int _nbMatieres, int _note){
        System.out.println("Vous avez sollicité un gestionnaire d'exceptions ?");
        this.nbNotes = _nbNotes;
        this.nbMatieres = _nbMatieres;
        this.note = _note;
    }

    public String recuperMessageErreur()
    {
        String res="";
        if (nbNotes <= nbMatieres)
        {
            res += "Nombre de notes maximum depassées";
        }
        if (note < 0 || note > 20)
        {
            res += "la note n'est pas comprise entre 0 et 20";
        }
        return res;
    }
}
