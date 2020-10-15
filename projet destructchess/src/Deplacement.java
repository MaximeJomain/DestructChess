import java.util.Scanner;

public class Deplacement {

    public static void deplacerJoueur() {

        //Scanner pour le déplacement du joueur
        Scanner inputDeplacement = new Scanner(System.in);


        int boucle = 1;

        while (boucle == 1) {
            char mouvement = inputDeplacement.next().charAt(0);


                if (variablesGlobales.joueurQuiCommence == 0) {

                    if (mouvement == 'z') {
                        variablesGlobales.yJoueur1--;
                        variablesGlobales.joueurQuiCommence++ ;
                        boucle = 0;

                    } else if (mouvement == 'q') {
                        variablesGlobales.xJoueur1--;
                        variablesGlobales.joueurQuiCommence++ ;
                        boucle = 0;

                    } else if (mouvement == 's') {
                        variablesGlobales.yJoueur1++;
                        variablesGlobales.joueurQuiCommence++ ;
                        boucle = 0;

                    } else if (mouvement == 'd') {
                        variablesGlobales.xJoueur1++;
                        variablesGlobales.joueurQuiCommence++ ;
                        boucle = 0;
                    }
                }

                else if (variablesGlobales.joueurQuiCommence == 1) {

                    if (mouvement == 'z') {
                        variablesGlobales.yJoueur2--;
                        variablesGlobales.joueurQuiCommence = 0 ;
                        boucle = 0;

                    } else if (mouvement == 'q') {
                        variablesGlobales.xJoueur2--;
                        variablesGlobales.joueurQuiCommence = 0 ;
                        boucle = 0;

                    } else if (mouvement == 's') {
                        variablesGlobales.yJoueur2++;
                        variablesGlobales.joueurQuiCommence = 0 ;
                        boucle = 0;

                    } else if (mouvement == 'd') {
                        variablesGlobales.xJoueur2++;
                        variablesGlobales.joueurQuiCommence = 0 ;
                        boucle = 0;

                    }
                }

            }

        }
    }

