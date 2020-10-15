import java.util.Scanner;

public class Menu {
    boolean quitter; //Toujours faux (False)

    public static void main() {
        Menu menu = new Menu();
        menu.demarrerMenu();

    }

    /**
     * permet de quitté et appel les fonctions de menu et d'entrée utilisateur
     */
    //Le lancement du menu et récuperation des info
    public void demarrerMenu(){
        bannierMenu();
        while (!quitter){
            impriMenu();
            int choix = entreeUtilisateur();
            effectuerUneTache(choix);
        }
    }

    /**
     * permet d'imprimer la bannier a l'utilisateur
     */
    //c'est une bannier sympas
    private void bannierMenu() {
        System.out.println("+-----------------------------------+");
        System.out.println("|           Bienvenu dans           |");
        System.out.println("|           LORD OF CHESS           |");
        System.out.println("+-----------------------------------+");
    }

    /**
     * permet d'imprimer la liste des choix a l'utilisateur
     */
    //Le menu
    private void impriMenu() {
        System.out.println("\nVeuillez faire un choix");
        System.out.println("3) Jouer");
        System.out.println("2) Règles");
        System.out.println("1) Scores");
        System.out.println("0) Quitter");
    }

    /**
     * On n'a initier un scanner utilisateur pour récupéré les valeurs entré par l'utilisateur,
     * et pouvoir navigué dans le menu
     * nous avons aussi intier le choix à -1 pour éviter tout conflit avec le menu,
     * et pouvoir comparé les entres utilisateur et l'empercher de sortir des valeurs initial du menu.
     * try nous permet de verifier l'entré utilisateur grace a l Integer.parseInt
     * catch nous permet de d'empêcher les entrées de caracteres et nous donné un message d'erreur
     * if à lui aussi a un rôle de bloquer mais pour mais pour les chiffres
     *
     * @return nous rend notre entrée utilisateur dans notre boucle qui recompare avec le try
     */
    //Récuperation des entrées utilisateur
    private int entreeUtilisateur(){
        Scanner utilisateursc = new Scanner(System.in);
        int choix = -1;
        while (choix < 0 || choix > 3){
            try{
                System.out.print("\nEntrez votre choix:");
                choix = Integer.parseInt(utilisateursc.nextLine()); // tranforme un string en int
            }
            catch (NumberFormatException e){
                System.out.println("Sélection non valable, veuillez réessayer");
            }
            if (choix < 0 || choix > 3) {
                System.out.println("Autodestruction dans ... non je déconne, ta pas compris quoi dans 0, 1, 2 ou 3 ?");
            }
        }
        return choix;
    }

    /**
     * on utilise un switch pour pouvoir établir plusieurs choix qui vont correspondre avec le menu
     * case 0 : nous permet de changer la valeur du boolean qui permet de fermer le logiciel en plus d'écrire un petit message
     * case 1 : appel la fonction scores
     * case 2 : appel la fonction règles
     * case 3 : appel les fonctions pour joué
     * default  verifié en cas d'erreur les case
     * @param choix permet de choisir la case correspondante a l'entrée associé
     */
    //Attribution des taches
    private void effectuerUneTache(int choix){
        switch (choix){
            case 0:
                quitter = true;
                System.out.println("Merci d'avoir joué");
                break;
            case 2: Règles.main();
                //règles
                break;
            case 3://jouer
                Jouer.main();


                break;
            case 1: Scores.main();

                break;
            default:
                System.out.println("une erreur est survenue");
        }
    }




}
