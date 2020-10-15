import java.util.Random;


//création de la story #03
public class Main {

    public static void main(String[] args) {

        //randomizer du joueur qui commence





        //demande des pseudos des deux joueurs
        fonctionsPourJeu.demandePseudoJoueur1();
        fonctionsPourJeu.demandePseudoJoueur2();


        //affichage du plateau de jeu

        while (variablesGlobales.quitterLeJeu == false) {


            fonctionsPourJeu.afficherPlateau(variablesGlobales.xJoueur1, variablesGlobales.yJoueur1, variablesGlobales.xJoueur2, variablesGlobales.yJoueur2);

            Deplacement.deplacerJoueur();


            fonctionsPourJeu.clearScreen();
        }
    }
}








