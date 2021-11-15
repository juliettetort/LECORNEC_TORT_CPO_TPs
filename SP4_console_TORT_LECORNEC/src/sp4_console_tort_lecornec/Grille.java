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
         //ajt le jeton dans la colonne 
         if (jetonCourant ==null) {
             return true;
         }
         else {
             return false;
         }// a faire !!
         }
     
     public boolean etreRempli(){
           boolean pleine = true;
    for (int i=0; i<7; i++){
        if (CellulesJeu[0][i]!=null){
            pleine = true;
        }else{
            return false;
        }                    
    }
        return pleine;
         
     }
     public void viderGrille(){
        for (int i=0; i<7; i++){
            if (CellulesJeu [0][i]!= null){
                CellulesJeu [0][i] = null;
            }
        for (int j=0; j<6; j++){
            if (CellulesJeu [0][j] != null){
                CellulesJeu[0][i]= null;
            }
           
            
     }
     }
     }
     public void afficherGrilleSurConsole (){
         for (int i=0; i<7; i++){
             for( int j=0; j<6; j++){
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
     public boolean Occupee (int ligne , int colonne){
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
         for (int i=0; i<7; i++){
             for (int j=0; j<6; j++){
                 
             }
             
         }
         
     }
}
     
     
    
