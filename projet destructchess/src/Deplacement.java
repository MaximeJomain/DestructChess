import java.util.Scanner;

public class Deplacement {

    public static void deplacerJoueur() {

        //Scanner pour le déplacement du joueur
        Scanner inputDeplacement = new Scanner(System.in);


        int boucle = 1;

        while (boucle == 1) {
            String mouvement = inputDeplacement.next() ;


                if (variablesGlobales.joueurQuiCommence == 1) {
                    variablesGlobales.plateauDeJeu[variablesGlobales.yJoueur1][variablesGlobales.xJoueur1] = fonctionsPourJeu.ANSI_WHITE + " ■ " + fonctionsPourJeu.ANSI_RESET;

                    switch (mouvement) {
                        case "z", "Z" -> {
                            variablesGlobales.yJoueur1--;
                            variablesGlobales.joueurQuiCommence++;
                            boucle = 0;
                        }
                        case "q", "Q" -> {
                            variablesGlobales.xJoueur1--;
                            variablesGlobales.joueurQuiCommence++;
                            boucle = 0;
                        }
                        case "s", "S" -> {
                            variablesGlobales.yJoueur1++;
                            variablesGlobales.joueurQuiCommence++;
                            boucle = 0;
                        }
                        case "d", "D" -> {
                            variablesGlobales.xJoueur1++;
                            variablesGlobales.joueurQuiCommence++;
                            boucle = 0;
                        }
                        case "Quitter", "quitter" -> variablesGlobales.quitterLeJeu = true ;
                    }
                }

                else if (variablesGlobales.joueurQuiCommence == 2) {
                    variablesGlobales.plateauDeJeu[variablesGlobales.yJoueur2][variablesGlobales.xJoueur2] = fonctionsPourJeu.ANSI_WHITE + " ■ " + fonctionsPourJeu.ANSI_RESET;

                    switch (mouvement) {
                        case "z", "Z" -> {
                            variablesGlobales.yJoueur2--;
                            variablesGlobales.joueurQuiCommence = 1;
                            boucle = 0;
                        }
                        case "q", "Q" -> {
                            variablesGlobales.xJoueur2--;
                            variablesGlobales.joueurQuiCommence = 1;
                            boucle = 0;
                        }
                        case "s", "S" -> {
                            variablesGlobales.yJoueur2++;
                            variablesGlobales.joueurQuiCommence = 1;
                            boucle = 0;
                        }
                        case "d", "D" -> {
                            variablesGlobales.xJoueur2++;
                            variablesGlobales.joueurQuiCommence = 1;
                            boucle = 0;
                        }
                        case "Quitter", "quitter" -> variablesGlobales.quitterLeJeu = true ;
                    }
                }

            }

        }
    }

