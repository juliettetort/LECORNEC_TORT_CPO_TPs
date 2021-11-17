/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_tort_lecornec;

/**
 *
 * @author 33782
 */
public class Grille {
    Cellule CellulesJeu [] [];
    
    public Grille(){
        CellulesJeu = new Cellule [6] [7];
        for (int i=0; i<6; i++){
            for (int j=0 ; j<7; i++){
                 CellulesJeu[i][j] = new Cellule(); 
                
               
            
        }       
        }
        }
     public boolean ajouterJetonDansColonne (Jeton JDansC, int colonne){
        Object jetonCourant = null;
         //ajt le jeton dans la colonne 
         if (jetonCourant ==null) {
             return true;
         }
         else {
             return false;
             
         }
         }
     
     public boolean etreRempli(){
           boolean pleine = true;
    for (int i=0; i<6; i++){
        if (CellulesJeu[0][i]!=null){
            pleine = true;
        }else{
            return false;
        }                    
    }
        return pleine;
         
     }
     public void viderGrille(){
        for (int i=0; i<6; i++){
            if (CellulesJeu [0][i]!= null){
                CellulesJeu [0][i] = null;
            }
        for (int j=0; j<7; j++){
            if (CellulesJeu [0][j] != null){
                CellulesJeu[0][i]= null;
            }
           
            
     }
     }
     }
     public void afficherGrilleSurConsole (){
         for (int i=0; i<6; i++){
             for( int j=0; j<7; j++){
                 if (CellulesJeu[i][j].jetonCourant.lireCouleurDuJeton()== "rouge"){
                     System.out.println( "[R]");
                 }
                 if(CellulesJeu[i][j].jetonCourant.lireCouleurDuJeton()== "Jaune"){
                     System.out.println ( "[J]");
                 }
                 if (CellulesJeu[i][j].jetonCourant.lireCouleurDuJeton()== "vide"){
                    System.out.println ( "[/]");
                         
                     }// à compléter TN
                 }
                 
             }
         
     }
     public boolean celluleOccupee (int ligne , int colonne){
         if (CellulesJeu [ligne][colonne] == null){
             return false;
         }
         else {
             return true;
             // a completer
         }
     }
     public String lireCouleurDuJeton (int ligne , int colonne ){
      return CellulesJeu[ligne][colonne].lireCouleurDuJeton();
     }
     
     public boolean etreGagnantePourJoueur (Joueur joueur1){
          String couleur = joueur1.Couleur;
    int compteur = 0;
    for (int i = 0; i<6; i++){
        for (int j = 0; j<7; j++){
            if (CellulesJeu[i][j].jetonCourant == null){
                compteur=0;
            }
            else if (!CellulesJeu[i][j].jetonCourant.Couleur.equals(couleur)){
                compteur=0;
            }else{
                compteur += 1;
            }
            if (compteur==4){
                return true;
            }
        }
        compteur=0;
    } 
    compteur = 0;
    for (int j = 0; j<7; j++){
        for (int i = 0; i<6; i++){
            if (CellulesJeu[i][j].jetonCourant == null){
                compteur=0;
            }
            else if (!CellulesJeu[i][j].jetonCourant.Couleur.equals(couleur)){
                compteur=0;
            }else{
                compteur +=1;
            }
            if (compteur==4){
                return true;
            }
        }
        compteur=0;
    }
    for (int i = 0; i<3; i++){
        for (int j = 0; j<4; j++){
            if (CellulesJeu[i][j].jetonCourant != null && CellulesJeu[i+1][j+1].jetonCourant != null && CellulesJeu[i+2][j+2].jetonCourant != null && CellulesJeu[i+3][j+3].jetonCourant != null){
                if (CellulesJeu[i][j].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+1][j+1].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+2][j+2].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+3][j+3].jetonCourant.Couleur.equals(couleur)){
                    return true;
                }   
            }
        }
    }
    for (int i = 0; i<3; i++){
        for (int j = 3; j<7; j++){
            if (CellulesJeu[i][j].jetonCourant != null && CellulesJeu[i+1][j-1].jetonCourant != null && CellulesJeu[i+2][j-2].jetonCourant != null && CellulesJeu[i+3][j-3].jetonCourant != null){
                if (CellulesJeu[i][j].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+1][j-1].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+2][j-2].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+3][j-3].jetonCourant.Couleur.equals(couleur)){
                    return true;
            }
        }
    } 
}
return false;
}
    public void tasserGrille (int jet){
          for (int i=0;i<5;i++){
        if(CellulesJeu[5-i][jet].jetonCourant==null){
           CellulesJeu[5-i][jet].jetonCourant=CellulesJeu[4-i][jet].jetonCourant;
           CellulesJeu[4-i][jet].jetonCourant=null;
        }
    }
}
    public boolean colonneRemplie (int colonne){
    
        return CellulesJeu[0][colonne]!=null; // regarde sur la premièe ligne si il y a un pion,
        // Si oui, retourne vrai sinon retourne faux
         
     
            
        }
    public 
}
    

     
     
    
