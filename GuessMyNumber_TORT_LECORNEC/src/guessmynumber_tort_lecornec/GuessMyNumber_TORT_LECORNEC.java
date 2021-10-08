/*
 * Guessmynumber
 */
package guessmynumber_tort_lecornec;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 33782
 */
public class GuessMyNumber_TORT_LECORNEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int nbraleatoire = generateurAleat.nextInt(100);     
         System.out.println(nbraleatoire);
        int nbrsaisi=0;
        int compteur=0;
        System.out.println("quel niveau de difficulté voulez vous? Facile (1), normal (2), ou difficile (3)?");
        Scanner sc;
        int diff;
        sc=new Scanner(System.in);
        diff=(int)sc.nextInt();
        if (diff==1)
             compteur=0;
        if (diff==2)
            compteur=7;
        if (diff==3)
            compteur=12;
        
        
        
        
        while (nbrsaisi!=nbraleatoire) {
            System.out.println("Saississez une valeur entre 0 et 100");
            Scanner sc1;
            sc1=new Scanner(System.in);
            nbrsaisi=(int) sc1.nextInt();
            if (nbrsaisi< nbraleatoire){
                System.out.println("trop petit");
                compteur=compteur+1;
            }
            
            
            if (nbrsaisi>nbraleatoire){
                System.out.println("trop grand");
                compteur=compteur+1;
            }
            
        }
        if (compteur<10) {
            System.out.println("Gagné");
            System.out.println(compteur+1);
        }
        if (compteur>9) {
            System.out.println("Perdu");
            System.out.println(compteur+1);    
       
    }
    }
}
