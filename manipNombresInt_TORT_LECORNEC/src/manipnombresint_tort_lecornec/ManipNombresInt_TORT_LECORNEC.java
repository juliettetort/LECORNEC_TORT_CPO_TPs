/*
 TP1 
Tort Juliette
LECORNEC Guillaume
 */
package manipnombresint_tort_lecornec;
import java.util.Scanner;
 /*
 *public staticfloat quon remplace par doubleF2...
 * @author 33782
 */
public class ManipNombresInt_TORT_LECORNEC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1;
        int nb2;
        Scanner sc;
        sc=new Scanner(System.in);
        nb1=sc.nextInt();
        nb2=sc.nextInt();
        System.out.println("votre nb1 est" +nb1);
        System.out.println("votre nb1 est" +nb2);
        int nb3;
        int nb4;
        int nb5;
        nb3=nb1+nb2;
        nb4=nb2-nb1;
        nb5=nb1*nb2;
        System.out.println(nb1+ "+"+ nb2+"="+nb3);
        System.out.println(nb2+ "-" +nb1+"="+nb4);
        System.out.println(nb1+ "*" +nb2+"="+nb5);
        System.out.println(nb1+"/"+nb2+"="+nb1/nb2);
        System.out.println(nb1+"%"+nb2+"="+nb1%nb2);
    }
    
}
