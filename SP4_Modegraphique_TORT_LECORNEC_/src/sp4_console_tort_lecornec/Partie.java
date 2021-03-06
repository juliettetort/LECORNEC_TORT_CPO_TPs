/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_tort_lecornec;

/**
 *
 * @author 33782
 */
import java.util.Random;
import java.util.Scanner;

public class Partie {

    
    Joueur ListeJoueurs[] = new Joueur[2]; //on initialise le tableau des joueurs 
    Joueur joueurCourant; //ce 'joueurCourant" caracterise le joueur pour qui c est le tour de jouer
    Grille grilleJeu = new Grille();
    int couleuraleat;
    int premierJoueur;
    int lignealeat;
    int colaleat;

    public void attribuerCouleursAuxJoueurs() {
        couleuraleat = (int) (Math.random() * 1);
        if (couleuraleat == 0) {
            ListeJoueurs[0].affecterCouleur("jaune"); 
            ListeJoueurs[1].affecterCouleur("rouge"); //on attribue les couleurs EN UTILISANT LES METHODES des autres class 
        } else {
            ListeJoueurs[1].affecterCouleur("jaune");
            ListeJoueurs[0].affecterCouleur("rouge");
        }//on a alors affecte les couleurs de maniere aleatoire (en tirant une variable aleatoire)

    }

    public void initialiserPartie() {
        grilleJeu.viderGrille();  // on vide la grille pour commencer 

        Scanner sc = new Scanner(System.in);
        System.out.println("Pseudo du Joueur1: ");
        Joueur Joueur1 = new Joueur(sc.nextLine());
        System.out.println("Pseudo du Joueur2: ");
        Joueur Joueur2 = new Joueur(sc.nextLine());
        ListeJoueurs[0] = Joueur1;
        ListeJoueurs[1] = Joueur2;// chaque joueur est caracterise par un pseudo,ces pseudos sont rentrés dans le tableau des joueurs 
        attribuerCouleursAuxJoueurs(); // on leur attribue la couleur a chacun
        System.out.println(Joueur1.Nom + " joue avec les jetons " + Joueur1.Couleur + "s");
        System.out.println(Joueur2.Nom + " joue avec les jetons " + Joueur2.Couleur + "s");  //on a donc les joueurs avec leur pseudo et leur couleur de jetons
        int tn = 0;// tn est le nombre de trou noirs, initialisé
        for (int i = 0; i < 21; i++) { //on créé les jetons pour les 2 joueurs, il y en z 42 en tout (6x7)
            Jeton Jeton1 = new Jeton(Joueur1.Couleur);
            Jeton Jeton2 = new Jeton(Joueur2.Couleur);
            Joueur1.ajouterJeton(Jeton1);
            Joueur2.ajouterJeton(Jeton2); //chaque joueur a maintenant ses 21 jetons de couleur respective
        }
        premierJoueur = (int) (Math.random() * 1);
        if (premierJoueur == 0) {
            joueurCourant = ListeJoueurs[0];
        } else {
            joueurCourant = ListeJoueurs[1];
        }// on a tiré aléatoirement qui commencait
        
        while (tn <6){ // on place les trous noirs
            lignealeat = (int) (Math.random() * 6);
            colaleat = (int) (Math.random() * 7);
            
            if (grilleJeu.CellulesJeu[lignealeat][colaleat].presenceTrouNoir()==false){//on verifie que la cellule selectionnee ne contienne pas deja de trous noirs 
                grilleJeu.placerTrouNoir(lignealeat, colaleat);
                tn++; //on place aleatoirement les trous nooirs en tirant une ligne et iune colonne aleatoirement a chaque fois                                 
            }
            else{
                tn=tn;
            }  
            }
        
        
    }

