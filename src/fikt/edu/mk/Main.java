package fikt.edu.mk;

import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Covek ilija = new Covek(15, "Ilija", "Jol");
        Covek c = new Covek();
        c.setPrezime("Ilija");
        c.setIme("Jol");
        c.setGodini(2);
        ilija.DodajBratSestra(c);

        System.out.println("Sporedba: " + ilija.toString().indexOf("drug str"));
        //StringTokenizer str = new StringTokenizer(ilija.toString());
        StringBuffer strbuf = new StringBuffer();

        strbuf.append(4);
        strbuf.append("ilija");
        strbuf.append(4.7);
        strbuf.append(true);
        System.out.println("strbuf: " + strbuf.toString());
        System.out.println(ilija);
        System.out.println(c);


        //Nizi od objekti
        Covek [] nizaOdLugje;
        nizaOdLugje = new Covek[3];
        nizaOdLugje[0] = ilija;
        nizaOdLugje[1] = c;
        nizaOdLugje[2] = new Covek(21,"nov", "objekt");
        System.out.println(nizaOdLugje[2].toString());



        //hashcode primer
        System.out.println("Hashcode na ilija: " + ilija.hashCode());
        System.out.println("Hashcode na     c: " + c.hashCode());
    }
}
