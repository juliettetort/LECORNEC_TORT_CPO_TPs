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
    
    
    public int [] comparer(grille[][] combiCachee, grille [][] combiJoueur) {
        //for (int i=0; i<7; i++){
        int bonneCouleur=0;
        int bienPlace=0;
        int [] resultat= new int[1];
        boolean [] checkJoueur= new boolean[4];
        boolean [] checkCachee= new boolean[4];
        for (int i=0; i<4; i++){
            if (combiCachee[0][i]==combiJoueur[0][i]){
                bienPlace=bienPlace+1;
                checkJoueur[i]=true;
                checkCachee[i]=true;               
            }
            resultat[0]=bienPlace; //on affecte a la premiere case du tableau resultat le nombre de pions bien placés
        }
        for (int j=0; j<4;j++){
            for (int g=0; g<4;g++){
                if ((combiCachee[j]==combiJoueur[g])&&(checkJoueur[g]!=true)&&(checkCachee[j]!=true)){
                    bonneCouleur=bonneCouleur+1;
                    checkJoueur[g]=true;
                    checkCachee[j]=true;
                }
            }
        }
        resultat[1]=bonneCouleur;   
        return resultat;
}
    
}
        
        

