/*## SpoTreefy

Progettare un sistema per gestire un'app di streaming di musica

L'app permette agli utenti di registrarsi con email e nome

I brani della libreria hanno titolo, autore, genere

Un utente ha una coda di riproduzione, che rappresenta la lista dei brani da riprodurre
* Un utente può aggiungere un brano in fondo alla coda
* Oppure può decidere di riprodurlo subito, mettendolo in testa alla coda di riproduzione
(la riproduzione di un brano può essere realizzata semplicemente rimuovendo il brano dalla testa della coda di riproduzione)

Un utente può seguire un altro utente (tipo follow twitter)

Un utente può creare una playlist, che ha
* nome
* lista dei brani
* l'utente può aggiungere e rimuovere brani dalla playlist
* l'utente può condividere la playlist con altri utenti
* Ma solo il proprietario può modificare i brani e cancellare la playlist

Il sistema deve permettere di ottenere il prossimo brano che deve essere riprodotto per un utente


# Funzioni Bonus 1
* Storico: dato un utente **u**, voglio ottenere i brani ascoltati dall'utente **u** ordinati da quello più ascoltato a quello meno ascoltato
* Playlist: dato un utente **u** voglio ottenere la playlist più ascoltata. Per ogni playlist calcolare la somma degli ascolti dei brani contenuti in essa.

# Funzioni Bonus 2 (difficile)
* Discover: dato un utente **u** e un intero **k** > 0, voglio ottenere **k** brani che non sono mai stati ascoltati dall'utente **u** che però compaiono in almeno una playlist di un utente seguito dall'utente **u**
* Recommendation: dato un utente **u** e un intero **k**, voglio ottenere le **k** playlist più rilevanti per l'utente **u**. Ogni playlist deve avere un "punteggio" di rilevanza: una playlist ottiene 1 punto di "rilevanza" per ogni brano contenuto in essa che è stato ascoltato dall'utente **u**. Non vanno considerate le playlist create dall'utente **u**.
* Recommendation++: cambiare il calcolo del punteggio di rilevanza, un brano ascoltato dall'utente **u** vale tanti punti di rilevanza quante volte è stato ascoltato dall'utente **u**. */








package com.example.Spotreefy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpotreefyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpotreefyApplication.class, args);
	}

}
