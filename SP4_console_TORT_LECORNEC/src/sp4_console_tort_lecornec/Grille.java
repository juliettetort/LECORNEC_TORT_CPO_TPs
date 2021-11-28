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
    Cellule[][] CellulesJeu = new Cellule [6] [7];//on initialise notre tableau de SP4 avec 6 lignes et 7 colonnes
    
    
    public Grille(){
        
        for (int i=0; i<6; i++){
            for (int j=0 ; j<7; j++){
                 CellulesJeu[i][j] = new Cellule(); //on initialise notre grille de jeu
                
                           
        }       
        }
        }
   
    public boolean ajouterJetonDansColonne(Jeton JdansC, int colonne){//lorsque le joueur veut ajouter n jeton:
    for (int i=0; i<6; i++){
        
        
        if (CellulesJeu[i][colonne-1].presenceTrouNoir()==true){//on se met dans le cas ou il y a un trou noir
                CellulesJeu[i][colonne-1].activerTrouNoir();
                System.out.println("Vous avez été pris par un trou noir!");
                CellulesJeu[i][colonne-1].supprimerjeton();
                return true;//ici on a avalé le jeton
            }
        else if (CellulesJeu[i][colonne-1].jetonCourant == null){//on se met dans le cas ou il n'y a rien dans la cellule
            CellulesJeu[i][colonne-1].affecterJeton(JdansC);
            return true;//alors on peut tranquillement ajouter le jeton dans la cellule
                               
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
            
            
    
   
            
    //}
       // if (CellulesJeu[0][colonne].jetonCourant != null){
         //   return false;
        //}
//}  
    //return true;
//} 
  public boolean etreRempli(){ //si la grille du SP4 est completement remplie
    boolean pleine=true;     
    for (int i=0; i<6; i++){
        if (CellulesJeu[5][i]!=null){
            
            pleine= true;
        }
        else{
            pleine= false;
        } 
    }
    return pleine; //on renvoir vrai si le SP4 est completement rempli
    //sinon on renvoie faux et on continue de jouer
    
       
         
  }
     public void viderGrille(){
        for (int i=0; i<6; i++){
            if (CellulesJeu [0][i].jetonCourant!= null){
                CellulesJeu [0][i].jetonCourant = null;//toutes les cases remplies deviennent nulles, en faisant varier les lignes
            }
        for (int j=0; j<7; j++){
            if (CellulesJeu [0][j].jetonCourant != null){
                CellulesJeu[0][i].jetonCourant= null;//idem, en faisant varier les colonnes
            }
           
            
     }
     }
     }
     public void afficherGrilleSurConsole (){//on presente la grille du SP4 pour que ce soit comprehensible pour le joueur
         for (int i=0; i<6; i++){
             for( int j=0; j<7; j++){
                 if ("rouge".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[R]");
                 }
                 else if("jaune".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                     System.out.print( "[J]");
                     
                 }
                 else if (CellulesJeu[i][j].presenceTrouNoir()==true ) {    
                     System.out.print("[T]");
                 }
                                                  
                 else if (CellulesJeu[i][j].presenceDesintegrateur()==true){
                     System.out.print("[D]");
             }
                else if ("vide".equals(CellulesJeu[i][j].lireCouleurDuJeton())){
                    System.out.print ( "[/]");                                         
                  }    //on regarde chaqu cellule pour voir ce qu'elle contient et en fonction, on met l'initiale de sa contenance
             }
             System.out.println();
         
     }
     }
     public boolean celluleOccupee (int ligne , int colonne){
        return CellulesJeu[ligne][colonne].recupererJeton() != null;//on verifie si une cellule est occipee ou non, si sa contenance est differente de nulle
}
     public String lireCouleurDuJeton (int ligne , int colonne ){
      return CellulesJeu[ligne][colonne].lireCouleurDuJeton();//on renvoie la couleur du jeton qu'on étudie 
     }
     
     public boolean etreGagnantePourJoueur (Joueur joueur1){
          String couleur = joueur1.Couleur;//on regarde si un joueur a gagné
    int compteur = 0;
    for (int i = 0; i<6; i++){//on fait varier les lignes
        for (int j = 0; j<7; j++){//on fait varier les colonnes
            if (CellulesJeu[i][j].jetonCourant == null){
                compteur=0;
            }
            else if (!CellulesJeu[i][j].jetonCourant.Couleur.equals(couleur)){
                compteur=0;
            }else{
                compteur += 1;//pour chaque colonne (j) on verifie si 4 jetons de la meme couleur sont alignés 
            }
            if (compteur==4){
                return true;//si c est le cas alors on renvoie true, c est a dire qu un joueur a gagne
            }//si compteur n edst pas égal a 4, alors on passe a la ligne suivante, jusqu a la 6 eme ligne
        }
        compteur=0;//on réinitialise le compteur pour ne pas fausser le résultat
    } 
    compteur = 0;
    for (int j = 0; j<7; j++){//on fait la meme chose en faisant varier les colonnes
        for (int i = 0; i<6; i++){//on fait la meme chose en faisant varier les lignes 
            if (CellulesJeu[i][j].jetonCourant == null){
                compteur=0;
            }
            else if (!CellulesJeu[i][j].jetonCourant.Couleur.equals(couleur)){
                compteur=0;
            }else{
                compteur +=1;
            }
            if (compteur==4){//meme methode
                return true;
            }
        }
        compteur=0;
    }
    for (int i = 0; i<3; i++){//meme chose avec les diagonales "montantes", on fait varier les lignes
        for (int j = 0; j<4; j++){//on fait varier les colonnes
            if (CellulesJeu[i][j].jetonCourant != null && CellulesJeu[i+1][j+1].jetonCourant != null && CellulesJeu[i+2][j+2].jetonCourant != null && CellulesJeu[i+3][j+3].jetonCourant != null){
                if (CellulesJeu[i][j].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+1][j+1].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+2][j+2].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+3][j+3].jetonCourant.Couleur.equals(couleur)){
                    return true;//on renvoie true si il y a puissance 4
                }   
            }
        }
    }
    for (int i = 0; i<3; i++){//meme chose pour les diagonales "descendantes", on fait varier les lignes
        for (int j = 3; j<7; j++){//on fait varier les colonnes
            if (CellulesJeu[i][j].jetonCourant != null && CellulesJeu[i+1][j-1].jetonCourant != null && CellulesJeu[i+2][j-2].jetonCourant != null && CellulesJeu[i+3][j-3].jetonCourant != null){
                if (CellulesJeu[i][j].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+1][j-1].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+2][j-2].jetonCourant.Couleur.equals(couleur) && CellulesJeu[i+3][j-3].jetonCourant.Couleur.equals(couleur)){
                    return true;//on renvoie true si il y a puissance 4
            }
        }
    } 
}
return false;//ona . traité tous les cas de puissance 4 possible, si 4 jetons ne sont pas alignés d'une manière ou d'une autre, alors on retourne faux, on verra que cela permet au jeu de continuer
}
    public void tasserGrille (int colo){//losque un jeton est retiré, il faut que la ligne reprenne un bon format 
          for (int i=0;i<5;i++){//on fait varier le numéro de ligne pour verifier a tous les endroits 
        if(CellulesJeu[i][colo].jetonCourant==null){//si une case es vide 
           CellulesJeu[i][colo].jetonCourant=CellulesJeu[i+1][colo].jetonCourant;//alors la case mont d'un cran (car notre SP4 marche contre la gravité
           CellulesJeu[i+1][colo].jetonCourant=null;//le jeton remonté, la case initiale devient alors vide
        }
    }
}
    public boolean colonneRemplie (int colonne){//on verifie si une colone est remplie ou non
        
        if (CellulesJeu[5][colonne-1].jetonCourant!=null){ // regarde sur la premièe ligne si il y a un pion,// Si oui, retourne vrai sinon retourne faux
            return true;
        }
        else{
                return false;
                }
            
        
         
     
            
        }
    public boolean placerDesintegrateur (int i, int j ){//on verifie si il n'y a pas deja un desintegrateur là ou on veut le placer 
     if (CellulesJeu [i][j].presenceDesintegrateur()==false){
         CellulesJeu[i][j].placerDesintegrateur();//si c est bon alors on place le desintegrateur dans la cellule voulue
         return true;
     }
     return false; 
    }
    
    public boolean placerTrouNoir (int i, int j) {//pareil pour les trous noirs, on verifie que la cellule ou l on veut placer le trou noir n'en contient pas deja un
    if (CellulesJeu[i][j].presenceTrouNoir()==false){
        CellulesJeu[i][j].placerTrouNoir();
        CellulesJeu[i][j].trouNoir = true;
        return true;
    }
    return false;
        
    }
    
    
    public boolean supprimerJeton (int ligne, int colonne){ //on verifie que la case choisie contienne bien un jeton 
        if(CellulesJeu[ligne][colonne].recupererJeton()==null){
            CellulesJeu[ligne][colonne].supprimerjeton(); 
            
            return false;
        }
        else{
            CellulesJeu[ligne][colonne]=null;
            return true;
        }//si la cellule contient bien un jeton, alors elle le supprime
      
    }
    public Jeton recupererJeton (int ligne, int colonne){//pour recuperer un jeton,
          Jeton jetonrecup =  CellulesJeu[ligne][colonne].jetonCourant;//on initialise une variable de type jeton contenant le numero de ligne et de colonne de la cellule ou se trouve le jeton qu on veut recuperer
    CellulesJeu[ligne][colonne].supprimerjeton();//on le supprime alors 
    return jetonrecup;
}

       
    }

    






     
     
    
