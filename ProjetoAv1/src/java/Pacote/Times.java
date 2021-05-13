/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote;

/**
 *
 * @author Diego
 */
public class Times {
  
    private String time;
    private int mundial;   
    private int campeoes;
    private int euro;
    
    public Times(String time, int mundial, int campeoes, int euro) {
        this.time = time;
        this.mundial = mundial;
        this.campeoes = campeoes;
        this.euro = euro;
    }
    
        public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMundial() {
        return mundial;
    }

    public void setMundial(int mundial) {
        this.mundial = mundial;
    }

    public int getCampeoes() {
        return campeoes;
    }

    public void setCampeoes(int campeoes) {
        this.campeoes = campeoes;
    }

    public int getEuro() {
        return euro;
    }

    public void setEuro(int euro) {
        this.euro = euro;
    }  
    
}

