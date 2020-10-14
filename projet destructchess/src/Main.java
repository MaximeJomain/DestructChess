import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        //initialisation des variables local
        Scanner operateurA = new Scanner(System.in);
        int operateur1; //choix du joueur 1
        int optionJoue = 1;
        int optionRegles = 2;








        //Verification de l'entrée de l'utilisateur, afin que ce soit bien des chiffres de rentrés
        System.out.println("Bonjour et bienvenu dans insert un nom, choisit un numéro pour navigué");

        System.out.println(1 +" Joué");





        System.out.println( 2 +" Régles");



        // Choix pour stopper le programme
        System.out.println(3 +" Quitté");{
            if(operateurA.hasNextInt(3)){
                System.exit(3);
            }
        }



        while (!operateurA.hasNextInt())
        {
            System.out.println("J'ai demandé des chiffres..");
            operateurA.next();
        }




        operateur1 = operateurA.nextInt();




    }
}