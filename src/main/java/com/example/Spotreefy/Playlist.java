package com.example.Spotreefy;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private String ID;
    private String nome;
    private String emailProprietario;
    private List<Brano> listabrani= new ArrayList<>();



    public Playlist(String nome,String emailProprietrio, List<Brano> listabrani){
    this.nome=nome;
    this.emailProprietario =emailProprietrio;
    this.listabrani=listabrani;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailProprietario() {
        return emailProprietario;
    }

    public void setEmailProprietario(String emailProprietario) {
        this.emailProprietario = emailProprietario;
    }

    public List<Brano> getListabrani() {
        return listabrani;
    }

    public void setListabrani(List<Brano> listabrani) {
        this.listabrani = listabrani;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
