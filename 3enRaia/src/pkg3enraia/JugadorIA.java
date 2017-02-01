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
public class JugadorIA extends Jugador {

 
    private int inteligencia;

    public JugadorIA(int inteligencia, String tipoFicha) {
        super(tipoFicha);
        this.inteligencia = inteligencia;
    }

    public JugadorIA(int inteligencia) {
        this.inteligencia = inteligencia;
    }
    
    @Override
    public posicion movimiento() { 
        
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
