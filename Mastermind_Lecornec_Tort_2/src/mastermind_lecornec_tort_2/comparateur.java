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
    
    
    public int [] comparer(String[][] grilleJoueur, String[][] combiCachee,int ligne) {
        //for (int i=0; i<7; i++){
        int bonneCouleur=0;
        int bienPlace=0; //on initialise les variables
        String[][] combiJoueur=new String[1][4];
        combiJoueur[1][1]=grilleJoueur[ligne][1];
        combiJoueur[1][2]=grilleJoueur[ligne][2];
        combiJoueur[1][3]=grilleJoueur[ligne][3];
        combiJoueur[1][4]=grilleJoueur[ligne][4];//les valeurs de la combie porposée par le joueur sont stockées dans un nouveau tableau
        int [] resultat= new int[1];//on créé un tableau qui va recueillir les resultats
        boolean [] checkJoueur= new boolean[4];
        boolean [] checkCachee= new boolean[4];
        for (int i=0; i<4; i++){
            if (combiCachee[0][i]==combiJoueur[0][i]){ // si la case de la combinaison cachee est la meme que celle du jouuer alors on augmente de 1 le nombre de "jetons bien placés"
                bienPlace=bienPlace+1;
                checkJoueur[i]=true;
                checkCachee[i]=true;  //on les met en "true" pour qu on n'ait plus a s en occuper lors de la detection des couleurs (on comprendra a la ligne 33)            
            }
            resultat[0]=bienPlace; //on affecte a la premiere case du tableau resultat le nombre de pions bien placés
        }
        for (int j=0; j<4;j++){
            for (int g=0; g<4;g++){
                if ((combiCachee[j]==combiJoueur[g])&&(checkJoueur[g]!=true)&&(checkCachee[j]!=true)){
                    bonneCouleur=bonneCouleur+1;//on compare les couleurs maintenant, on augmente de 1 le nombre de bonnes couleurs lorsque cette couleur n est pas bien placée(grace au marqueur check)
                    checkJoueur[g]=true;//pareil
                    checkCachee[j]=true;
                }
            }
        }
        resultat[1]=bonneCouleur;   //pareil que pour bienPlacé
        return resultat;//on retourne ensuite le tableau recapitulatif
}
    
}
        
        

