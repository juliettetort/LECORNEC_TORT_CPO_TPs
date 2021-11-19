/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sp4_console_tort_lecornec;

/**
 *
 * @author 33782
 */
public class SP4_console_TORT_LECORNEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//bonjour juliette
//tirage aleatoire avec start
Jeton jeton1 =new Jeton("rouge");
System.out.println(jeton1.lireCouleurDuJeton());
Cellule cellule1= new Cellule();
System.out.println(cellule1.lireCouleurDuJeton());  //affiche vide
cellule1.affecterJeton(jeton1);
System.out.println(cellule1.lireCouleurDuJeton()); //affiche rouge
Grille guits = new Grille();
guits.afficherGrilleSurConsole();
guits.ajouterJetonDansColonne(jeton1, 5);
guits.afficherGrilleSurConsole();
    }
}