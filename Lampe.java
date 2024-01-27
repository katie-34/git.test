package ExerciceRenforcement;

public class Lampe {
   private boolean allume;

    public Lampe(){}
    public void Allume(){
        allume = true;
        System.out.println("La lampe est allumée");
    }
    public void eteinte(){
        allume = false;
        System.out.println("La lampe est eteinte");
        }
    public boolean Etat(){
        return this.allume;
        }
    }




