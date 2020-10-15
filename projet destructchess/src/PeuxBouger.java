public class PeuxBouger
{
    //Creation d'un boolean pour savoir si le pion est bloqué
    public static boolean peuxBouger(int colonneJoueur, int ligneJoueur)
    {
        //Intialisation des cases autour du joueur
        boolean peuxBouger = true;
        int casesDroite = colonneJoueur+1;
        int caseGauche = colonneJoueur-1;
        int caseHaut = ligneJoueur+1;
        int caseBas = ligneJoueur-1;

        //Verification des cases autour du joueur
        //if (caseBas)

        //Renvoie d'une valeure vraie si le joueur peut bouger, ou fausse s'il ne peut pas
        return peuxBouger;
    }
}