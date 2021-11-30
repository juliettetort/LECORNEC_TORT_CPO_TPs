 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_tort_lecornec;

/**
 *
 * @author guillaumelecornec
 */
public class Cellule {
    Jeton jetonCourant;//ce jeton est celui utilisé lors du tour de jeu
    boolean trouNoir;
    boolean desintegrateur;

    public  Cellule() {//au depart il n'y a rien
    jetonCourant=null;
    trouNoir=false;
    desintegrateur=false;
}
    public boolean affecterJeton(Jeton jeton1) {
        if (jetonCourant==null) {
            jetonCourant=jeton1;//le jeton1 va donc devenir celui qui va jouer pour un tour
            return true;
        }
        else {
                return false;
                }
        }
     
    public Jeton recupererJeton() {
        return jetonCourant;//lorsqu on recupere un jeton, ca retourne le jeton en question
    }
    public boolean supprimerjeton (){
        if (jetonCourant != null){
              jetonCourant=null;//lorsque il y a bien un jeton sur la case cholsie ca le supprime
               return true;//retourne true si la suppressions est bien deroulee
        }
        else {
            return false;
        } 
        }
    public boolean placerTrouNoir() {
        // chosir une case ou le trou noir va etre placé et le placer a cet endroit quoi qu il arrive , cette case prend une valeur "trounoir" 
        if (jetonCourant==null){   // on verifie si la case choisie est vide ou pas 
            
            return true;//retpurne true si le placage du trou noir s est bien passe 
        }
        else {
            return false;
        
        }
        }
        
    public boolean placerDesintegrateur() {
        // chosir une case ou le desintegrateur va etre placé et le placer a cet endroit quoi qu il arrive , cette case prend une valeur "desintegrateur"
        if (jetonCourant==null) {
            return true;
        }
        else {
            return false;
        }
        }
    public boolean presenceTrouNoir() {
        if (trouNoir==true){       
            return true;//si il y a un trou noir dans la cellule selectionne ca renvoie vrai
        }
        else {
            return false; 
        }
    }
    public boolean presenceDesintegrateur() {
        if (desintegrateur==true) {
            return true;//si il y a un desintegrateur dans la cellule selectionnee ca renvoie vrai
        }
        else {
            return false;
        }
        }
    public String lireCouleurDuJeton() {
        if (jetonCourant==null){
            return "vide";//renvoir vide si il n y a pas de jeton dans la case
        }
        else {
            return jetonCourant.Couleur;//renvoie la couleur du jeton si il y a bien un jeton dans la case 
                    }
        }
    public boolean recupererDesintegrateur() {
        if (desintegrateur==true) {
            //supprimer le jeton de la cellule en question
            return true;//si il y a un desintegrateur sur la case en question renvoie vrai
        }
        else {
            return false;
        }        
    }
    
    public boolean activerTrouNoir() {
        if (trouNoir==true) {
            jetonCourant=null;//avale le jeton qui s est mis dans le trou noir
            trouNoir=false;//retire le trou npoir si il y en avait un dans la case 
            
            
            return true;//renvoie vrai si le trou noir a bien avalé le jeton
        }
        else {
            return false;
        }
        }


    }
    

    


