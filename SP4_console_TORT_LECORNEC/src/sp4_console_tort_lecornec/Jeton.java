/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp4_console_tort_lecornec;

import java.util.Scanner;

/**
 *
 * @author guillaumelecornec
 */
public class Jeton {
String Couleur;
    Jeton[] ListeJetons;
    int nombreJetonsRestants;
    int nombreDesintegrateurs;
    int nombreJetonsRestant;
public  Jeton (String color) {
    Couleur=color;
}
public String lireCouleur() {
    System.out.println("Le jeton est de la couleur"+ Couleur);
    return Couleur;
    
}

}
