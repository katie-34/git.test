package ExerciceRenforcement;
import java.util.Scanner;
public class NombHasard {
    public static void main(String[] args) {
        int cpt = 1;
        int hasard = (int) (Math.random() * 30) + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Un nombre entre 1 et 30 est tiré au hasard devinez lequel");
        /*for (int i = 1; i <= 5; i++) {
            System.out.println("Essai n°" + i);
            System.out.println("Votre proposition :");
            int nbr = sc.nextInt();
            if (hasard > nbr) {
                System.out.println("Trop petit");
            } else if (hasard < nbr) {
                System.out.println("Trop grand");
            } else {
                System.out.println("Bravo! Vous avez trouvez " + hasard + " en " + i + " essai");
                break;
            }
            cpt = cpt + 1;
            if(cpt == 5){
                System.out.println("Desolé vous n'avez pas trouvé le bon nombre");
                break;
            }
        }*/
        while(cpt != 6){
            System.out.println("Essai n°" + cpt);
            System.out.println("Votre proposition :");
            int nbr = sc.nextInt();
            if (hasard > nbr) {
                System.out.println("Trop petit");
            } else if (hasard < nbr) {
                System.out.println("Trop grand");
            } else {
                System.out.println("Bravo! Vous avez trouvez " + hasard + " en " + cpt + " essai");
                break;
            }
            cpt = cpt + 1;
            if(cpt == 6){
                System.out.println("Desolé vous n'avez pas trouvé le bon nombre");
            }
        }
        }
    }









