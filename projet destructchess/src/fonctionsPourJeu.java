import java.util.Scanner;

public class fonctionsPourJeu {

    //test de fonctions pour les couleurs
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static String demandePseudoJoueur1() {

        //demande le pseudo du joueur 1
        System.out.print("Entrer le pseudo du joueur 1 : ");
        Scanner psd1 = new Scanner(System.in);
        String pseudo1 = psd1.nextLine();

        return pseudo1;

    }

    public static String demandePseudoJoueur2() {

        //demande le pseudo du joueur 2
        System.out.print("Entrer le pseudo du joueur 2 : ");
        Scanner psd2 = new Scanner(System.in);
        String pseudo2 = psd2.nextLine();

        return pseudo2;

    }

    public static void afficherPlateau(int joueur1x, int joueur1y, int joueur2x, int joueur2y) {
        int i;
        int j;
        for (i = 0; i < variablesGlobales.ligne; i++) {
            for (j = 0; j < variablesGlobales.colonne; j++) {
                variablesGlobales.plateauDeJeu[i][j] = fonctionsPourJeu.ANSI_WHITE + " ■ " + fonctionsPourJeu.ANSI_RESET;
                variablesGlobales.plateauDeJeu[joueur1y][joueur1x] = fonctionsPourJeu.ANSI_RED + " ■ " + fonctionsPourJeu.ANSI_RESET;
                variablesGlobales.plateauDeJeu[joueur2y][joueur2x] = fonctionsPourJeu.ANSI_BLUE + " ■ " + fonctionsPourJeu.ANSI_RESET;

                System.out.print(variablesGlobales.plateauDeJeu[i][j]);
            }
            System.out.println();
            //System.out.println("-----------------------") ;
        }
    }
}


