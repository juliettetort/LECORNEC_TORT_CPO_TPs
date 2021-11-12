/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_tort_lecornec;

/**
 *
 * @author 33782
 */
public class Partie {
    
        //on fair un tirage aleatoire entre 0 et 1
        Joueur ListeJoueurs[] = new Joueur [2]; //on initialise le tableau
        String joueurCourant;
        String grilleJeu;
        public void attribuerCouleursAuxJoueurs() {
            if (couleuraleat==0){
                joueur1=jaune; //metre les bonnes variables
                joueur2=rouge; //on attribue les couleurs EN UTILISANT LES METHODES des autres class 
                System.out.println ("Vous êtes le Joueur 1, et vous avez les les jetons jaunes");
            }
            else  {
            joueur1=rouge;
            joueur2=jaune;
            System.out.println ("Vous êtes le Joueur 1, et vous avez les les jetons rouges");
    }
        
}
        public void initialiserPartie() {
            
        }
        public void debuterPartie() {
            // faire lancer la partie 
        }
}
