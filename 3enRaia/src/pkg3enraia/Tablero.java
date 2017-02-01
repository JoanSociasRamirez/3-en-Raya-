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
public class Tablero {

    private String casillas[][] = new String[3][3];

    public Tablero() {
        int fil, col;
        for (fil = 0; fil < 3; fil++) {
            for (col = 0; col < 3; col++) {
                this.casillas[fil][col] = "-";
            }
        }
    }

    public String[][] getCasillas() {
        return casillas;
    }

    public void setCasillas(String[][] casillas) {
        this.casillas = casillas;
    }

    private void ponerFicha(posicion p, String f) {
        this.casillas[p.getFil()][p.getCol()] = f;
    }

    private boolean validarMovimiento(posicion p) {
        return this.casillas[p.getCol()][p.getFil()].equals("-");
    }

    //muestra el tablero por consola.
    public void mostrar() {
        int fil, col;
        for (fil = 0; fil < 3; fil++) {
            for (col = 0; col < 3; col++) {
                System.out.print(this.casillas[fil][col] + " ");
            }
            System.out.println();

        }
    }

    public void tipoFicha() {

    }
    //consulta una posicion, DEVUELVE una posicion del tablero.
    //   public String consultar(int fil, int col) {

    public String consultar(posicion p) {
        return this.casillas[p.getFil()][p.getCol()];
    }

    private boolean completo() { //verifica si el tablero esta completo
        
        int contarVacias, col, fil;

        contarVacias = 0;

        for (fil = 0; fil < 3; fil++) 
            for (col = 0; col < 3; col++) 
                if (this.casillas[fil][col] .equals ("-")) 
                    contarVacias++;
                return (contarVacias == 0);
            
        }
}

