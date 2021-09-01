package com.example.Spotreefy.MyService;

import MyRepositories.MyRepositories;
import com.example.Spotreefy.Brano;
import com.example.Spotreefy.Playlist;
import com.example.Spotreefy.Utente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class MyService {

    private MyRepositories myrepo;

    @Autowired
    public MyService(MyRepositories myrepo) {
        this.myrepo = myrepo;
    }


    public Utente nuovoUtente(String email, String nome) {

        if (!myrepo.getUtenti().containsKey(email)) {
            Utente nuovo = new Utente(email, nome);
            myrepo.getUtenti().put(nuovo.getEmail(), nuovo);

            myrepo.getPlaylistutente().put(nuovo, new ArrayList<>());
            return nuovo;
        }

        return null;

    }


    public void nuovaPlaylist(String nome, String email, List<Brano> brani) {

        Playlist nuova = new Playlist(nome, email, brani);
        myrepo.getInsiemeplaylist().add(nuova);

    }


    public void aggiungiBranoplaylist(String email, String playlist, Brano brano) {
        if (myrepo.getPlaylistMap().containsKey(playlist) && myrepo.getPlaylistMap().get(playlist).getEmailProprietario().equals(email)) {
            myrepo.getPlaylistMap().get(playlist).getListabrani().add(brano);
        }

    }


    public void rimuobiBranoplaylist(String email, String playlist, Brano brano) {
        if (myrepo.getPlaylistMap().containsKey(playlist) && myrepo.getPlaylistMap().get(playlist).getEmailProprietario().equals(email) && myrepo.getPlaylistMap().get(playlist).getListabrani().contains(brano)) {
            myrepo.getPlaylistMap().get(playlist).getListabrani().remove(brano);
        }


    }

    public void riproduciProssimoBrano() {
        for (Utente ut : myrepo.getPlaylistutente().keySet()) {
            ut.getCodariproduzione().poll();
        }
    }

    public void aggiungiBranoCoda(Brano brano) {
        for (Utente ut : myrepo.getPlaylistutente().keySet()) {
            ut.getCodariproduzione().addLast(brano);
        }
    }

    public void segui(String email1, String email2) {
        if (myrepo.getUtenti().containsKey(email1)) {


        myrepo.getUtenti().get(email2).getFollower().add(email1);
    }

}


public void rimuovisegui(String email1,String email2){
        if(!myrepo.getUtenti().containsKey(email1)){
            myrepo.getUtenti().get(email2).getFollower().remove(email1);
        }
}


    public List<Brano> ottieniBranipiuAscoltati(Utente utente) {


    }
}