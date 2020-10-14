import java.sql.SQLOutput;

//création de la story #03
public class Main {

    public static void main(String[] args) {
        //initialisation du plateau de jeu
        int colonne = 11 ;
        int ligne = 10 ;
        int i ;
        int j ;
        int [][] plateauDeJeu = new int [ligne][colonne] ;

        //affichage du plateau de jeu
        for ( i = 0; i < ligne; i++ ) {
            for ( j = 0; j < colonne; j++ )  {
                System.out.print("|" + plateauDeJeu[i][j] ) ;
            }
            System.out.println("|") ;
        }












    }
}







