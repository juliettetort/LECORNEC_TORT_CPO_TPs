/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_tort_lecornec;

/**
 *
 * @autho 33782 
 */
public class Voiture {
     //Attributs:
    String Modèle;
    String Marque;
    int PuissanceCV;
    Personne proprietaire;
    Object proprietaire;

    public Voiture (String leModele, String laMarque, int laPuissance, Personne P){
        Modèle = leModele;
        Marque = laMarque;
        PuissanceCV = laPuissance;
        proprietaire = P;
    }

    Voiture(String clio, String renault, int i, Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return Modèle+" de la marque "+Marque+" de puissance "+PuissanceCV;
    }
}
