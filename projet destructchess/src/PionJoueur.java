public class PionJoueur
{
    //Creation de Pion de Joueur 1
    public static void pionJoueur1(int positionPionX, int positionPionY, char[][] matrice)
    {
        matrice [positionPionX][positionPionY] = '1';
    }

    //Creation de Pion de Joueur 2
    public static void pionJoueur2(int positionPionX, int positionPionY, char[][] matrice)
    {
        matrice [positionPionX][positionPionY] = '2';
    }
}
