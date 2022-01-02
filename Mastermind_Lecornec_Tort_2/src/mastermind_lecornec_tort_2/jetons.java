/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_lecornec_tort_2;

/**
 *
 * @author 33782
 */
public class jetons {
String Couleur;


public  jetons (int color) {
    if (color==1){
        Couleur="rouge";
    }
    if (color==2){
        Couleur="vert";
    }
    if (color==3){
        Couleur="orange";
    }
    if (color==4){
        Couleur="jaune";
    }
    if (color==5){
        Couleur="bleu";
    }
    if (color==6){
        Couleur="noir";
    }
    if (color==7){
        Couleur="blanc";
    }
    if (color==8){
        Couleur="rose";
    }
    //en fonction du chiffre tapé par le joueur on afecte une couleur au jeton joué
}
public String lireCouleur() {
    System.out.println("Le jeton est de la couleur "+ Couleur);
    return Couleur;//ca renvoie la couleur du jeton qu on veut
    
}

}
    

