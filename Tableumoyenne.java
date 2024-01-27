package ExerciceRenforcement;
import java.util.Scanner;
public class Tableumoyenne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la longueur du tableau :");
        int n = sc.nextInt();
        int[] tab = new int[n];
        int max = 0;
        int min = 0;
        int som = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Entrez l'elements n° " + i + " du tableau ");
            tab[i] = sc.nextInt();
            if (max < tab[i]) {
                max = tab[i];
            }
            min = tab[0];
            if (min > tab[i] + 1) {
                min = tab[i];
            }
            som = som + tab[i];
        }
        double moy = (double) som / n;

        System.out.println("La valeur maximale est : " + max);
        System.out.println("La valeur minimal est : " + min);
        System.out.println("La moyenne est : " + moy);
    }
}

