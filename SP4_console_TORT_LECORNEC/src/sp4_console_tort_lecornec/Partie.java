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
            int nbColonne;
            Scanner sc = new Scanner(System.in);
            while ((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0])==false)&&(grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1] ==false))){
                System.out.println("Que voulez vous faire? ");
                System.out.println("1) Jouer un jeton ?");
                System.out.println("2) Récupérer un de vos jetons ?");
                System.out.println("3) Jouer un désintégrateur ?");
                System.out.println("Entrez le chiffre correspondant à l'action que vous voulez réaliser");
                int actionARealiser= sc.nextInt();
                while ((actionARealiser!=1)&&(actionARealiser!=2)&&(actionARealiser!=3)){
                    System.out.println("Veuillez rentrer un nombre compris entre 1 et 3");
                    actionARealiser=sc.nextInt();
                }
                if (actionARealiser==1){
                    if (joueurCourant.ListeJetons[20]==null) { //si la 21eme case de mes jetons est vide, ca veut dire que tous ceux d'avant ont été utilisés aussi
                        System.out.println("Partie terminée, vous n'avez plus aucun jeton");
                        break;
                    }
                    System.out.println("Dans quelle colonne souhaitez vous jouer ce jeton?");
                    Scanner sc2=new Scanner (System.in);
                    nbColonne=sc2.nextInt(); //a verifier
                    
                    boolean jetonJoue=grilleJeu.ajouterJetonDansColonne(joueurCourant, nbColonne);
                    while(jetonJoue==false) {
                        System.out.println("La colonne selectionnée est plein , choisissez-en une nouvelle");
                        nbColonne=sc.nextInt();
                        jetonJoue=grilleJeu.ajouterJetonDansColonne(joueurCourant, nbColonne);
                    }
                }
            }
        }
}
