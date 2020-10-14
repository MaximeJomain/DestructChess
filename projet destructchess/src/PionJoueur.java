public class PionJoueur
{
    //Creation d'un pion de Joueur
    public static void pionJoueur1(int positionPionX, int positionPionY, char[][] matrice)
    {
        matrice [positionPionX][positionPionY] = '1';
    }
    public static void pionJoueur2(int positionPionX, int positionPionY, char[][] matrice)
    {
        matrice [positionPionX][positionPionY] = '2';
    }
}
