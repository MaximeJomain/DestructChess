import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("hello, les zamis");

        Scanner operateurA = new Scanner(System.in);
        int operateur1;

        //Verification de l'entrée de l'utilisateur, afin que ce soit bien des chiffres de rentrés
        while (!operateurA.hasNextInt())
        {
            System.out.println("J'ai demandé des chiffres..");
            operateurA.next();
        }
        operateur1 = operateurA.nextInt();
        System.out.println(operateur1);
    }
}