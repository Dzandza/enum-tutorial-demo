package ba.unsa.etf.rpr;

public class Main {

    //Demonstracija rada sa enumima
    //Vise o enumima na linku: https://www.geeksforgeeks.org/enum-in-java/


    public static void main(String[] args) {
        //Konstruktor koji prima kod boje kao parametar
        NewClass k = new NewClass("y");

        //Konstruktor koji prima naziv enuma kao parametar.
        //Potrebno zakomentarisati konstruktor u linijama 34, 35, 36 u fajlu NewClass.java.
        //Zakomentarisati prethodnu inicijalizaciju
        //Odkomentarisati konstruktor u linijama 40, 41, 42
        //Odkomentarisati sljedeću inicijalizaciju

//        NewClass k = new NewClass("RED");

        System.out.println(k.getColor());
    }
}
