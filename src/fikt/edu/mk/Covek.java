package fikt.edu.mk;

import java.util.ArrayList;
import java.util.Objects;

public class Covek {
    private int godini;
    private String ime;
    private String prezime;

    public List<Covek> getBrakjaSestri() {
        return brakjaSestri;
    }

    public void setBrakjaSestri(List<Covek> brakjaSestri) {
        this.brakjaSestri = brakjaSestri;
    }

    private ArrayList<Covek> brakjaSestri;

    @Override
    public String toString() {
        return "Covek so vrednosti: {" +
                "godini=" + godini +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }

    public Covek(int godini, String ime, String prezime) {
        this.godini = godini;
        this.ime = ime;
        this.prezime = prezime;
        this.brakjaSestri = new ArrayList<Covek>();
    }

    public void DodajBratSestra(Covek covek){
        this.brakjaSestri.add(covek);
    }

    public Covek() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Covek covek = (Covek) o;
        return godini == covek.godini &&
                Objects.equals(ime, covek.ime) &&
                Objects.equals(prezime, covek.prezime);
    }

    @Override
    public int hashCode() {
        return this.ime.hashCode()*45 + this.prezime.hashCode()+ this.godini;
    }

    public void setGodini(int godini) {
        this.godini = godini;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodini() {
        return godini;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }
}
