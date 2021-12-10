/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_lecornec_tort_2;

/**
 *
 * @author 33782
 */
class Cellule {
    jetons Jetons; 
    public String lireCouleurDuJeton() {
        if (Jetons ==null){
            return "vide";//renvoir vide si il n y a pas de jeton dans la case
        }
        else {
            return Jetons.Couleur;//renvoie la couleur du jeton si il y a bien un jeton dans la case 
                    }
        }
    
      public boolean affecterJeton(jetons jeton1) {
        if (Jetons ==null) {
            Jetons=jeton1;//le jeton1 va donc devenir celui qui va jouer pour un tour
            return true;
        }
        else {
                return false;
                }
        }
}
