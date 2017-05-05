/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/* Jakis progrm testowy dla class */

package telefon;

/**
 *
 * @author Strengol
 */
 class Telefon {

    /**
     * @param args the command line arguments
     */
    
    private final String NumerTelefonu;
    public int CzasRozmowy;
    public static double CenaRozmowy = 0.18;
    
    //deklaracja metod
    public double KwotaDoZapłaty(){
        return CzasRozmowy * CenaRozmowy/60;
    }
    
    public void Dzwon(String Nr){
        System.out.println("Wybrany numer" + Nr);
        CzasRozmowy=(int)(Math.random()*3600);
    }
    
    //deklaracje konstruktorów
    public Telefon (String NrTel){
        NumerTelefonu = NrTel;
        CzasRozmowy =0;
        }
    

 }
    
class TelKom extends Telefon{
    String operator;
            //konstruktor
            public TelKom(String NrTel, String Op) {
                super(NrTel);
                operator = Op;
            }
            
            //metody
    public void SMS( String NrTel, String Tresc){
        System.out.println("Do : " +NrTel);
        System.out.println("Tresc: " +Tresc);
    }

}

    
public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        
Telefon TelefonPatryka = new Telefon("888 888 888");

TelefonPatryka.Dzwon( "111 222 333");
System.out.println("do zapłaty "+TelefonPatryka.KwotaDoZapłaty());
System.out.println(" ");


// nie moge zaimplementowac Gosi nie pamietam co zrobic 
TelKom TelefonGosi = new TelKom("111","orange");
TelefonGosi.SMS("111 222 333", "siema to ja gosia");


    
}

}