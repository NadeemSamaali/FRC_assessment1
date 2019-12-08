/**
 * Classe permettant de calculer l'aire et le périmètre d'un rectangle
   côtés opposés du rectangle sont isométriques et parallèles
 * @author Nadeem Imam Samaali
 * @version v1.0
*/

package app.regularpolygon;
import app.Shape;
import app.Point;

public class Rectangle extends Shape
{
    /**
     * Méthode qui créer les points utilisés pour la création des segments du rectangle
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    @Override
    public void createPoint()
    {
        point[0] = new Point();
        point[1] = new Point();
        point[2] = new Point();
        point[3] = new Point();
    }

    //DÉCLARATION DES SEGMENTS
    double AB;
    double BC;
    double CD;
    double DA;


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
        CD = (Math.sqrt(Math.pow(point[3].getX() - point[2].getX(), 2) + Math.pow(point[3].getY() - point[2].getY(), 2)));
        DA = (Math.sqrt(Math.pow(point[0].getX() - point[3].getX(), 2) + Math.pow(point[0].getY() - point[3].getY(), 2)));
    }

    /**
     * Méthode permettant de calculer l'aire du rectangle selon la formule Longueur*largeur + impréssion du résultat
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    @Override
    public void area() 
    {
        area = AB*BC;
        System.out.println("L'aire du RECTAGLE est de: " + area + " U²");
    }

    /**
     * Méthode permettant de calculer le périmetre du rectangle en additionnant les cotés + impréssion du résultat
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    @Override
    public void perimiter() 
    {
        perimiter = AB + BC + CD + DA;
        System.out.println("Le prérimètre du RECTANGLE est de: " + perimiter + " U");
    }

    /**
     * Méthode permettant de vérifier si les données insérées sont légales, soit, si les 
        côtés opposés du rectangle sont isométriques et parallèles.
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    @Override
    public void verification() 
    {
        //Si les côtés parallèles sont isométriques
        if(AB + BC == CD + DA)
        {
            //il n'y a pas d'erreurs
            error = false;

            //si les cotés du rectangles sont isométriques
            if(AB == BC && BC == CD && CD == DA && DA == AB)
            {
                //il n'y a pas d'erreurs
                error = false;
                //si le rectangle est un point
                if(AB == 0 && BC == 0 && CD == 0 && DA == 0)
                {
                    //il y a une erreur
                    error = true;
                    System.out.println("Attention, ceci ne s'agit pas d'un RECTANGLE mais d'un POINT...");
                }
                //imprimer le messages s'il n'y a pas derreurs
                if(error == false)
                System.out.println("Notez bien qu'un CARRÉ est aussi un RECTANGLE");
            }   
        }
        
        else
        {
            //il y a une erreur si les critères ci-dessus ne sont pas recpectés
            error = true;
            System.out.println("Erreur! Il est impossible de former le RECTANGLE: les côtés opposés ne sont pas isométriques.");
        }
    }
   
}