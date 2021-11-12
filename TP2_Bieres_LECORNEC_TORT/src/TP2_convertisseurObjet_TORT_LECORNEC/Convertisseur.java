/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP2_convertisseurObjet_TORT_LECORNEC;

/**
 *
 * @author 33782
 */
public class Convertisseur {
int nbConversions;
double CelciusVersKelvin;
double KelvinVersCelcius;
double FarenheitVersCelcius;
double CelciusVersFarenheit;
double FarenheitVersKelvin;
double KelvinVersFarenheit;
String toString;
public Convertisseur () {
    nbConversions = 0;    
}
@Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}

}
