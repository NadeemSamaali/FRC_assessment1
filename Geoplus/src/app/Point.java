
/**
 * Classe permettant l'attribution d'une coordonnée à un point créé
 
 * @author Nadeem Imam Samaali
 * @version v1.0
*/

package app;

public class Point
{
    //DÉCLARATION DES 
    private double x;
    private double y;

    /**
     * Methode permettant de trouver la valeur de la coordonnée X
     * @param X création de la coordonnée X du point
     */
	public void setX(double X)
    {
        this.x = X;
    }

    /**
     * Methode permettant de trouver la valeur de la coordonnée Y
     * @param Y création de la coordonnée Y du point
     */
    public void setY(double Y)
    {
        this.y = Y;
    }

    /**
     * Cette méthode permet de retourner la valeur de X pour qu'elle puisse être calculée
     * @return x - retour de la variable x
     */
    public double getX()
    {
        return x;
    }

    /**
     * Cette méthode permet de retourner la valeur de Y pour qu'elle puisse être calculée
     * @return y - retour de la variable y
     */
    public double getY()
    {
        return y;
    }
}