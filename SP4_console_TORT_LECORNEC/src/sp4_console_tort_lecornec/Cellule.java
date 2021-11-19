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
     
    public Jeton recupererJeton() {
        return jetonCourant;
    }
    public boolean supprimerjeton (){
        if (jetonCourant != null){
              jetonCourant=null;
               return true;
        }
        else {
            return false;
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
        if (trouNoir==true){       
            return true;
        }
        else {
            return false; 
        }
    }
    public boolean presenceDesintegrateur() {
        if (desintegrateur==true) {
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
        if (desintegrateur==true) {
            //supprimer le jeton de la cellule en question
            return true;
        }
        else {
            return false;
        }        
    }
    
    public boolean activerTrouNoir() {
        if (trouNoir==true) {
            // engloutir le jeton
            jetonCourant=null;
            trouNoir=false;
            
            
            return true;
        }
        else {
            return false;
        }
        }


    }
    

    


