package tp2_bieres_lecornec_tort;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class BouteilleBiere {
String Nom;
int degreAlcool;
String brasserie;
boolean ouverte;

 

    
    boolean Décapsuler() {
        if (ouverte==false) {
            ouverte=true;
            return true;
    }
        else {
            System.out.println("Erreur: bière déjà ouverte");
            return false;
        }
}    
    

public void lireEtiquette() {
System.out.println("Bouteille de " + Nom +" (" + degreAlcool + " degres) \nBrasserie : " + brasserie ) ; 
}


public BouteilleBiere(String unNom, double unDegre, String uneBrasserie){
    Nom= unNom;
    degreAlcool=(int) unDegre;
    brasserie=uneBrasserie;
    ouverte=false;



}
@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = Nom + " (" + degreAlcool + " degrés)ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}


}
