/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_tort_lecornec;

/**
 *
 * @author 33782
 */
public class Personne {
     //Attributs:
    String nom;
    String prenom;
    int nbVoitures;
    Voiture [] liste_voitures;
    
    
    public Personne (String leNom, String lePrenom, int nb_voitures){
        nom = leNom;
        prenom = lePrenom;
        nbVoitures = nb_voitures;
        liste_voitures = new Voiture [3]; //rajout de l'attribut pour lister les voitures possédées
    }
    
    @Override
    public String toString() {
        return nom+" "+prenom+" possède "+nbVoitures+" voitures";
    }
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) {
       if (voiture_a_ajouter.proprietaire!=null){ //si la voiture a déjà un proprio, ne peut pas être possédée par qqun d'autre --> retourne false
           System.out.println(voiture_a_ajouter+" a déjà un propriétaire");
           return false;
       } else{
           if (this.nbVoitures==3){ // si proprio a déjà 3voitures il ne peut pas en avoir plus --> retourne false
               System.out.println(this.nom+this.prenom+" possède déjà 3 voitures");
               return false;
           }else{
               this.liste_voitures[nbVoitures] = voiture_a_ajouter; //permet d'ajouter la nouvelle voiture dans la liste des voitures du proprio
               nbVoitures+=1; //son nombre de voitures augmente donc
               voiture_a_ajouter.proprietaire = this ; //on ajoute le nom du proprio dans la classe de la voiture
               return true;
           }
       }
    }

}
