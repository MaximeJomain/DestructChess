import java.util.Scanner;

//Creation de la fonction de Destruction
public class Detruire
{
    //On prends la ligne et la colonne que le joueur souhaite détruire

    public static int ligneADetruire()
    {
        //Un scanner pour connaitre l'entrée du joueur
        System.out.println("Rentrez le numéro de la ligne de la case que vous souhaitez détruire (entre 0 et 10) : ");
        Scanner ligneADetruire = new Scanner(System.in);
        int ligneDetruite;

        //Verification de l'entrée de l'utilisateur, afin que ce soit bien un chiffre qui soit proposé
        while (!ligneADetruire.hasNextInt())
        {
            System.out.println("Nope, ça ne sera pas pris en compte");
            ligneADetruire.next();
        }
        ligneDetruite = ligneADetruire.nextInt();

        //Et que ce chiffre est compris dans notre matrice
        if (ligneDetruite >= 11 || ligneDetruite < 0)
        {
            System.out.println("Cette case n'existe même pas!");
            ligneDetruite = ligneADetruire.nextInt();
        }
        else
        {
            ligneADetruire.next();
        }
        return ligneDetruite;
    }

    public static int colonneADetruire()
    {
        //Un scanner pour connaitre l'entrée du joueur
        System.out.println("Rentrez le numéro de la colonne de la case que vous souhaitez détruire (entre 0 et 10 ) : ");
        Scanner colonneADetruire = new Scanner(System.in);
        int colonneDetruite;

        //Verification de l'entrée de l'utilisateur, afin que ce soit bien un chiffre qui soit proposé
        while (!colonneADetruire.hasNextInt())
        {
            System.out.println("J'ai demandé un chiffre..");
            colonneADetruire.next();
        }
        colonneDetruite = colonneADetruire.nextInt();

        //Et que ce chiffre est compris dans notre matrice
        if (colonneDetruite > 10 || colonneDetruite <= 0)
        {
            System.out.println("Cette case n'existe même pas!");
            colonneDetruite = colonneADetruire.nextInt();
        }
        else
        {
            colonneADetruire.next();
        }
        return colonneDetruite;
    }

    //Et enfin on détruit la case en question
    public static void detruire()
    {
        int ligneDest = ligneADetruire();
        int colonneDest = colonneADetruire();

        System.out.println("Vous avez détruit la case " + ligneDest + " , " + colonneDest);
    }
}