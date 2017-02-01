/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraia;

/**
 *
 * @author dam1a26
 */
public class posicion {
    int fil, col;

    public posicion(int fil, int col) {
        this.fil = fil;
        this.col = col;
    }

    posicion() {
       
    }

    public void setFil(int fil) {
        this.fil = fil;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getFil() {
        return fil;
    }

    public int getCol() {
        return col;
    }
}
