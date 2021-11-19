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
    int nombreJetonsRestant;
public  Jeton (String color) {
    Couleur=color;
}
public void lireCouleur() {
    System.out.println("Le jeton est de la coueur"+ Couleur);
}

    String lireCouleurDuJeton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
