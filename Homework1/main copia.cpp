/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/main.cc to edit this template
 */

/* 
 * File:   main.cpp
 * Author: luigicirillo
 *
 * Created on 12 marzo 2024, 14:08
 */

#include "magazzino.h"
using namespace std;

int main() {
    vettore magazzino;
    int riempimento = 0;
    int scelta;

    do {
        cout << "Scegli un'operazione:\n";
        cout << "1. Inizializza Magazzino Vuoto\n";
        cout << "2. Inizializza Magazzino\n";
        cout << "3. Visualizza Magazzino\n";
        cout << "4. Modifica Codice\n";
        cout << "5. Elimina Prodotto\n";
        cout << "6. Inserisci Prodotto\n";
        cout << "7. Stampa Magazzino su File\n";
        cout << "0. Esci\n";
        cout << "Scelta: ";
        cin >> scelta;

        switch (scelta) {
            case 1:
                Inizializza_Magazzino_vuoto(riempimento);
                break;

            case 2:
                Inizializza_Magazzino(riempimento, magazzino);
                break;

            case 3:
                cout << "Magazzino attuale:\n";
                Visualizza_Magazzino(magazzino, riempimento);
                break;

            case 4:
                if (riempimento > 0) {
                    int posizioneModifica;
                    cout << "Inserisci la posizione del prodotto da modificare: ";
                    cin >> posizioneModifica;
                    string nuovoCodice;
                    do {
                        cout << "Inserisci il nuovo codice: ";
                        cin >> nuovoCodice;
                        int esiste = Cerca_Codice_Prodotto(nuovoCodice, magazzino, riempimento);
                        if (esiste != -1) {
                            cout << "Il codice è già presente nel magazzino. Inserisci un codice diverso.\n";
                        }
                    } while (Cerca_Codice_Prodotto(nuovoCodice, magazzino, riempimento) != -1);
                    Modifica_Codice(magazzino[posizioneModifica - 1], nuovoCodice);
                    cout << "Magazzino dopo la modifica:\n";
                    Visualizza_Magazzino(magazzino, riempimento);
                } else {
                    cout << "Il magazzino è vuoto. Impossibile modificare il prodotto.\n";
                }
                break;

            case 5:
                if (riempimento > 0) {
                    int posizioneElimina;
                    cout << "Inserisci la posizione del prodotto da eliminare: ";
                    cin >> posizioneElimina;
                    Elimina_Prodotto(posizioneElimina - 1, riempimento, magazzino);
                    cout << "Magazzino dopo l'eliminazione:\n";
                    Visualizza_Magazzino(magazzino, riempimento);
                } else {
                    cout << "Il magazzino è vuoto. Impossibile eliminare il prodotto.\n";
                }
                break;

            case 6:
                if (riempimento < DIM) {
                    int posizioneInserisci;
                    cout << "Inserisci la posizione in cui inserire il nuovo prodotto: ";
                    cin >> posizioneInserisci;
                    Inserisci_Prodotto(posizioneInserisci - 1, riempimento, magazzino);
                } else {
                    cout << "Il magazzino è pieno. Impossibile inserire il prodotto.\n";
                }
                break;

            case 7:
                Stampa_Magazzino_File(magazzino, riempimento);
                break;

            case 0:
                cout << "Uscita dal programma.\n";
                break;

            default:
                cout << "Scelta non valida. Riprova.\n";
        }

    } while (scelta != 0);

    return 0;
}


