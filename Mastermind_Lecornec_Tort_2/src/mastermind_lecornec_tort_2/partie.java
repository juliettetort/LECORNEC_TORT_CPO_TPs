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
import java.util.Random;
import java.util.Scanner;
public class partie  {
    int couleuraleat;
    grille grilleJeu=new grille();
    
    public String[][] initialiserPartie() {
        String [][] combiCachee= new String[4][1];
        //Cellule combiCachee[][] = new Cellule [0][3];
        grilleJeu.viderGrille();  // on vide la grille pour commencer
        Scanner sc = new Scanner(System.in);
        System.out.println("Votre Pseudo: ");
        joueur joueur = new joueur(sc.nextLine());//le joueur 1 a alors son nom
        for (int i = 0; i < 4; i++) {// pour placer les 4 pions de couleur 
        couleuraleat = (int) (Math.random() * 7);//on tire aléatoirement parmis 8 couleurs
        
        if (couleuraleat==0){
        combiCachee[0][i]="rouge";  
        }
        if (couleuraleat==1){
         combiCachee[0][i]="vert";   
        }
        if (couleuraleat==2){
         combiCachee[0][i]="orange";   
        }
        if (couleuraleat==3){
         combiCachee[0][i]="jaune";   
        }
        if (couleuraleat==4){
         combiCachee[0][i]="bleu";   
        }
        if (couleuraleat==5){
         combiCachee[0][i]="noir";   
        }
        if (couleuraleat==6){
         combiCachee[0][i]="blanc";   
        }
        if (couleuraleat==7){
         combiCachee[0][i]="rose";   
        }//on a alors les 4 cases cachées colorées
        
        
        }
        return combiCachee;//on retourne la combinaison des cases cachees 
}
    
    public void debuterPartie (){
    //String combiCachee[]=new String [4];
    initialiserPartie();
    int nbcol=1;
    int coupParTour=1;
    Scanner sc = new Scanner(System.in);
    
    while ((grilleJeu.etreGagnantePourJoueur() == false)){//tant que le joueur n'a pas gagné on joue
        while (coupParTour<5){
        grilleJeu.afficherGrilleSurConsole(); // pour chaque tour, on pourra voir s'afficher notre grille de jeu
        System.out.println("Quelle couleur voulez vous jouer dans la colonne n°"+nbcol+" ?");
        System.out.println("si vous voulez la couleur rouge, écrivez 1");
        System.out.println("si vous voulez la couleur vert, écrivez 2");
        System.out.println("si vous voulez la couleur orange, écrivez 3");
        System.out.println("si vous voulez la couleur jaune, écrivez 4");
        System.out.println("si vous voulez la couleur bleu, écrivez 5");
        System.out.println("si vous voulez la couleur noir, écrivez 6");
        System.out.println("si vous voulez la couleur blanc, écrivez 7");
        System.out.println("si vous voulez la couleur rose, écrivez 8");
        int actionARealiser = sc.nextInt();
        while ((actionARealiser != 1) && (actionARealiser != 2) && (actionARealiser != 3)&& (actionARealiser != 4)&& (actionARealiser != 5)&& (actionARealiser != 6)&& (actionARealiser != 7)&& (actionARealiser != 8)) {
                System.out.println("Veuillez rentrer un nombre compris entre 1 et 8");
                actionARealiser = sc.nextInt();//on fait choisir au joueur une couleur
        }
        
        
        grilleJeu.ajouterJetonDansColonne(jetons.Couleur, nbcol-1);//on ajoute alors le jeton qui correspond dans la colonne qui correspond 
        coupParTour=coupParTour+1;
        nbcol=nbcol+1;//on incrémente pour faire varier les cases de jeu
        
        
    }
        
        comparer(combiCachee,grilleJeu);
        System.out.println("il y a "+resultat[1]+" jetons de la bonne couleur");
        System.out.println("parmis lesquels, "+resultat[0]+" sont bien placés"); //on donne au joueur les infos sur son coup
      
       
    
    
    
}
}
}
