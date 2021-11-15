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
         if (jetonCourant==null) {
             return true;
         }
         else {
             return false;
         }
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
                 if (CellulesJeu[i][j].jetonCourant == null){
                   CellulesJeu[i][j].jetonCourant.lireCouleur();
                 if (CellulesJeu[i][j].jetonCourant.Couleur =="rouge"){
                     System.out.println ("[R]");
                    
                         
                     }
                 }
                 
             }
         }
         
     }
     
     }
    
