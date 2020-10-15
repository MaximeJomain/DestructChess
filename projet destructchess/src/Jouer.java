public class Jouer {

    public static void main() {

        variablesGlobales.quitterLeJeu = false ;

        //demande des pseudos des deux joueurs
        variablesGlobales.pseudoJoueur1 = fonctionsPourJeu.demandePseudoJoueur1();
        variablesGlobales.pseudoJoueur2 = fonctionsPourJeu.demandePseudoJoueur2();

        for (int i = 0; i < variablesGlobales.ligne; i++) {
            for (int j = 0; j < variablesGlobales.colonne; j++) {
                variablesGlobales.plateauDeJeu[i][j] = fonctionsPourJeu.ANSI_WHITE + " ■ " + fonctionsPourJeu.ANSI_RESET;
            }
        }

        //entrée dans le mode jeu tant que la variable quitter le jeu est false
        while (variablesGlobales.quitterLeJeu == false) {

            //boucle qui permet d'espacer l'affichage dans la console
            for ( int i = 0 ; i<50 ; i++) {
                System.out.println();
            }

            //fonction permettant d'afficher le plateau de jeu avec les cases mises a jours
            fonctionsPourJeu.afficherPlateau(variablesGlobales.xJoueur1, variablesGlobales.yJoueur1, variablesGlobales.xJoueur2, variablesGlobales.yJoueur2);

            //affichage du joueur qui joue ce tour la
            if (variablesGlobales.joueurQuiCommence == 1) {
                System.out.println("Au tour du joueur " + fonctionsPourJeu.ANSI_RED + variablesGlobales.pseudoJoueur1 + fonctionsPourJeu.ANSI_RESET + " !");
            }

            else if (variablesGlobales.joueurQuiCommence == 2) {
                System.out.println("Au tour du joueur " + fonctionsPourJeu.ANSI_BLUE + variablesGlobales.pseudoJoueur2 + fonctionsPourJeu.ANSI_RESET + " !");
            }
            System.out.println();
            System.out.println("z = aller en haut  ");
            System.out.println("s = aller en bas  ");
            System.out.println("q = aller a gauche  ");
            System.out.println("d = aller a droite  ");
            System.out.println("Entrez 'Quitter' pour revenir au menu principal");
            System.out.println("Entrer une commande de déplacement :");


            Deplacement.deplacerJoueur();
            if (variablesGlobales.quitterLeJeu == true ) {
                return;
            }
            Detruire.detruire();

        }
    }
}
