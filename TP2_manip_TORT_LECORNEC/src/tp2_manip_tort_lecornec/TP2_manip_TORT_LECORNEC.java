/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP2_manip_tort_lecornec;

/**
 *
 * @author 33782
 */
public class TP2_manip_TORT_LECORNEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
    Tartiflette assiette1 = new Tartiflette(500);
    Tartiflette assiette2 = new Tartiflette(600);
    assiette2.nbCalories = 766;
    Tartiflette assiette3 = assiette2;
    //il n'y a réellement que 2 tartiflettes qui ont été créees car l'instruction 'new' n'apparait que 2 fois
    //assiette2 et assiette3 référencent la même tartiflette
    
    System.out.println("nb de calories de Assiette 3: " + assiette3.nbCalories);
    //on a bien la valeur incrémentée de l'assiette 2 pour l'assiette 3 
    
    assiette2 = assiette1;
    assiette1 = assiette3;
    
    System.out.println("nb decalories de Assiette 1: " + assiette1.nbCalories);
    System.out.println("nb de calories de Assiette 2: " + assiette2.nbCalories);
    // on retrouve assiette1 = 766 et assiette2 = 500
    
    
 
    Moussaka [] tableau = new Moussaka[10];
    System.out.print("[");
    for (int i=0;i<tableau.length;i++){
        tableau[i] = new Moussaka(100*(1+i));
        if (i==tableau.length-1){
            System.out.println(tableau[i]+"]");   // a la fin du tableau il faut juste afficher le dernier nombre suivit de ']'
        }
        else{
            System.out.print(tableau[i]+" ; ");
        
    }
    
    
    }
    }
}
    
    
    

