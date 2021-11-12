/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package tp2_manip_tort_lecornec;
/**
 *
 * @author 33782
 */
public class Moussaka {
    //Ajout d'un attribut:
    int nbCalories;
 
  public Moussaka (int valeur){
      nbCalories = valeur;
  }
  
  @Override
  public String toString() {
      return String.valueOf(nbCalories);
  }
    
}

