/**
        * CETTE FONCTION N'EST PAS UTILISÉE POUR LE MOMENT DANS LE CODE
        * On cherche à avoir un boolean en sortie, afin de simplement vérifier si le joueur peut bouger ou non.
        * Pour ce faire, nous demandons la position du joueur, et on définit les cases autour de celle ci.
        * La vérification des cases devait se faire en checkant chaque case autour de celle du joueur.
        * Si au moins une case était vide, la partie continue, mais si au début du tour, un des deux joueurs ne peut pas se déplacer, alors c'est Game Over.
        */
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