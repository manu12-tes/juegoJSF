/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.faces.event.ActionEvent;

/**
 *
 * @author manel
 */
@ManagedBean
@ApplicationScoped
public class Ahorcado {
    private ArrayList<Character> letras,advina;
    private String palabra="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    private String ida;
    private String incognita;
    private int dato;
    private Character kar;
    private int intentos;
    /**
     * Creates a new instance of Ahorcado
     */
    public Ahorcado() {
        letras=new ArrayList();
        ida="";
        incognita="";
        advina=new ArrayList();
        dato=0;
        kar=' ';
        intentos=0;
       
    }
    public void inicia_valores(){
        advina=new ArrayList();
        for(int x=0;x<incognita.length();x++){
            advina.add('_');
        }
        ida=new String("");
        letras =new ArrayList();
        kar=new Character(' ');
        for(int l=0;l<palabra.length();l++){
            letras.add(palabra.charAt(l));
        }
    }
    public void actualizar(ActionEvent e){
       ida=e.getComponent().getId();
       Character ka=ida.charAt(0);
       kar=ida.charAt(0);
       int pos=-1;
       for(int l=0;l<palabra.length();l++){
            if((pos=letras.indexOf(ka))!=-1){
            letras.set(pos, '_');
           
           }
           if((pos=incognita.indexOf(kar))!=-1){
            advina.set(pos,kar);
            }  
       }
       intentos--;
        //dato++;
    }

    public ArrayList<Character> getLetras() {
        return letras;
    }

    public void setLetras(ArrayList<Character> letras) {
        this.letras = letras;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getIda() {
        return ida;
    }

    public void setIda(String ida) {
        this.ida = ida;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Character getKar() {
        return kar;
    }

    public void setKar(Character kar) {
        this.kar = kar;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public ArrayList<Character> getAdvina() {
        return advina;
    }

    public void setAdvina(ArrayList<Character> advina) {
        this.advina = advina;
    }

    public String getIncognita() {
        return incognita;
    }

    public void setIncognita(String incognita) {
        this.incognita = incognita;
    }
    
}
