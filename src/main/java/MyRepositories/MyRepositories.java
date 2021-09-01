package MyRepositories;

import com.example.Spotreefy.Brano;
import com.example.Spotreefy.Playlist;
import com.example.Spotreefy.Utente;

import java.util.*;

public class MyRepositories {

    Map<String, Playlist> playlistMap = new HashMap<>();
    Map<String, Utente> utenti= new HashMap<>();
    Map<Utente, List<Playlist>> playlistutente = new HashMap<>();
    Set<Playlist> insiemeplaylist = new HashSet<>();
    Map<Integer,Brano> insiemeBrani = new HashMap<>();


    public Map<String, Utente> getUtenti() {
        return utenti;
    }

    public void setUtenti(Map<String, Utente> utenti) {
        this.utenti = utenti;
    }

    public Map<Utente, List<Playlist>> getPlaylistutente() {
        return playlistutente;
    }

    public void setPlaylistutente(Map<Utente, List<Playlist>> playlistutente) {
        this.playlistutente = playlistutente;
    }

    public Set<Playlist> getInsiemeplaylist() {
        return insiemeplaylist;
    }

    public void setInsiemeplaylist(Set<Playlist> insiemeplaylist) {
        this.insiemeplaylist = insiemeplaylist;
    }

    public Map<Integer, Brano> getInsiemeBrani() {
        return insiemeBrani;
    }

    public void setInsiemeBrani(Map<Integer, Brano> insiemeBrani) {
        this.insiemeBrani = insiemeBrani;
    }

    public Map<String, Playlist> getPlaylistMap() {
        return playlistMap;
    }

    public void setPlaylistMap(Map<String, Playlist> playlistMap) {
        this.playlistMap = playlistMap;
    }
}
