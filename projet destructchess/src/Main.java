import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        //initialisation des variables local
        Scanner commande = new Scanner(System.in);
        int choixJoueur; //choix du joueur 1
        //choixJoueur = commande.nextInt();





        //Verification de l'entrée de l'utilisateur, afin que ce soit bien des chiffres de rentrés
        System.out.println("Bonjour et bienvenu dans insert un nom, choisit un numéro pour navigué");

        System.out.println(1 +" Joué");
        System.out.println( 2 +" Règles");
        System.out.println(3 +" Quitté" );

        while ((!commande.hasNextInt() && commande.hasNextInt())){
            System.out.println("C'est 1 2 ou 3");
            commande.next();
        }

        if (commande.hasNextInt(3)) {
            System.exit(3);
        }

        else if (commande.hasNextInt(2)){

        }

        else if (commande.hasNextInt(1)){

        }
        else{
            System.out.println("C'est 1 2 ou 3");
            commande.next();
        }


    }
}