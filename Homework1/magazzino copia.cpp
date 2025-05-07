/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/file.cc to edit this template
 */
#include "magazzino.h"
#include <fstream>

void Inserisci_Dati_Prodotto(prodotto& p) {
    cout << "Inserisci il codice del prodotto: ";
    cin >> p.codice;
    cout << "Inserisci il genere del prodotto: ";
    cin >> p.genere;
    cout << "Inserisci la quantità del prodotto: ";
    cin >> p.qta;
}

void Modifica_Codice(prodotto& p, const string& nuovoCodice) {
    p.codice = nuovoCodice;
}

string Fornisci_Codice(const prodotto p) { 
    return p.codice;
}

void Visualizza_DatiProdotto(const prodotto p) {
    cout << "Codice: " << p.codice << endl;
    cout << "Genere: " << p.genere << endl;
    cout << "Quantità: " << p.qta << endl;
}

void Inizializza_Magazzino_vuoto(int& riemp) {
    riemp = 0;
}

void Inizializza_Magazzino(int& riemp, vettore magazzino) {
    do {
        cout << "Inserisci il numero di prodotti da inserire nel magazzino: ";
        cin >> riemp;
        if (riemp <= 0 || riemp > DIM) {
            cout << "Errore! Inserisci un valore compreso tra 1 e " << DIM << endl;
        }
    } while(riemp<0 && riemp>DIM);
    for (int i=0; i<riemp; i++) {
        prodotto p;
        cout << "Inserisci i dati del prodotto " << i+1 << endl;
        Inserisci_Dati_Prodotto(p);
        if (Cerca_Codice_Prodotto(p.codice, magazzino, riemp) == -1) {
            magazzino[i] = p;
        } else {
            cout << "Il prodotto è già presente nel magazzino." << endl;
            i--;
        }
    }  
}

int Cerca_Codice_Prodotto(const string& codice, const vettore magazzino, int riemp) {
    for (int i=0; i<riemp; i++) {
        if (magazzino[i].codice == codice) {
            return i;
        }
    }
    return -1;
}
void Elimina_Prodotto(int posizione, int& riemp, vettore magazzino) {
    if (posizione >= 0 && posizione < riemp) {
        for (int i = posizione; i < riemp - 1; i++) {
            magazzino[i] = magazzino[i + 1];
        }
        riemp--;
        cout << "Prodotto eliminato correttamente." << endl;
    } else {
        cout << "Posizione non valida." << endl;
    }
}

void Inserisci_Prodotto(int posizione, int& riemp, vettore magazzino) {
    if (posizione < 0 || posizione >= riemp) {
        cout << "Posizione non valida." << endl;
        return;
    }
    if (riemp >= DIM) {
        cout << "Il magazzino è pieno. Impossibile inserire il prodotto." << endl;              
        return;
    }
    prodotto p;
    Inserisci_Dati_Prodotto(p);
    int indx = Cerca_Codice_Prodotto(p.codice, magazzino, riemp);
    if  (indx == -1) {
        for(int i = riemp; i > posizione; i--) {
            magazzino[i] = magazzino[i - 1];
        }
        magazzino[posizione] = p;
        riemp++;
        cout << "Prodotto inserito correttamente." << endl;
    } else {
        cout << "Il prodotto è già presente nel magazzino." << endl;
    }   
}

void Visualizza_Magazzino(const vettore magazzino, int riemp) {
    for (int i=0; i<riemp; i++) {
        cout << "Prodotto " << i+1 << ": ";
        Visualizza_DatiProdotto(magazzino[i]);
        cout<<endl;
    }
}

void Stampa_Magazzino_File(const vettore magazzino, int riemp) {
    fstream file;
    file.open("magazzino.txt", ios::out);
    if (file.is_open()) {
        file << riemp << endl;
        for (int i = 0; i < riemp; i++) {
            file << magazzino[i].codice << " " << magazzino[i].genere << " " << magazzino[i].qta << endl;
        }
        file.close();
        cout << "Magazzino stampato correttamente su file." << endl;
    } else {
        cout << "Impossibile aprire il file." << endl;
    }
}
