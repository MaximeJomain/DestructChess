import java.util.Random;
import java.util.Scanner;

//création de la story #03
public class Main {

    public static void main(String[] args) {

        //initialisation des variables scanner pour les pseudos
        Scanner psd1 = new Scanner(System.in) ;
        Scanner psd2 = new Scanner(System.in) ;
        Random rand = new Random();
        int joueurQuiCommence = rand.nextInt(2) ;;

        //initialisation du plateau de jeu
        int colonne = 11 ;
        int ligne = 10 ;
        int i ;
        int j ;
        char [][] plateauDeJeu = new char [ligne][colonne] ;

        //demande des pseudos des deux joueurs
        System.out.print("Entrer le pseudo du joueur 1 : ");
        String pseudo1 = psd1.nextLine() ;
        System.out.print("Entrer le pseudo du joueur 2 : ");
        String pseudo2 = psd2.nextLine() ;

        //Création des pions joueurs
        int positionJoueur1X = 5;
        int positionJoueur1Y = 5;
        int positionJoueur2X = 4;
        int positionJoueur2Y = 5;

        //affichage du plateau de jeu et des pions joueurs
        //System.out.println("-----------------------") ;

        for ( i = 0; i < ligne; i++ ) {
            for ( j = 0; j < colonne; j++ )  {
                plateauDeJeu[i][j] = '□' ;
                PionJoueur.pionJoueur1(positionJoueur1X,positionJoueur1Y,plateauDeJeu);
                PionJoueur.pionJoueur2(positionJoueur2X,positionJoueur2Y,plateauDeJeu);
                System.out.print(plateauDeJeu[i][j] + " ") ;
            }
            System.out.println() ;
            //System.out.println("-----------------------") ;
        }
    }
}