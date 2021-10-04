/*
 * TP1 convertissseur
 */
package convertisseur_tort_lecornec;
import java.util.Scanner;
/**
 *
 * @author 33782
 */
public class Convertisseur_TORT_LECORNEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int var1;
        int var1K;
        Scanner sc;
        sc=new Scanner(System.in);
        var1=(int) sc.nextDouble();
        var1K=var1+273;
        //System.out.println("var1K=" +var1K+"K");
        //System.out.println("La température en Kelvin est de "+CelciusVersKelvin(27)+"K");
        //System.out.println("La température en Celcius est de "+KelvinVersCelcius(300)+"°C");
        //System.out.println("La température en Celcius est de "+FarenheitVersCelcius(34)+"°C");
        //System.out.println("La température en Farenheit est de "+CelciusVersFarenheit(0)+"°F");
        //System.out.println("La température en Farenheit est de "+KelvinVersFarenheit(0)+"°F");
        //System.out.println("La température en Kelvin est de "+FarenheitVersKelvin(66)+"K");
        System.out.println("Bonjour, saisissez une valeur:");
        Scanner sc2;
        int var3;
        sc2=new Scanner(System.in);
        var3=(int) sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer \n 1)De Celcius vers Kelvin \n 2) De Kelvin vers Celcius \n 3)De Farenheit vers Celcius \n 4)De Celcius vers Farenheit \n 5)De Kelvin vers Farenheit \n 6) De Farenheit vers Kelvin");
        
        int var4;
        
        Scanner sc3;
        sc3=new Scanner(System.in);
        
        var4=(int) sc.nextDouble();
        if (var4==1)
            System.out.println("La température en Kelvin est de "+CelciusVersKelvin(var3)+"K");
        if (var4==2)
            System.out.println("La température en Celcius est de "+KelvinVersCelcius(var3)+"°C");
        if (var4==3)
            System.out.println("La température en Celcius est de "+FarenheitVersCelcius(var3)+"°C");
        if (var4==4)
            System.out.println("La température en Farenheit est de "+CelciusVersFarenheit(var3)+"°F");
        if (var4==5)
            System.out.println("La température en Farenheit est de "+KelvinVersFarenheit(var3)+"°F");
        if (var4==6)
            System.out.println("La température en Kelvin est de "+FarenheitVersKelvin(var3)+"K");    
            
            
            
        
    }
public static double CelciusVersKelvin(double tempCelcius) { 
    double tempK;
    tempK=tempCelcius + 273;
    return (tempK);
    
    }

public static double KelvinVersCelcius(double tempKelvin) { 
    double tempC;
    tempC=tempKelvin - 273;
    return (tempC);
    
}
    
public static double FarenheitVersCelcius(double tempFarenheit) { 
    double tempC2;
    tempC2=tempFarenheit-32;
    tempC2=tempC2/1.8;
    return (tempC2);

}

public static double CelciusVersFarenheit(double tempCelcius) { 
    double tempF2;
    tempF2=tempCelcius*1.8;
    tempF2=tempF2+32;
    return (tempF2);

}

public static double KelvinVersFarenheit(double tempKelvin) { 
    double tempF3;
    tempF3=KelvinVersCelcius(tempKelvin);
    tempF3=CelciusVersFarenheit(tempF3);
    return (tempF3);
}

public static double FarenheitVersKelvin(double tempFarenheit) { 
    double tempK4;
    tempK4=FarenheitVersCelcius(tempFarenheit);
    tempK4=CelciusVersKelvin(tempK4);
    return (tempK4);
}
}




