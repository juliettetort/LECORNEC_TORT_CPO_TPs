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
    Cellule[][] CellulesJeu = new Cellule [6] [7];
    
    
    public Grille(){
        
        for (int i=0; i<6; i++){
            for (int j=0 ; j<7; j++){
                 CellulesJeu[i][j] = new Cellule(); 
                
               
            
        }       
        }
        }
   public boolean ajouterJetonDansColonne(Jeton JdansC, int colonne){
    for (int i=0; i<6; i++){
        
        
        
        if (CellulesJeu[i][colonne-1].jetonCourant == null){
            CellulesJeu[i][colonne-1].affecterJeton(JdansC);
            return true;
                               
                }
    }
        
        return false;
            
            }
   
   
            //CellulesJeu[5-i][colonne].affecterJeton(jeton);
            //JdansC.nombreJetonsRestants+=-1;
            //if (CellulesJeu[5-i][colonne].presenceDesintegrateur()){
                //CellulesJeu[5-i][colonne].recupererDesintegrateur();
                //JdansC.nombreDesintegrateurs+=1;
                //System.out.println("Vous avez gagné un désintégrateur, vous en avez donc "+JdansC.nombreDesintegrateurs);
            //}
            
            //if (CellulesJeu[5-1][colonne].presenceTrouNoir()){
               // CellulesJeu[5-i][colonne].activerTrouNoir();
                //System.out.println("Vous avez été pris par un trou noir!");
            //}
            //return true;
            
    //}
       // if (CellulesJeu[0][colonne].jetonCourant != null){
         //   return false;
        //}
//}  
    //return true;
//} 
  public boolean etreRempli(){
           boolean pleine = true;
    for (int i=0; i<6; i++){
        if (CellulesJeu[5][i]!=null){
            
            return true;
        }
        else{
            return false;
        }                    
    }
        return pleine;
         
     }
     public void viderGrille(){
        for (int i=0; i<6; i++){
            if (CellulesJeu [0][i].jetonCourant!= null){
                CellulesJeu [0][i].jetonCourant = null;
            }
        for (int j=0; j<7; j++){
            if (CellulesJeu [0][j].jetonCourant != null){
                CellulesJeu[0][i].jetonCourant= null;
            }
           
            
     }
     }
     }
     public void afficherGrilleSurConsole (){
         for (int i=0; i<6; i++){
             for( int j=0; j<7; j++){
                 if ("rouge".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[R]");
                 }
                 else if("jaune".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[J]");
                 }
                 else if ("vide".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                    System.out.print ( "[/]");
                                          
                  }
                 else if (CellulesJeu[i][j].presenceTrouNoir()==true ) {    
                     System.out.print("[T]");
                 }
                 else if (CellulesJeu[i][j].presenceDesintegrateur()==true){
                     System.out.print("[D]");
             }
                 
             }
             System.out.println();
         
     }
     }
     public boolean celluleOccupee (int ligne , int colonne){
        return CellulesJeu[ligne][colonne].recupererJeton() != null;
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
        
        if (CellulesJeu[5][colonne-1].jetonCourant!=null){ // regarde sur la premièe ligne si il y a un pion,// Si oui, retourne vrai sinon retourne faux
            return true;
        }
        else{
                return false;
                }
            
        
         
     
            
        }
    public boolean placerDesintegrateur (int i, int j ){
     if (CellulesJeu [i][j].presenceDesintegrateur()==false){
         CellulesJeu[i][j].placerDesintegrateur();
         return true;
     }
     return false; 
    }
    
    public boolean placerTrouNoir (int i, int j) {
    if (CellulesJeu[i][j].presenceTrouNoir()==false){
        CellulesJeu[i][j].placerTrouNoir();
        return true;
    }
    return false;
        
    }
    
    
    public boolean supprimerJeton (int ligne, int colonne){
        if(CellulesJeu[ligne][colonne].recupererJeton()!=null){
            CellulesJeu[ligne][colonne].supprimerjeton();
            return true;
        }
        
      return false; 
    }
    public Jeton recupererJeton (int ligne, int colonne){
          Jeton jetonrecup =  CellulesJeu[ligne][colonne].jetonCourant;
    CellulesJeu[ligne][colonne].supprimerjeton();
    return jetonrecup;
}

       
    }

    






     
     
    
