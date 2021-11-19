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
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;

    public void Cellule() {
    jetonCourant=null;
    trouNoir=true;
    desintegrateur=true;
}
    public boolean affecterJeton(Jeton jeton1) {
        if (jetonCourant==null) {
            jetonCourant=jeton1;
            return true;
        }
        else {
                return false;
                }
        }
     
    public String recupererJeton() {
        //a faire + tard 
    }
    public boolean supprimerjeton (){
        if (jetonCourant==null) {
            return false;
        }
        else {
            return true;
        }
        }
    public boolean placerTrouNoir() {
        // chosir une case ou le trou noir va etre placé et le placer a cet endroit quoi qu il arrive , cette case prend une valeur "trounoir" 
        if (jetonCourant==null){   // on verifie si la case choisie est vide ou pas 
            return true;
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
        if (jetonCourant==trounoir){       
            return true;
        }
        else {
            return false; 
        }
    }
    public boolean presenceDesintegrateur() {
        if (jetonCourant==desintegrateur) {
            return true;
        }
        else {
            return false;
        }
        }
    public String lireCouleurDuJeton() {
        if (jetonCourant==null){
            return "vide";
        }
        else {
            return jetonCourant.Couleur;
                    }
        }
    public boolean recupererDesintegrateur() {
        if (jetonCourant==desintegrateur) {
            //supprimer le jeton de la cellule en question
            return true;
        }
        else {
            return false;
        }        
    }
    
    public boolean activerTrouNoir() {
        if (jetonCourant==trounoir) {
            // engloutir le jeton
            return true;
        }
        else {
            return false;
        }
        }

    void supprimerJeton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void supprimerJeton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    

    