    public void debuterPartie() {
        // faire lancer la partie 
        
        initialiserPartie();//pour commencer la partie il faut l initialiser 
        int nbCol;
        Scanner sc = new Scanner(System.in);
        while ((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) == false) && (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) == false)) { //on ne joue que si personne n a deja gagne 
            grilleJeu.afficherGrilleSurConsole(); // pour chaque tour, on pourra voir s'afficher notre SP4
            System.out.println("Que voulez vous faire? ");
            System.out.println("1) Jouer un jeton ?");
            System.out.println("2) Récupérer un de vos jetons ?");
            System.out.println("3) Jouer un désintégrateur ?");
            System.out.println("Entrez le chiffre correspondant à l'action que vous voulez réaliser");
            int actionARealiser = sc.nextInt();
            while ((actionARealiser != 1) && (actionARealiser != 2) && (actionARealiser != 3)) {
                System.out.println("Veuillez rentrer un nombre compris entre 1 et 3");
                actionARealiser = sc.nextInt();//on fait cjoisir au joueur une action
            }
            //on traite ensuite les differents cas 
            if (actionARealiser == 1) { //donc le joueur veut jouer un jeton
                if (joueurCourant.ListeJetons[0] == null) { //si la 21eme case de mes jetons est vide, ca veut dire que tous ceux d'avant ont été utilisés aussi
                    System.out.println("Partie terminée, vous n'avez plus aucun jeton");
                    break;
                }
                System.out.println("Dans quelle colonne souhaitez vous jouer ce jeton?");
                Scanner sc2 = new Scanner(System.in);
                
                nbCol = sc2.nextInt(); //a verifier
                while ((nbCol!=1)&&(nbCol!=2)&&(nbCol!=3)&&(nbCol!=4)&&(nbCol!=5)&&(nbCol!=6)&&(nbCol!=7)){
                    System.out.println("Veuillez entrer un numéro de colonne compris entre 1 et 7");
                    nbCol=sc2.nextInt();  //on est maintenant sur que la colonne rentrée est valide 
                }
                while (grilleJeu.colonneRemplie(nbCol)==true){
                    System.out.println("Cette colonne est remplie, selectionnes-en une autre.");
                    nbCol=sc2.nextInt(); //on est sur que la colonne choisie n'est pas pleine 
                }
 
                
                Jeton jetonPlace=joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];//on affecte au jeton qui va etre joué, les caracteristiques du jeton du joueur courant
                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1]=null; //vu que le joueur joue un jeton, il en aura un de moins, donc on supprime ce jeton de son "tyableau de jetons"
                joueurCourant.nombreJetonsRestants--;//son nombre de jetons restants diminue alors de 1
                grilleJeu.ajouterJetonDansColonne(jetonPlace, nbCol);//on ajoute alors le jeton qui correspond dans la colonne qui correspond 
                System.out.println(joueurCourant.Nom+" a encore "+joueurCourant.nombreJetonsRestants+" jetons");//on donne l'indication du nombre de jetons restants du joueur courant
                }
            
            if (actionARealiser == 2) {// si le joueur veut récupérer un jeton
                int recupCol;
                int recupLigne;
                Scanner sc3 = new Scanner(System.in);

                System.out.println("quelle est la ligne du jeton que vous souhaitez récuperer");
                recupLigne = sc3.nextInt();
                while ((recupLigne != 1) && (recupLigne != 2) && (recupLigne != 3) && (recupLigne != 4) && (recupLigne != 5) && (recupLigne != 6)) {//on est maintenant sur que la ligne du jeton que le joueur veut recuperer soit un numéro de ligne valide (6)
                    System.out.println("veuillez recommmencer, la ligne doit etre comprise entre 1 et 6");//on recommence tant que c est pas bon
                    recupLigne = sc3.nextInt();
                }
                System.out.println("Bien enregistré ! maintenant, veuillez rentrer le numéro de colonne du jeton que vous voulez récupérer");
                recupCol = sc3.nextInt();
                while ((recupCol != 1) && (recupCol != 2) && (recupCol != 3) && (recupCol != 4) && (recupCol != 5) && (recupCol != 6) && (recupCol != 7)) {
                    System.out.println("Veuillez recommencer, la colonne doit etre comprise entre 1 et 7");//on fait pareil pour les colonnes 
                    recupCol = sc3.nextInt();
                }

                while ((grilleJeu.CellulesJeu[recupLigne-1][recupCol-1].jetonCourant == null) || !grilleJeu.CellulesJeu[recupLigne-1][recupCol-1].lireCouleurDuJeton().equals(joueurCourant.Couleur)) {//on vérifie si il ya bien un jeton et si il est de SA couleur a la case choisie 

                        System.out.println("vous devez utiliser ce pouvoir sur une case où il y a votre jeton, veuillez recommencer.");
                                            
                    break;
                }
                if ((grilleJeu.CellulesJeu[recupLigne-1][recupCol-1].lireCouleurDuJeton().equals(joueurCourant.Couleur)) && (grilleJeu.CellulesJeu[recupLigne-1][recupCol-1].jetonCourant != null)) { //si c est une case valide selon les regles:
                    joueurCourant.ajouterJeton(grilleJeu.recupererJeton(recupLigne-1, recupCol-1)); //on est surs que les conditions soient respectees, donc on peut retirer et recuperer le jeton
                    grilleJeu.tasserGrille(recupCol-1); //la colonne sera remise comme il faut, c est a dire tassée
                    
                    System.out.println(joueurCourant.Nom+" a encore "+joueurCourant.nombreJetonsRestants +" jetons");//indication sur le nombre de jetons restants
                }
                //break;
                
                // augmenter de 1 le nbr de jetons du joueur correspondant
                //mettre avec la classe grille pour supprimer le jeton en question
            }
            if (actionARealiser == 3) {// si le joueur veut utiliser un desintegrateur
                int desintLigne;
                int desintCol;
                if (joueurCourant.nombreDesintegrateurs == 0) {
                    System.out.println("vous ne pouvez pas effectuer ce coup car vous n'avez plus de désintégrateurs");//on verifie si le joueur a encore des desintegrateurs
                    break;
                }
                System.out.println("quelle est la ligne du jeton que vous souhaitez désintégrer ?");
                desintLigne = sc.nextInt();
                while ((desintLigne != 1) && (desintLigne != 2) && (desintLigne != 3) && (desintLigne != 4) && (desintLigne != 5) && (desintLigne != 6)) {
                    System.out.println("veuillez recommmencer, la ligne doit etre comprise entre 1 et 6");//comme d hab on verifie que le numero de ligne soit un chiffre entre 1 et 6
                    desintLigne = sc.nextInt();//on recommence tant que ce n est pas le cas 
                }

                System.out.println("quelle est la colonne du jeton que vous souhaitez désintégrer ?");
                desintCol = sc.nextInt();
                while ((desintCol != 1) && (desintCol != 2) && (desintCol != 3) && (desintCol != 4) && (desintCol != 5) && (desintCol != 6)&& (desintCol != 7)) {
                    System.out.println("veuillez recommmencer, la colonne doit etre comprise entre 1 et 7");//idem pour la colonne 
                    desintCol = sc.nextInt();//on est alors surs que la cellule rentree est une cellule du SP4
                }
                //while (grilleJeu.CellulesJeu[desintLigne][desintCol].jetonCourant == null) {
                  //  System.out.println("quelle est la ligne du jeton que vous souhaitez désintégrer ?");
                    //desintLigne = sc.nextInt();
                    //while ((desintLigne != 1) && (desintLigne != 2) && (desintLigne != 3) && (desintLigne != 4) && (desintLigne != 5) && (desintLigne != 6)) {
                      //  System.out.println("veuillez recommmencer, la ligne doit etre comprise entre 1 et 6");
                      //  desintLigne = sc.nextInt();
                    //}

                    //System.out.println("quelle est la colonne du jeton que vous souhaitez désintégrer ?");
                   // desintLigne = sc.nextInt();
                    //while ((desintCol != 1) && (desintCol != 2) && (desintCol != 3) && (desintCol != 4) && (desintCol != 5) && (desintCol != 6)) {
                     //   System.out.println("veuillez recommmencer, la colonne doit etre comprise entre 1 et 7");
                      //  desintCol = sc.nextInt();
                    //}
                
                grilleJeu.supprimerJeton(desintLigne, desintCol); //on supprime le jeton en question 
                grilleJeu.tasserGrille(desintCol);//on rétabli la colonne, opn la tasse
                joueurCourant.utiliserDesintegrateur();//on utilise un desintegrateur, le joueur en a 1 de moins
                System.out.println(joueurCourant.Nom +" a encore "+ joueurCourant.nombreDesintegrateurs+ " désintegrateurs");
                //break;
            }
            //on a traité les cas pour toutes les actions possibles

            //on va maintenant faire alterner les tours, cad que le joueur qui va jouer va changer 
            if (actionARealiser==1){
                
                if (joueurCourant == ListeJoueurs[1]){
                joueurCourant = ListeJoueurs[0];
            }
            
            else {
                joueurCourant = ListeJoueurs[1];
                //on fait alterner les joueurs courants
            }
            }
            System.out.println("Bien joué, c'est au tour de " + joueurCourant.Nom);//on affiche un messag guidant les joueuers 
        }

        if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) == true) {
            System.out.println("La partie est terminée, le gagnant est " + ListeJoueurs[0].Nom);//si jamais la partie est terminee, on affiche le gagnant 
        }

        if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) == true) {
            System.out.println("La partie est terminée, le gagnant est " + ListeJoueurs[1].Nom);//idem si c'est l autre oueur qui a gagne 
        }
    }
}
