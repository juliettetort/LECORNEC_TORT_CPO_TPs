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
            boolean b=false;
    for (int i=0;i<6;i++){
        if(colonneRemplie(colonne)==false){
            if (CellulesJeu[5-i][colonne].presenceDesintegrateur()==true){
                CellulesJeu[5-i][colonne].recupererDesintegrateur();
                JDansC.nombreDesintegrateurs+=1;
                CellulesJeu[5-i][colonne].affecterJeton(JDansC.ListeJetons[JDansC.nombreJetonsRestant-1]);
                return true;
            }
            else if (CellulesJeu[5-i][colonne].presenceTrouNoir()==true){
                CellulesJeu[5-i][colonne].activerTrouNoir();
                CellulesJeu[5-i][colonne].supprimerjeton();
                System.out.println("Votre jeton a été absorbé par le Trou Noir...");
                return true;
            }
            else if (CellulesJeu[5-i][colonne].jetonCourant==null){
                CellulesJeu[5-i][colonne].affecterJeton(JDansC.ListeJetons[JDansC.nombreJetonsRestants-1]);
                return true;
            }
            b= true;
        }else{
            b= false;            
        }
    }
    return b;
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
                 if ("rouge".equals(CellulesJeu[i][j].jetonCourant.lireCouleurDuJeton())){
                     System.out.print( "[R]");
                 }
                 if("Jaune".equals(CellulesJeu[i][j].jetonCourant.lireCouleurDuJeton())){
                     System.out.print( "[J]");
                 }
                 if ("vide".equals(CellulesJeu[i][j].jetonCourant.lireCouleurDuJeton())){
                    System.out.print ( "[/]");
                         
                     }// à compléter TN
                 }
                 System.out.println();
             }
         
     }
     public boolean celluleOccupee (int ligne , int colonne){
        if (CellulesJeu[ligne][colonne].recupererJeton()==null){
        return false;
    }else{
        return true;
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
    CellulesJeu[ligne][colonne].supprimerJeton();
    return jetonrecup;
}

       
    }

    






     
     
    
