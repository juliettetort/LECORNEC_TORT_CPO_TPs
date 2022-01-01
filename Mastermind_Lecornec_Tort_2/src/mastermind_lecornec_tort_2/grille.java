/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mastermind_lecornec_tort_2;

/**
 *
 * @author 33782
 */
public class grille {
    Cellule[][] CellulesJeu = new Cellule [12] [4];
     
    public grille (){
     for (int i=0; i<12; i++){
        for (int j=0 ; j<4; j++){
            CellulesJeu[i][j] = new Cellule(); //on initialise notre grille de jeu
                
                           
        }
}
}   public void viderGrille(){
        for (int i=0; i<12; i++){
            if (CellulesJeu [0][i].Jetons != null){
                CellulesJeu [0][i].Jetons = null;//toutes les cases remplies deviennent nulles, en faisant varier les lignes
            }
        for (int j=0; j<4; j++){
            if (CellulesJeu [0][j].Jetons != null){
                CellulesJeu[0][i].Jetons = null;//idem, en faisant varier les colonnes
            }
           
            
            }
        }
     }
     public void afficherGrilleSurConsole (){//on presente la grille du mastermind pour que ce soit comprehensible pour le joueur
         for (int i=0; i<12; i++){
             for( int j=0; j<4; j++){
                 if ("rouge".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[R]");
                 }
                 else if("jaune".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[J]");
                     
                 }
                  else if("vert".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[V]");
                     
                 }
                  else if("orange".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[O]");
                     
                 }
                  else if("bleu".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[B]");
                     
                 }
                  else if("rose".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[R]");
                     
                 }
                  else if("noir".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[N]");
                     
                 }
                  else if("blanc".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[B]");
                     
                 }
               
             
                else  if ("vide".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                    System.out.print ( "[/]");                                         
                  }    //on regarde chaque cellule pour voir ce qu'elle contient et en fonction, on met l'initiale de sa contenance
             }
             System.out.println();
         }
     }
     
     public boolean etreGagnantePourJoueur (grille combiCachee, grille grilleJeu){
        
    //for (int i = 0; i<12; i++){//on fait varier les lignes
        //for (int j = 0; j<4; j++){//on fait varier les colonnes
        grilleJeu.comparer(combiCachee,grilleJeu);
      
        if (grilleJeu.resultat[0] == 4 ){
            System.out.println("Vous avez gagné !!!");
            return true;
        
            }
     //}
     //}
        return false;
     }
       public boolean ajouterJetonDansColonne(jetons JdansC, int colonne){//lorsque le joueur veut ajouter n jeton:
    for (int i=0; i<12; i++){
        
            if (CellulesJeu[i][colonne-1].Jetons == null){//on se met dans le cas ou il n'y a rien dans la cellule
            CellulesJeu[i][colonne-1].affecterJeton(JdansC);
            return true;//alors on peut tranquillement ajouter le jeton dans la cellule
                               
                }
    
        
        
            
        }
    return false;
    }
      
}
   





        
        
