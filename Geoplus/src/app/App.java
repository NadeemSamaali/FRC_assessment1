/**
 * Classe Main dans laquelle les coordonnées des points sont lues pour retourner la valeur de l'aire
   ou du périmètre d'un polygone.

 * @author Nadeem Imam Samaali
 * @version v1.0
*/

//IMPORTS NÉCESSAIRES AU FONTIONNEMENT DU APP.JAVA
package app;
import app.regularpolygon.*;
import app.anypolygon.*;
import java.util.Scanner;

public class App {

    //DÉCLARATION DES VARIABLES DE RÉPONSES
    static String answer1 = "";
    static String answer2 = "";

    public static void resetAnswers() {
        answer1 = "";
        answer2 = "";
    }

    public static void main(String[] args) {
        // CREATION DES POLYGONES
        Shape[] someShape = new Shape[5];

        someShape[0] = new Square();
        someShape[1] = new Rectangle();
        someShape[2] = new RightTriangle();
        someShape[3] = new AnyQuadrilateral();
        someShape[4] = new AnyTriangle();

        // CÉATION D'UN SCANNER DE CLAVIER
        Scanner scanner = new Scanner(System.in);

        // MESSAGE D'OUVERTURE
        System.out.println("Overture de Geoplus...");
        System.out.println("");
        System.out.println("GEOPLUS");
        System.out.println("Version v1.0");
        System.out.println("");
        System.out.println("Travail pratique remis le cadre du cours FRC");
        System.out.println("Développé par Nadeem Imam SAMAALI");
        System.out.println("");
        System.out.println("Pour connaître toutes les commandes, faites #help");
        System.out.println("");
        System.out.println("Saisissez le nom du polygone à analyser: ");

        // DÉCLARATION DE X, PEREMTTANT DE À LA BOUCLE "do" DE CONNAÎTRE SES LIMITES
        int x = 1;

        // DÉBUT DES BOUCLES CONCERNANT LES COMMANDES ET LES CALCULS DES POLYGONES
        // DONNÉS

        // PERMETTRE À LA BOUCLE "try" DE SE RÉEXÉCUTER, MÊME EN CAS D'EURREUR
        do
        {

            // EXÉCUTER LE PROGRAMME TANT QU'IL N'Y A PAS D'ERREURS
            try 
            {

                // MISE EN FONCTION DU "label"
                label:

                // EXÉCUTER LES COMMANDES DANS LE WHILE INDÉFINIMENT
                while (true) 
                {

                    // DÉCLARATION DE LA VARIABLE COMMANDE + PARAMÈTRES DU SCANNER
                    String command;
                    command = scanner.nextLine();

                    // CRÉATION DU MAIN SWITCH - SAISIE DES COMMANDES
                    switch (command) 
                    {
                        // IF(COMMAND == "#HELP")
                        case "#help":
                        System.out.println("");
                        System.out.println("Voici les commandes utilisables:");
                        System.out.println("");
                        System.out.println("Fonctions:");
                        System.out.println("#help                   - permet de connaître les commades existantes");
                        System.out.println("#exit                   - permet de quitter la session");
                        System.out.println("");
                        System.out.println("Noms de polygone:");
                        System.out.println("#square                 - CARRÉ");
                        System.out.println("#rectangle              - RECTANGLE");
                        System.out.println("#right_triangle         - TRIANGLE RECTANGLE");
                        System.out.println("#any_quadrilateral      - QUADRILATÈRE QUELCONQUE");
                        System.out.println("#any_triangle           - TRIANGLE QUELCONQUE");
                        System.out.println("");
                        break;

                        // IF(COMMAND == "#SQUARE")
                        case "#square":

                        // CRÉATION DES POINTS A PARTIR DE LA CLASSE SQUARE
                        someShape[0].createPoint();

                        System.out.println("Insérer les coordonnées du CARRÉ:");
                        System.out.println("");

                        // COMPTEUR SELON LE NOMBRE DE POINT REQUIS
                        for (int i = 0; i < 4; i++) 
                            {
                                switch (i) 
                                {
                                    // IF(I == 0)
                                    case 0:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("Point A:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE SQUARE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[0].point[i].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE SQUARE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[0].point[i].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;
                                    
                                    // IF(I == 1)
                                    case 1:
                                        //MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point B:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE SQUARE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[0].point[i].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE SQUARE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[0].point[i].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    // IF(I == 2)
                                    case 2:
                                        //MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point C:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE SQUARE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[0].point[i].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE SQUARE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[0].point[i].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    // IF(I == 3)
                                    case 3:
                                        //MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point D:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE SQUARE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[0].point[i].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE SQUARE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[0].point[i].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                }
                                
                                
                            }

                            //CALCUL DE LA DISTANCE DANS LA CLASSE SQUARE
                            someShape[0].pointDistance();
                            System.out.println("");
                            //VÉRIFICATION DES DISTANCES POUR APPROUVÉ L'IDENTITÉ DE LA FORME À CALCULER
                            someShape[0].verification();
                            //S'IL N'Y A PAS D'ERREURS...
                            if (someShape[0].error == false)
                            {
                                //CALCULER + IMPRIMER L'AIRE DU CARRÉ A PARTIR DE LA CLASSE SQUARE
                                someShape[0].area();
                                //CALCULER + IMPRIMER LE PÉRIMÈTRE DU CARRÉ A PARTIR DE LA CLASSE SQUARE
                                someShape[0].perimiter();
                            }
                            
                            

                        break;
                        
                        // IF(COMMAND == "#RECTANGLE")
                        case "#rectangle":
                            
                            // CRÉATION DES POINTS A PARTIR DE LA CLASSE RECTANGLE
                            someShape[1].createPoint();

                            System.out.println("Insérer les coordonnées du RECTANGLE:");
                            System.out.println("");
                            
                            // COMPTEUR SELON LE NOMBRE DE POINT REQUIS
                            for(int j = 0; j < 4; j++)
                            {
                               switch(j)
                                {
                                    //IF(J == 0)
                                    case 0:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("Point A:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE RECTANGLE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[1].point[j].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE RECTANGLE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[1].point[j].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    //IF (J == 1)
                                    case 1:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point B:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE RECTANGLE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[1].point[j].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE RECTANGLE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[1].point[j].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    //IF (J == 2)
                                    case 2:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point C:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE RECTANGLE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[1].point[j].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE RECTANGLE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[1].point[j].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    //IF (J == 3)
                                    case 3:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point D:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE RECTANGLE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[1].point[j].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE RECTANGLE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[1].point[j].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;
                                }
                            }

                            //CALCUL DE LA DISTANCE DANS LA CLASSE RECTANGLE
                            someShape[1].pointDistance();
                            System.out.println("");
                            //VÉRIFICATION DES DISTANCES POUR APPROUVÉ L'IDENTITÉ DE LA FORME À CALCULER
                            someShape[1].verification();
                            //S'IL N'Y A PAS D'ERREURS...
                            if (someShape[1].error == false)
                            {
                                //CALCULER + IMPRIMER L'AIRE DU RECTANGLE A PARTIR DE LA CLASSE RECTANGLE
                                someShape[1].area();
                                //CALCULER + IMPRIMER LE PÉRIMÈTRE DU RECTANGLE A PARTIR DE LA CLASSE RECTANGLE
                                someShape[1].perimiter();
                            }
                            
                        break;
                        
                        // IF(COMMAND == "#RECTANGLE")
                        case "#right_triangle":
                            // CRÉATION DES POINTS A PARTIR DE LA CLASSE RIGHTTRIANGLE
                            someShape[2].createPoint();

                            System.out.println("Insérer les coordonnées du TRIANGLE RECTANGLE:");
                            System.out.println("");

                            // COMPTEUR SELON LE NOMBRE DE POINT REQUIS
                            for(int k = 0; k < 3; k++)
                            {
                               switch(k)
                                {
                                    //IF (K == 0)
                                    case 0:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point A:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE RIGHTTRIANGLE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[2].point[k].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE RIGHTTRIANGLE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[2].point[k].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    //IF (K == 1)
                                    case 1:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point B:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE RIGHTTRIANGLE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[2].point[k].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE RIGHTTRIANGLE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[2].point[k].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    //IF (K == 2)
                                    case 2:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point C:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE RIGHTTRIANGLE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[2].point[k].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE RIGHTTRIANGLE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[2].point[k].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;
                                }

                            }

                            //CALCUL DE LA DISTANCE DANS LA CLASSE RIGHTTRIANGLE
                            someShape[2].pointDistance();
                            System.out.println("");
                            //VÉRIFICATION DES DISTANCES POUR APPROUVÉ L'IDENTITÉ DE LA FORME À CALCULER
                            someShape[2].verification();
                            //S'IL N'Y A PAS D'ERREURS...
                            if(someShape[2].error == false)
                            {
                                //CALCULER + IMPRIMER L'AIRE DU TRIANGLE RECTANGLE A PARTIR DE LA CLASSE RIGHTTRIANGLE
                                someShape[2].perimiter();
                                //CALCULER + IMPRIMER LE PÉRIMÈTRE DU TRIANGLE RECTANGLE A PARTIR DE LA CLASSE RIGHTTRIANGLE
                                someShape[2].area();
                            }

                        break;
                        
                        // IF(COMMAND == "#ANY_QUADRILATERAL")
                        case "#any_quadrilateral":
                            // CRÉATION DES POINTS A PARTIR DE LA CLASSE ANY_QUADRILATERAL
                            someShape[3].createPoint();
                            System.out.println("Insérer les coordonnées du QUADRILATÈRE QUELCONQUE:");
                            System.out.println("");
                            
                            // COMPTEUR SELON LE NOMBRE DE POINT REQUIS
                            for(int l = 0; l < 4; l++)
                            {
                                switch(l)
                                {
                                    //IF (L == 0)
                                    case 0:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("Point A:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE ANYQUADRILATERAL
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[3].point[l].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE ANYQUADRILATERAL
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[3].point[l].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    //IF (L == 1)
                                    case 1:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point B:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE ANYQUADRILATERAL
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[3].point[l].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE ANYQUADRILATERAL
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[3].point[l].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    //IF (L == 2)
                                    case 2:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point C:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE ANYQUADRILATERAL
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[3].point[l].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE ANYQUADRILATERAL
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[3].point[l].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    //IF (L == 3)
                                    case 3:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point D:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE ANYQUADRILATERAL
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[3].point[l].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE ANYQUADRILATERAL
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[3].point[l].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;
                                }
                            }
                            //CALCUL DE LA DISTANCE DANS LA CLASSE ANYQUADRILATERAL
                            someShape[3].pointDistance();
                            System.out.println("");
                            //VÉRIFICATION DES DISTANCES POUR APPROUVÉ L'IDENTITÉ DE LA FORME À CALCULER
                            someShape[3].verification();
                            //S'IL N'Y A PAS D'ERREURS...
                            if(someShape[3].error == false)
                            {
                                //CALCULER + IMPRIMER LE PERIMETRE DU QUADRILATERE QUELCONQUE A PARTIR DE LA CLASSE ANYQUADRILATERAL
                                someShape[3].perimiter();
                            }
                            
                        break;

                        // IF(COMMAND == "#ANY_TRIANGLE")
                        case "#any_triangle":
                            // CRÉATION DES POINTS A PARTIR DE LA CLASSE ANYTRIANGLE
                            someShape[4].createPoint();

                            System.out.println("Insérer les coordonnées du TRIANGLE QUELCONQUE:");
                            System.out.println("");

                            // COMPTEUR SELON LE NOMBRE DE POINT REQUIS
                            for(int m = 0; m < 3; m++)
                            {
                               switch(m)
                                {
                                    case 0:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point A:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE ANYTRIANGLE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[4].point[m].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE ANYTRIANGLE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[4].point[m].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    case 1:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point B:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE ANYTRIANGLE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[4].point[m].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE ANYTRIANGLE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[4].point[m].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;

                                    case 2:
                                        // MISE À ZERO DES VARIABLES STRINGS
                                        resetAnswers();
                                        System.out.println("");
                                        System.out.println("Point C:");
                                        //INSERTION DE LA COORDONNÉ X + RENVOIE VERS LA CLASSE ANYTRIANGLE
                                        System.out.print("X: " + answer1);
                                        answer1 = scanner.nextLine();
                                        someShape[4].point[m].setX(Double.parseDouble(answer1));
                                        //INSERTION DE LA COORDONNÉ Y + RENVOIE VERS LA CLASSE ANYTRIANGLE
                                        System.out.print("Y: " + answer2);
                                        answer2 = scanner.nextLine();
                                        someShape[4].point[m].setY(Double.parseDouble(answer2));
                                        //IMPRÉSSION DE LA COORDONNÉE CRÉÉE
                                        System.out.println("(" + answer1 + "," + answer2 + ")");
                                    break;
                                }

                            }
                            //CALCUL DE LA DISTANCE DANS LA CLASSE ANYTRIANGLE
                            someShape[4].pointDistance();
                            System.out.println("");
                            //VÉRIFICATION DES DISTANCES POUR APPROUVÉ L'IDENTITÉ DE LA FORME À CALCULER
                            someShape[4].verification();
                            //S'IL N'Y A PAS D'ERREURS...
                            if(someShape[4].error == false)
                            {
                                //CALCULER + IMPRIMER LE PERMIETRE DU TRIANGLE QUELCONQUE A PARTIR DE LA CLASSE ANYTRIANGLE
                                someShape[4].perimiter();
                                //CALCULER + IMPRIMER L'AIRE DU TRIANGLE QUELCONQUE A PARTIR DE LA CLASSE ANYTRIANGLE
                                someShape[4].area();
                            }
                        break;

                        // IF(COMMAND == "#ANY_TRIANGLE")
                        case "#exit":
                            System.out.println("Merci d'avoir utilisé GEOPLUS. À la prochaine!");
                        break label; //FERMETURE DE LA BOUCLE WHILE
                        
                        case "":
                        break;

                        default: //AFFICHER UN MESSAGE D'ERREUR SI UNE COMMANDE INEXISTANTE A ÉTÉ INSÉRÉE
                            System.out.println("");
                            System.out.println("ERREUR : Commande inexistante! Faite #help pour connaître toutes les commandes exécutables.");
                        break;
                    }
                 
                }
                
                
                x = 2; //REDÉFINITION DE LA VARIABLE x
            }

            //S'IL Y A UNE ERREUR, AFFICHER LE MESSAGE CI-DESSOUS
            catch(Exception e)
            {  
                System.out.println("");
                System.out.println("ERREUR : Coordonnée illégale! Revérifiez vos données et reéssayez...");
                System.out.println("");
                scanner.close();
            }
        
        }while(x == 1); //CONTINUER LA BOUCLE DO TANT QUE LA VARIABLE x NE SOIT PAS CHANGÉE
    }
}