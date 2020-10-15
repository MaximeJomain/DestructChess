import java.util.Scanner;

//Creation de la fonction de Destruction
public class Detruire
{
    //On prends la ligne et la colonne que le joueur souhaite détruire

    /** Fonction Destruction
     * La fonction prends en premier lieux deux input de la part du joueur, un pour la colonne et un pour la ligne
     * Pour prendre les input du joueur, on utilise la fonction Scanner, et afin de s'assurer de la bonne entrée de l'utilisateur
     * Deux boucles while l'une dans l'autre, vérifient que ce soit bien un int 0 et 9 (ou 10), et non autre chose.
     * @return Les input des joueurs, et sort la case détruite.
     */

    public static int ligneADetruire()
    {

        //On demande à l'utilisateur une ligne à détruire, en vérifiant qu'elle soit valable, et que ce soit bien des chiffres de donnés
        System.out.println("Entrez une numéro de ligne pour la case à détruire (entre 0 et 10)");

        Scanner foo = new Scanner(System.in);
        int ligneDetruite = -1;

        while(ligneDetruite > 10 || ligneDetruite < 0)
        {
            while(!foo.hasNextInt())
            {
                foo.next();
                System.out.println("Nope, c'est pas un chiffre");
            }
            ligneDetruite = foo.nextInt();

        }
        return ligneDetruite;
    }

    public static int colonneADetruire()
    {
        //On demande à l'utilisateur une colonne à détruire, en vérifiant qu'elle soit valable, et que ce soit bien des chiffres de donnés
        System.out.println("Entrez un numéro entre 0 et 9 pour sélectionner la colonne à détruire");
        
        Scanner foo = new Scanner(System.in);
        int colonneDetruite = -1;
        
        while(colonneDetruite > 9 || colonneDetruite < 0) 
        {
            while(!foo.hasNextInt())
            {
                foo.next();
                System.out.println("Nope, c'est pas un chiffre");
            }
            colonneDetruite = foo.nextInt();
            System.out.println("Par contre la t'abuses.");
        }
        return colonneDetruite;
    }

    //Et enfin on détruit la case en question
    public static void detruire()
    {

        variablesGlobales.ligneCaseDetruire = ligneADetruire() ;
        variablesGlobales.colonneCaseDetruite = colonneADetruire() ;
        variablesGlobales.plateauDeJeu[variablesGlobales.ligneCaseDetruire][variablesGlobales.colonneCaseDetruite] = "   ";

        System.out.println("Vous avez détruit la case " + variablesGlobales.ligneCaseDetruire + " , " + variablesGlobales.colonneCaseDetruite);
    }
}