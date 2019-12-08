package app;
import app.Point;

/**
 * La classe shape est une classe abstraite qui a pour but de découler
  ses caractéristiques aux classes de polygones pour ainsi calculer
  leur air, périmètre et distance entre les points, valider leur données 
  et créer les points.
  du polygone à calculer
 * @author Nadeem Imam Samaali
 * @version v1.0
 */

public abstract class Shape
{
    //CRÉATION DES POINTS UTILISABLES
    public Point point[] = new Point[4];

    //DÉCLARATION DES VARIABLES
    protected double area;
    protected double perimiter;
    protected boolean error = false;

    /**
     * Methode anstraite permettant aux polygones la création des points du polygone selon le nombre requis
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    abstract public void createPoint();

    /**
     * Methode abstraite permettant aux polygones de calculer la distance entre les points créés selon les
       coordonnées des points
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    abstract public void pointDistance();

    /**
     * Méthode abstraite permettant aux polygones de calculer son aire selon une formule donnée
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    abstract public void area();

    /**
     * Méthode abstraite permettant aux polygones de calculer son périmètre selon un calcul donné
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    abstract public void perimiter();

    /**
     * Méthode abstraite permettant aux polygones de vérifier leurs données et si elle sont respectives des
       caractéristiques du polygone à calculer
     * @author Nadeem Imam Samaali
     * @version v1.0
     */
    abstract public void verification();

}