/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_tort_lecornec;

/**
 *
 * @author 33782
 */
public class Joueur {
    String Nom;
    String Couleur; 
    Jeton ListeJetons [] = new Jeton [21];//décrivant les jetons encore en possession du joueur
    int nombreDesintegrateurs;
    int nombreJetonsRestants;
    public Joueur (String nomJ){
    Nom = nomJ ;
    }
    public void affecterCouleur(String Colorj){ 
        Couleur = Colorj;
    }
    public boolean ajouterJeton (Jeton J ){
        int i=0;
        while (ListeJetons [i]!=null){
            i+=1;
            if (i==20){
                boolean reponse= false;
            }
     
        }
        ListeJetons [i]=J;
        boolean reponse = true;
        return reponse;
        
        
    
    
}    
public void obtenirDesintegrateur(){
    
    // A FAIRE PLUS TARD 
    
}
public boolean utiliserDesintegrateur(){
    
        // A FAIRE PLUS TARD 
    
}
}