/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_tort_lecornec;

/**
 *
 * @author 33782
 */
public class Convertisseur {
   
    int nbConversions;
    
  public Convertisseur () {
      nbConversions= 0;
  }  
  
  @Override
  public String toString() {
      return "nb de conversions = "+ nbConversions;
  }

  //Création des méthodes:
    public double CelciusVersKelvin(double tempCelcius){ 
        double tempKelvin=tempCelcius+273.15f; //On ajoute le 'f' derrière le nombre pour le forcer à être en float
        nbConversions+=1;
        return(tempKelvin);
    }
    
    public double KelvinVersCelcius(double tempKelvin){ 
        double tempCelcius=tempKelvin-273.15f; //On ajoute le 'f' derrière le nombre pour le forcer à être en float
        nbConversions+=1;
        return(tempCelcius);
    }
    public double FarenheitVersCelcius(double tempFarenheit){ 
        double tempCelcius=(tempFarenheit-32)*5/9; 
        nbConversions+=1;
        return(tempCelcius);
    }
    public double CelciusVersFarenheit(double tempCelcius){ 
        double tempFarenheit=tempCelcius*9/5+32; 
        nbConversions+=1;
        return(tempFarenheit);
    }
        
    public double FarenheitVersKelvin(float tempFarenheit){ 
        double tempKelvin=CelciusVersKelvin(FarenheitVersCelcius(tempFarenheit));  
        nbConversions-=1;
        return(tempKelvin);
    }
    
    public double KelvinVersFarenheit(double tempKelvin){ 
        double tempFarenheit=CelciusVersFarenheit(KelvinVersCelcius(tempKelvin)); 
        nbConversions-=1;
        return(tempFarenheit);
    }
}


