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
    public void attribuerCouleursAuxJoueurs() {
        //on fair un tirage aleatoire entre 0 et 1
        String joueur1;
        String joueur2;
        String jaune;
        String rouge;
        if (couleuraleat==0){
            joueur1=jaune;
            joueur2=rouge;
            System.out.println ("Vous êtes le Joueur 1, et vous avez les les jetons jaunes");
                    }
        else if (couleuraleat==1) {
            joueur1=rouge;
            joueur2=jaune;
            System.out.println ("Vous êtes le Joueur 1, et vous avez les les jetons rouges");
    }
}

}
