import java.util.Random;


//création de la story #03
public class Main {

    public static void main(String[] args) {

        //randomizer du joueur qui commence

        Random rand = new Random();
        int joueurQuiCommence = rand.nextInt(2) ;;


        //demande des pseudos des deux joueurs
        fonctionsPourJeu.demandePseudoJoueur1();
        fonctionsPourJeu.demandePseudoJoueur2();



        //affichage du plateau de jeu
        fonctionsPourJeu.afficherPlateau(variablesGlobales.xJoueur1, variablesGlobales.yJoueur1 , variablesGlobales.xJoueur2 , variablesGlobales.yJoueur2);



        }













    }








