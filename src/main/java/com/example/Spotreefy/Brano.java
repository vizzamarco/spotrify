package com.example.Spotreefy;

import java.util.Objects;

public class Brano {
    private String ID;
    private String titolo;
    private String autore;
    private Genere genere;




    public Brano(String titolo, String autore){
        this.titolo=titolo;
        this.autore=autore;

    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brano brano = (Brano) o;
        return Objects.equals(ID, brano.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}

