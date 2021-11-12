/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_lecornec_tort;

//import BouteilleBiere;


/**
 *
 * @author 33782
 */

public class TP2_Bieres_LECORNEC_TORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
BouteilleBiere UneBiere = new BouteilleBiere ("cuvée des trolls", 7.0, "Dubuisson");
UneBiere.ouverte=false;
UneBiere.lireEtiquette();

BouteilleBiere UneBiere1 = new BouteilleBiere ("Juliette", 5.5, "le petit comptoir" );
UneBiere1.lireEtiquette();
BouteilleBiere UneBiere2 = new BouteilleBiere ("Guillaume",27, "Babar" );
UneBiere2.lireEtiquette();
BouteilleBiere UneBiere3 = new BouteilleBiere ("love",10, "chezjuju" );
UneBiere3.lireEtiquette();

boolean result = UneBiere2.Décapsuler();
System.out.println(result);
result=UneBiere2.Décapsuler();
System.out.println(result);


//BouteilleBiere UneBiere;        
//UneBiere= new BouteilleBiere();
        
   
        
//UneBiere.Nom ="Cuvée des trolls" ; 
//UneBiere.degreAlcool= (int) 7.0;
//UneBiere.brasserie="Dubuisson";
//UneBiere.ouverte= false;          

//UneBiere.lireEtiquette();
//BouteilleBiere UneBiere2;    
//UneBiere2 = new BouteilleBiere();
         
//UneBiere2.Nom ="Leffe" ; 
//UneBiere2.degreAlcool= (int) 6.6;
//UneBiere2.brasserie="Abbaye de Leffe";
         

//UneBiere2.lireEtiquette();
BouteilleBiere uneBiere23;
uneBiere23= new BouteilleBiere("Pelforth",7,"EPF");
System.out.println(uneBiere23);



BouteilleBiere UneBiere6 = new BouteilleBiere ("Juliett", 5, "le ptit comptoir" );



BouteilleBiere UneBiere7 = new BouteilleBiere ("Juliete", 6, "le pit comptoir" );


BouteilleBiere UneBiere8 = new BouteilleBiere ("Julite", 7, "le p comptoir" );



BouteilleBiere UneBiere9 = new BouteilleBiere ("Julette", 8, "le petit comoir" );



BouteilleBiere UneBiere10 = new BouteilleBiere ("Jliette", 9, "le petit toir" );

System.out.println(UneBiere);
result=UneBiere6.Décapsuler();
System.out.println(result);
result=UneBiere6.Décapsuler();
System.out.println(result);
System.out.println(UneBiere6);
System.out.println(UneBiere7);
System.out.println(UneBiere8);
System.out.println(UneBiere9);
System.out.println(UneBiere10);








}


}

    




    

    

