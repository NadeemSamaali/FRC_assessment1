/**
 * Classe permettant de calculer l'aire et le périmètre d'un triangle quelconque
 * @param createPoint() creation des points
 * @param pointDistance() calculation des distances entre les points
 * @param perimiter() calculation du périmètre du triangle quelconque
 * @param area() calculation du périmètre du triangle quelconque
 * @author Nadeem Imam Samaali
 * @version v1.0
*/

package app.anypolygon;
import app.Shape;
import app.Point;

public class AnyTriangle extends Shape
{
    /**
     * Méthode qui créer les points utilisés pour la création des segments du triangle quelconque
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    @Override
    public void createPoint()
    {
        point[0] = new Point();
        point[1] = new Point();
        point[2] = new Point();
    }

    //DÉCLARATION DES SEGMENTS
    double AB;
    double BC;
    double AC;

    /**
     * Méthode permettant le calcul des distances entre les points insérés
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    @Override
    public void pointDistance() 
    {
        AB = (Math.sqrt(Math.pow(point[1].getX() - point[0].getX(), 2) + Math.pow(point[1].getY() - point[0].getY(), 2))); 
        BC = (Math.sqrt(Math.pow(point[2].getX() - point[1].getX(), 2) + Math.pow(point[2].getY() - point[1].getY(), 2))); 
        AC = (Math.sqrt(Math.pow(point[0].getX() - point[2].getX(), 2) + Math.pow(point[0].getY() - point[2].getY(), 2)));
    }

    /**
     * Méthode permettant de calculer le périmetre du triangle quelconque en additionnant les cotés + impréssion du résultat
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    @Override
    public void perimiter() 
    {
        perimiter = AB + BC + AC;
        System.out.println("Le périmetre du TRIANGLE_QUELCONQUE est de: " + perimiter + " U");
    }

    /**
     * Méthode permettant de calculer l'aire du triangle quelconque selon la formule du Héron + impréssion du résultat
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    @Override
    public void area() 
    {
        area = Math.sqrt(perimiter / 2 * (perimiter / 2 - AB) * (perimiter / 2 - BC) * (perimiter / 2 - AC));
        System.out.println("L'aire du TRIANGLE_QUELCONQUE est de: " + area + " U²");
    }

    /**
     * Méthode permettant de vérifier si les données insérées sont légales, soit, si le triangle quelconque n'est pas un point
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    @Override
    public void verification() 
    {
        //Si les coordonnées partagent tous la valeur de 0...
        if(AB == 0 && BC == 0 && AC == 0)
        {
            //...il y a une erreur
            error = true;
            System.out.println("Attention! Ceci n'est pas TRIANGLE QUELCONQUE mais un POINT");
        }
    }

}