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
    

public  jetons (String color) {
    Couleur=color;//la couleur du jeton est sa caractéristique 
}
public String lireCouleur() {
    System.out.println("Le jeton est de la couleur "+ Couleur);
    return Couleur;//ca renvoie la couleur du jeton qu on veut
    
}

}
    

