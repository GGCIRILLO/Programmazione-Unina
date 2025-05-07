/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package utilities;
import gestioneprodotti.PilaProdotti;
/**
 *
 * @author luigicirillo
 */
public interface Searchable {
    public boolean searchForName(String name);
    public boolean searchForCode(String codice);
}
