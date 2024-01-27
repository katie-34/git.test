package ExerciceRenforcement;

public class Interrupteur {
    Lampe ampoule;
    public Interrupteur(Lampe ampoule) {this.ampoule = ampoule;}
    public void Ouvert() {
        ampoule.Allume();
        ampoule.Etat();
    }
        public void Ferme() {
            ampoule.eteinte();
            ampoule.Etat();
        }
    }






