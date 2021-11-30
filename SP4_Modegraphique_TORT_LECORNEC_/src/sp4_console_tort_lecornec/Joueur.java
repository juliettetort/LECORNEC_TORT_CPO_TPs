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
    int nombreDesintegrateurs=3;
    int nombreJetonsRestants;
    public Joueur (String nomJ){
    Nom = nomJ ;
    }
    public void affecterCouleur(String Colorj){ 
        Couleur = Colorj;//on affecte une couleur (de jetons) au joueur
    }
    public boolean ajouterJeton (Jeton J ){
        int i=0;
        while (ListeJetons [i]!=null){
            i+=1;//on ajoute les jetons du joueur dans le tableau de jetons du joueur
            if (i==20){
                boolean reponse= false;//si le tableau de jetons est plein on retourne faux
            }
     
        }
        ListeJetons [i]=J;//on met dans le tableau de jetons du joueur la caracteristique de son jeton
        nombreJetonsRestants++;//on augmente alors de 1 son nombre de jetons 
        boolean reponse = true;//on renvoie alors vrai, tout s est bien passé 
        return reponse;
        
        
    
    
}    
public void obtenirDesintegrateur(){
    nombreDesintegrateurs=nombreDesintegrateurs+1;//on augmente de 1 le nombre de desintegrateurs 
 
    
}
public boolean utiliserDesintegrateur(){
    nombreDesintegrateurs=nombreDesintegrateurs-1;
        return nombreDesintegrateurs != -1; // on a deja enlevé 1 au nbr de desintegrateurs, on verifie qu il n y en avait pas 0 lors de la manip
      
}
}