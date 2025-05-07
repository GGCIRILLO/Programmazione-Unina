/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/cppFiles/file.h to edit this template
 */

/* 
 * File:   magazzino.h
 * Author: luigicirillo
 *
 * Created on 12 marzo 2024, 14:12
 */
#ifndef MAGAZZINO_H
#define MAGAZZINO_H

#include <iostream>

using namespace std;

struct prodottoStruct{
    string codice;
    string genere;
    int qta;
};
typedef prodottoStruct prodotto;
const int DIM=10;
typedef prodotto vettore[DIM];



void Inserisci_Dati_Prodotto(prodotto& p);
void Modifica_Codice(prodotto& p, const string& nuovoCodice);
string Fornisci_Codice(const prodotto p);
void Visualizza_DatiProdotto(const prodotto);
void Inizializza_Magazzino_vuoto(int& riemp);
void Inizializza_Magazzino(int& riemp, vettore magazzino);
int Cerca_Codice_Prodotto(const string& codice, const vettore magazzino, int riemp);
void Elimina_Prodotto(int posizione, int& riemp, vettore magazzino);
void Inserisci_Prodotto(int posizione, int& riemp, vettore magazzino);
void Visualizza_Magazzino(const vettore magazzino, int riemp);
void Stampa_Magazzino_File(const vettore magazzino, int riemp);

#endif


