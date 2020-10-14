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



        //affichage du plateau de jeu
        //System.out.println("-----------------------") ;

        for ( i = 0; i < ligne; i++ ) {
            for ( j = 0; j < colonne; j++ )  {
                plateauDeJeu[i][j] = '□' ;
                System.out.print(plateauDeJeu[i][j] ) ;
            }
            System.out.println() ;
            //System.out.println("-----------------------") ;

        }













    }
}







