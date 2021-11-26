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

    //on fair un tirage aleatoire entre 0 et 1
    Joueur ListeJoueurs[] = new Joueur[2]; //on initialise le tableau
    Joueur joueurCourant;
    Grille grilleJeu = new Grille();
    int couleuraleat;
    int premierJoueur;

    public void attribuerCouleursAuxJoueurs() {
        couleuraleat = (int) (Math.random() * 1);
        if (couleuraleat == 0) {
            ListeJoueurs[0].affecterCouleur("jaune"); //metre les bonnes variables
            ListeJoueurs[1].affecterCouleur("rouge"); //on attribue les couleurs EN UTILISANT LES METHODES des autres class 
        } else {
            ListeJoueurs[1].affecterCouleur("jaune");
            ListeJoueurs[0].affecterCouleur("rouge");
        }

    }

    public void initialiserPartie() {
        grilleJeu.viderGrille();  // a faire dans la lcasse grille

        Scanner sc = new Scanner(System.in);
        System.out.println("Pseudo du Joueur1: ");
        Joueur Joueur1 = new Joueur(sc.nextLine());
        System.out.println("Pseudo du Joueur2: ");
        Joueur Joueur2 = new Joueur(sc.nextLine());
        ListeJoueurs[0] = Joueur1;
        ListeJoueurs[1] = Joueur2;
        attribuerCouleursAuxJoueurs();
        System.out.println(Joueur1.Nom + " joue avec les jetons " + Joueur1.Couleur + "s");
        System.out.println(Joueur2.Nom + " joue avec les jetons " + Joueur2.Couleur + "s");  //on a donc les joueurs avec leur pseudo et leur couleur de jetons

        for (int i = 0; i < 21; i++) {
            Jeton Jeton1 = new Jeton(Joueur1.Couleur);
            Jeton Jeton2 = new Jeton(Joueur2.Couleur);
            Joueur1.ajouterJeton(Jeton1);
            Joueur2.ajouterJeton(Jeton2);
        }
        premierJoueur = (int) (Math.random() * 1);
        if (premierJoueur == 0) {
            joueurCourant = ListeJoueurs[0];
        } else {
            joueurCourant = ListeJoueurs[1];
        }
        //placer les trous noirs et les teleporteurs plus tard
    }

    public void debuterPartie() {
        // faire lancer la partie 
        
        initialiserPartie();
        int nbCol;
        Scanner sc = new Scanner(System.in);
        while ((grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) == false) && (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) == false)) {
            grilleJeu.afficherGrilleSurConsole();
            System.out.println("Que voulez vous faire? ");
            System.out.println("1) Jouer un jeton ?");
            System.out.println("2) Récupérer un de vos jetons ?");
            System.out.println("3) Jouer un désintégrateur ?");
            System.out.println("Entrez le chiffre correspondant à l'action que vous voulez réaliser");
            int actionARealiser = sc.nextInt();
            while ((actionARealiser != 1) && (actionARealiser != 2) && (actionARealiser != 3)) {
                System.out.println("Veuillez rentrer un nombre compris entre 1 et 3");
                actionARealiser = sc.nextInt();
            }
            
            if (actionARealiser == 1) {
                if (joueurCourant.ListeJetons[0] == null) { //si la 21eme case de mes jetons est vide, ca veut dire que tous ceux d'avant ont été utilisés aussi
                    System.out.println("Partie terminée, vous n'avez plus aucun jeton");
                    break;
                }
                System.out.println("Dans quelle colonne souhaitez vous jouer ce jeton?");
                Scanner sc2 = new Scanner(System.in);
                
                nbCol = sc2.nextInt(); //a verifier
                while ((nbCol!=1)&&(nbCol!=2)&&(nbCol!=3)&&(nbCol!=4)&&(nbCol!=5)&&(nbCol!=6)){
                    System.out.println("Veuillez entrer un numéro de colonne compris entre 1 et 6");
                    nbCol=sc2.nextInt();  //on est maintenant sur que la colonne rentrée est valide 
                }
                //il faut aller recuperer le jeton
                //jetonJoue=jetonCourant.ListeJetons[jetonCourant.nombreJetonsRestants-1];
                //jetonCourant.listeJetons[jetonCourant.nombreJetonsRestants-1]=null;
                //jetonCourant.nombreJetonsRestants;
                while (grilleJeu.colonneRemplie(nbCol)==true){
                    System.out.println("Cette colonne est remplie, selectionne-en une autre.");
                    nbCol=sc2.nextInt()-1; //on est sur que la colonne choisie n'est pas pleine 
                }
                Jeton jetonPlace=joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1];//-1
                joueurCourant.ListeJetons[joueurCourant.nombreJetonsRestants-1]=null; //-1
                joueurCourant.nombreJetonsRestants--;
                grilleJeu.ajouterJetonDansColonne(jetonPlace, nbCol);//pb avec joueurCourant, mettre un jeton en entree
                joueurCourant.nombreJetonsRestants=joueurCourant.nombreJetonsRestants-1;
                
                

                //boolean jetonJoue = grilleJeu.ajouterJetonDansColonne(jetonJoue, nbCol); //ici c est le jeton qui doit etre en parametre
                //while (jetonJoue == false) {
                    //System.out.println("La colonne selectionnée est pleine , choisissez-en une nouvelle");
                    //nbCol = sc.nextInt()-1;
                    //jetonJoue = grilleJeu.ajouterJetonDansColonne(, nbCol); //a modifier prochainement avec les nouveaux reglages dans la classe grille  
                }
            
            if (actionARealiser == 2) {
                int recupCol;
                int recupLigne;
                Scanner sc3 = new Scanner(System.in);

                System.out.println("quelle est la ligne du jeton que vous souhaitez récuperer");
                recupLigne = sc3.nextInt();
                while ((recupLigne != 1) && (recupLigne != 2) && (recupLigne != 3) && (recupLigne != 4) && (recupLigne != 5) && (recupLigne != 6)) {
                    System.out.println("veuillez recommmencer, la ligne doit etre comprise entre 1 et 6");
                    recupLigne = sc3.nextInt();
                }
                System.out.println("Super! maintenant, veuillez rentrer le numéro de colonne du jeton que vous voulez récupérer");
                recupCol = sc3.nextInt();
                while ((recupCol != 1) && (recupCol != 2) && (recupCol != 3) && (recupCol != 4) && (recupCol != 5) && (recupCol != 6) && (recupCol != 7)) {
                    System.out.println("veuillez recommencer, la colonne doit etre comprise entre 1 et 7");
                    recupCol = sc3.nextInt();
                }

                while ((grilleJeu.CellulesJeu[recupLigne][recupCol].jetonCourant == null) || !grilleJeu.CellulesJeu[recupLigne][recupCol].lireCouleurDuJeton().equals(joueurCourant.Couleur)) {//mettre avec la classe grille la facon de vérifier si il ya bien un jeton DE SA couleur a la case choisie 

                    if (grilleJeu.CellulesJeu[recupLigne][recupCol].jetonCourant == null) {
                        System.out.println("vous devez utiliser ce pouvoir sur une case où il y a votre jeton, veuillez recommencer.");
                    }

                    if (!grilleJeu.CellulesJeu[recupLigne][recupCol].lireCouleurDuJeton().equals(joueurCourant.Couleur)) {
                        System.out.println("vous devez utiliser ce pouvoir sur une case où il y a votre jeton, veuillez recommencer.");

                    }
                    break;
                }
                if ((grilleJeu.CellulesJeu[recupLigne][recupCol].lireCouleurDuJeton().equals(joueurCourant.Couleur)) && (grilleJeu.CellulesJeu[recupLigne][recupCol].jetonCourant != null)) {
                    joueurCourant.ajouterJeton(grilleJeu.recupererJeton(recupLigne, recupCol)); //ca marchera quand juliette aura créé recupererJeton dans grille
                    grilleJeu.tasserGrille(recupCol); 
                }
                //break;
                // augmenter de 1 le nbr de jetons du joueur correspondant
                //mettre avec la classe grille pour supprimer le jeton en question
            }
            if (actionARealiser == 3) {
                int desintLigne;
                int desintCol;
                if (joueurCourant.nombreDesintegrateurs == 0) {
                    System.out.println("vous ne pouvez pas effectuer ce coup car vous n'avez plus de désintégrateurs");
                    break;
                }
                System.out.println("quelle est la ligne du jeton que vous souhaitez désintégrer ?");
                desintLigne = sc.nextInt();
                while ((desintLigne != 1) && (desintLigne != 2) && (desintLigne != 3) && (desintLigne != 4) && (desintLigne != 5) && (desintLigne != 6)) {
                    System.out.println("veuillez recommmencer, la ligne doit etre comprise entre 1 et 6");
                    desintLigne = sc.nextInt();
                }

                System.out.println("quelle est la colonne du jeton que vous souhaitez désintégrer ?");
                desintCol = sc.nextInt();
                while ((desintCol != 1) && (desintCol != 2) && (desintCol != 3) && (desintCol != 4) && (desintCol != 5) && (desintCol != 6)) {
                    System.out.println("veuillez recommmencer, la colonne doit etre comprise entre 1 et 7");
                    desintCol = sc.nextInt();
                }
                while (grilleJeu.CellulesJeu[desintLigne][desintCol].jetonCourant == null) {
                    System.out.println("quelle est la ligne du jeton que vous souhaitez désintégrer ?");
                    desintLigne = sc.nextInt();
                    while ((desintLigne != 1) && (desintLigne != 2) && (desintLigne != 3) && (desintLigne != 4) && (desintLigne != 5) && (desintLigne != 6)) {
                        System.out.println("veuillez recommmencer, la ligne doit etre comprise entre 1 et 6");
                        desintLigne = sc.nextInt();
                    }

                    System.out.println("quelle est la colonne du jeton que vous souhaitez désintégrer ?");
                    desintLigne = sc.nextInt();
                    while ((desintCol != 1) && (desintCol != 2) && (desintCol != 3) && (desintCol != 4) && (desintCol != 5) && (desintCol != 6)) {
                        System.out.println("veuillez recommmencer, la colonne doit etre comprise entre 1 et 7");
                        desintCol = sc.nextInt();
                    }
                }
                grilleJeu.supprimerJeton(desintLigne, desintCol); //ca marchera quand supprimerJeton sera réalisé 
                grilleJeu.tasserGrille(desintCol);//ca marchera quand tasserCol sera créé
                joueurCourant.utiliserDesintegrateur();
                break;
            }
            //on a traité les cas pour toutes les actions possibles

            //on va maintenant faire alterner les tours, cad que le joueur qui va jouer va changer 
            if (joueurCourant == ListeJoueurs[1]) {
                joueurCourant = ListeJoueurs[0];
            }
            else {
                joueurCourant = ListeJoueurs[1];
                //on fait alterner les joueurs courants
            }
            System.out.println("Bien joué, c'est au tour de " + joueurCourant.Nom);
        }

        if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[0]) == true) {
            System.out.println("La partie est terminée, le gagnant est " + ListeJoueurs[0].Nom);
        }

        if (grilleJeu.etreGagnantePourJoueur(ListeJoueurs[1]) == true) {
            System.out.println("La partie est terminée, le gagnant est " + ListeJoueurs[1].Nom);
        }
    }
}
