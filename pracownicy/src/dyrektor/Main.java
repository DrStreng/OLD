package dyrektor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Strengol
 */
 class Pracownicy {

    /**
     * @param args the command line arguments
     */
    public String Nazwisko;
    public String Imie;
    public float Wynagrodzenie;
    public float Stazpracy;
    
    //konstruktor klasy pracownicy
    
    public Pracownicy(String naz,String im,float wyn,float staz){
        Nazwisko = naz;
        Imie = im;
        Wynagrodzenie = wyn;
        Stazpracy = staz;
    }
    
    //metoda wyswietlajaca wszystkie dane
    public void wyswietl(){
        System.out.println("Nazwisko : "+Nazwisko);
        System.out.println("Imie : "+Imie);
        System.out.println("Wynagrodzenie : "+Wynagrodzenie +" zl");
        System.out.println("Staz pracy : "+Stazpracy+ " lat");
    }
    //jakas metoda dzialajaca na danych
    public double zwrocdane(){
        if(Stazpracy<=20){
            return(Stazpracy*Wynagrodzenie)/100;
        }else{
            return(0.2*Wynagrodzenie);
        }
    }
 }
    class Dyrektor extends Pracownicy{
      public float Dodatek;
      
      //konstruktor
      public Dyrektor(String naz,String im,float wyn,float staz,float dod){
          super(naz,im,wyn,staz);
          Dodatek = dod;
      }
      
              public void wyswietl2(){
            System.out.println(Nazwisko +" "+Imie+ "\nWynagrodzenie: "+Wynagrodzenie+"zł\nStaż pracy: "+Stazpracy+" lat\nDodatek Stażowy: "+Dodatek+"zł");   
    }
    }
 
    public class Main 
    {
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Dyrektor dyrek1 = new Dyrektor("Streng","Dawid",7000,10,2000);
        dyrek1.wyswietl2();
        
        
        Pracownicy a1 = new Pracownicy("Kropidlo","Sebastian",800,3);
        a1.wyswietl();
        System.out.println("Dodatkowe wynagrodzenie za staz pracy "+a1.zwrocdane()+" zl");

        
    }
    
}
