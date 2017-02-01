/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraia;
import java.util.Scanner;
/**
 *
 * @author dam1a26
 */
public class Jugador {
    
private String tipoFicha;
private int posicion, movimiento;

    public Jugador(String tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public Jugador() {
    }

    public String getTipoFicha() {
        return tipoFicha;
    }

    public void setTipoFicha(String tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public posicion movimiento(){ //jugador dice donde quiere mover
       
        int fil, col;
        posicion p = new posicion();
        Scanner sc = new Scanner (System.in);
        System.out.println("Fila ->");
        fil = sc.nextInt();
        System.out.println("Columna ->");
        col = sc.nextInt();
        p.setFil(fil);
        p.setCol(col);
        return p;
    }
    
}
