import java.util.Scanner;

public class Menu {
    boolean quitter; //Toujours faux (False)

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.demarrerMenu();

    }

    //Le lancement du menu et récuperation des info
    public void demarrerMenu(){
        bannierMenu();
        while (!quitter){
            impriMenu();
            int choix = entreeUtilisateur();
            effectuerUneTache(choix);
        }
    }

    //c'est une bannier sympas
    private void bannierMenu() {
        System.out.println("+-----------------------------------+");
        System.out.println("|           Bienvenu dans           |");
        System.out.println("|           EL FAMOSO JEU           |");
        System.out.println("+-----------------------------------+");
    }

    //Le menu
    private void impriMenu() {
        System.out.println("\nVeuillez faire un choix");
        System.out.println("2) Jouer");
        System.out.println("1) Règles");
        System.out.println("0) Quitter");
    }

    //Récuperation des entrées utilisateur
    private int entreeUtilisateur(){
        Scanner utilisateursc = new Scanner(System.in);
        int choix = -1;
        while (choix < 0 || choix > 2){
            try{
                System.out.print("\nEntrez votre choix:");
                choix = Integer.parseInt(utilisateursc.nextLine()); // tranforme un string en int
            }
            catch (NumberFormatException e){
                System.out.println("Sélection non valable, veuillez réessayer");
            }
            if (choix < 0 || choix > 2) {
                System.out.println("Autodestruction dans ... non je déconne, ta pas compris quoi dans 0,1 ou 2 ?");
            }
        }
        return choix;
    }

    //Attribution des taches
    private void effectuerUneTache(int choix){
        switch (choix){
            case 0:
                quitter = true;
                System.out.println("Merci d'avoir joué");
                break;
            case 1:
                //règles
                break;
            case 2:
                //jouer
                break;
            default:
                System.out.println("une erreur est survenue");
        }
    }




}
