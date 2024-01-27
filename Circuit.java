package ExerciceRenforcement;
public class Circuit {
    public static void main (String[] args) {
        Interrupteur interrupteur = new Interrupteur(new Lampe());
        interrupteur.Ouvert();
        interrupteur.Ferme();
        }
    }

