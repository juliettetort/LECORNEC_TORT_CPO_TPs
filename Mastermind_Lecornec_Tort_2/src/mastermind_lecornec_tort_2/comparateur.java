/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mastermind_lecornec_tort_2;

/**
 *
 * @author guillaumelecornec
 */
public class comparateur {
    int bienPlace=0;
    int memeCouleur=0;
    
    public int [] nombreCouleurCachee(){
        //for (int i=0; i<7; i++){
        int nbrRougeCache=0;
        int nbrVertCache=0;
        int nbrOrangeCache=0;
        int nbrJauneCache=0;
        int nbrBleuCache=0;
        int nbrNoirCache=0;
        int nbrBlancCache=0;
        int nbrRoseCache=0;
        int [] tabCouleurCache=new int [7];
            for (int j=0; j<4; j++){
            if (combiCachee[0][j]=="rouge"){
                nbrRougeCache=nbrRougeCache+1;}
            if (combiCachee[0][j]=="vert"){
                nbrVertCache=nbrVertCache+1;}
            if (combiCachee[0][j]=="orange"){
                nbrOrangeCache=nbrOrangeCache+1;}
            if (combiCachee[0][j]=="jaune"){
                nbrJauneCache=nbrJauneCache+1;}
            if (combiCachee[0][j]=="bleu"){
                nbrBleuCache=nbrBleuCache+1;}
            if (combiCachee[0][j]=="noir"){
                nbrNoirCache=nbrNoirCache+1;}
            if (combiCachee[0][j]=="blanc"){
                nbrBlancCache=nbrBlancCache+1;}
            if (combiCachee[0][j]=="rose"){
                nbrRoseCache=nbrRoseCache+1;} 
            }
            tabCouleurCache[0]=nbrRougeCache;
            tabCouleurCache[1]=nbrVertCache;
            tabCouleurCache[2]=nbrOrangeCache;
            tabCouleurCache[3]=nbrJauneCache;
            tabCouleurCache[4]=nbrBleuCache;
            tabCouleurCache[5]=nbrNoirCache;
            tabCouleurCache[6]=nbrBlancCache;
            tabCouleurCache[7]=nbrRoseCache;
            return tabCouleurCache;
            
    }
        public int nombreCouleurJoueur(int ligne){ 
            
        int nbrRougeJoueur=0;
        int nbrVertJoueur=0;
        int nbrOrangeJoueur=0;
        int nbrJauneJoueur=0;
        int nbrBleuJoueur=0;
        int nbrNoirJoueur=0;
        int nbrBlancJoueur=0;
        int nbrRoseJoueur=0;   
        int [] tabCouleurJoueur=new int [7];
          for (int g=0; g<4; g++){             
            if (grille[ligne][g]=="rouge"){
                nbrRougeJoueur=nbrRougeJoueur+1;
            }
            if (grille[ligne][g]=="vert"){
                nbrVertJoueur=nbrVertJoueur+1;
            }
            if (grille[ligne][g]=="orange"){
                nbrOrangeJoueur=nbrOrangeJoueur+1;
            }
            if (grille[ligne][g]=="jaune"){
                nbrJauneJoueur=nbrJauneJoueur+1;
            }
            if (grille[ligne][g]=="bleu"){
                nbrBleuJoueur=nbrBleuJoueur+1;
            }
            if (grille[ligne][g]=="noir"){
                nbrNoirJoueur=nbrNoirJoueur+1;
            }
            if (grille[ligne][g]=="blanc"){
                nbrBlancJoueur=nbrBlancJoueur+1;
            }
            if (grille[ligne][g]=="rose"){
                nbrRoseJoueur=nbrRoseJoueur+1;
            }
          }
            tabCouleurJoueur[0]=nbrRougeJoueur;
            tabCouleurJoueur[1]=nbrVertJoueur;
            tabCouleurJoueur[2]=nbrOrangeJoueur;
            tabCouleurJoueur[3]=nbrJauneJoueur;
            tabCouleurJoueur[4]=nbrBleuJoueur;
            tabCouleurJoueur[5]=nbrNoirJoueur;
            tabCouleurJoueur[6]=nbrBlancJoueur;
            tabCouleurJoueur[7]=nbrRoseJoueur;
            return tabCouleurJoueur;
    }
        public void ComparerLesCouleurs(tabCouleurJoueur,tabCouleurCache){//on compare maintenant le nombre de jetons de chaque couleur 
            
        }
}
