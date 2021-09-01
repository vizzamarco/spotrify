package com.example.Spotreefy;

import java.util.*;

public class Utente {
    private String ID;
    private String email;
    private String nome;
    private LinkedList<Brano> codariproduzione= new LinkedList<>();
    private HashMap<Brano,Integer> storico = new HashMap<>();
    private Set<String> follower= new HashSet<>();




    public Utente(String email,String nome){
        setEmail(email);
        setNome(nome);

    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LinkedList<Brano> getCodariproduzione() {
        return codariproduzione;
    }

    public void setCodariproduzione(LinkedList<Brano> codariproduzione) {
        this.codariproduzione = codariproduzione;
    }

    public HashMap<Brano, Integer> getStorico() {
        return storico;
    }

    public void setStorico(HashMap<Brano, Integer> storico) {
        this.storico = storico;
    }

    public Set<String> getFollower() {
        return follower;
    }

    public void setFollower(Set<String> follower) {
        this.follower = follower;
    }



}
