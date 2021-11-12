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
    
    String joueurCourant;
    String grilleJeu;
    public void attribuerCouleursAuxJoueurs() {    
        // faire un tirage aleatoire entre 0 et 1 et le mettre dans la variable aleat
        if (aleat==0){
            joueur1=jaune;  //on attribue les couleurs aux 2 joueuyrs (utiliser
            joueur2=rouge;
            System.out.println ("Vous êtes le Joueur 1, et vous avez les les jetons jaunes");
                    }
        else  {
            joueur1=rouge;
            joueur2=jaune;
            System.out.println ("Vous êtes le Joueur 1, et vous avez les les jetons rouges");
    }
        
}

}
