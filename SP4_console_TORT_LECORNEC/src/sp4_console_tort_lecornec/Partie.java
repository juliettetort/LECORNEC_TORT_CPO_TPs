/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_tort_lecornec;

/**
 *
 * @author 33782
 */

import java.util.Random;
import java.util.Scanner;
        
public class Partie {
    
        //on fair un tirage aleatoire entre 0 et 1
        Joueur ListeJoueurs[] = new Joueur [2]; //on initialise le tableau
        Joueur joueurCourant;
        Grille grilleJeu = new Grille();
        int couleuraleat;
        int premierJoueur;
        

        public void attribuerCouleursAuxJoueurs() {
            couleuraleat = (int)(Math.random() * 1);
            if (couleuraleat==0){
                ListeJoueurs[0].affecterCouleur("jaune"); //metre les bonnes variables
                ListeJoueurs[1].affecterCouleur("rouge"); //on attribue les couleurs EN UTILISANT LES METHODES des autres class 
            }
            else  {
                ListeJoueurs[1].affecterCouleur("jaune"); 
                ListeJoueurs[0].affecterCouleur("rouge");
    }
        
}
        public void initialiserPartie() {
            grilleJeu.viderGrille();  // a faire dans la lcasse grille
            
            Scanner sc = new Scanner (System.in);
            System.out.println("Pseudo du Joueur1: ");
            Joueur Joueur1 = new Joueur(sc.nextLine());
            System.out.println("Pseudo du Joueur2: ");
            Joueur Joueur2 = new Joueur(sc.nextLine());
            ListeJoueurs[0]=Joueur1;
            ListeJoueurs[1]=Joueur2;
            attribuerCouleursAuxJoueurs();
            System.out.println(Joueur1.Nom+"joue avec les jetons"+Joueur1.Couleur+"s");
            System.out.println(Joueur2.Nom+"joue avec les jetons"+Joueur2.Couleur+"s");  //on a donc les joueurs avec leur pseudo et leur couleur de jetons
            
            for(int i=0; i<21;i++) {
                Jeton Jeton1 = new Jeton(Joueur1.Couleur);
                Jeton Jeton2 = new Jeton(Joueur2.Couleur);
                Joueur1.ajouterJeton(Jeton1);
                Joueur2.ajouterJeton(Jeton2);
            }
            premierJoueur= (int)(Math.random() * 1);
            if (premierJoueur==0){
                joueurCourant=ListeJoueurs[0];
            }
            else {
              joueurCourant=ListeJoueurs[1];
            }
            //placer les trous noirs et les teleporteurs plus tard
            }
        
        
        
        public void debuterPartie() {
            // faire lancer la partie 
            initialiserPartie();
            while ((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])!=true)&&(grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1] !=true))){
                System.out.println("Veuillez chosiir une actiobn parmis celles ci: ");
                System.out.println("")
            }
        }
}
