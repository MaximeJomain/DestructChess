import java.util.Random;
import java.util.Scanner;

public class variablesGlobales {

    public static Random rand = new Random();
    public static int joueurQuiCommence = rand.nextInt(2);

    public static int colonne = 11 ;
    public static int ligne = 10 ;
    public static String [][] plateauDeJeu = new String [ligne][colonne] ;
    public static boolean quitterLeJeu = false ;


    public static int xJoueur1 = 5 ;
    public static int yJoueur1 = 4 ;
    public static int xJoueur2 = 5 ;
    public static int yJoueur2 = 5 ;


}
