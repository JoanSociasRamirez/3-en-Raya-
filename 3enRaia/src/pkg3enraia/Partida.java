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
public class Partida {
 
private int turnoActual, Marcador, Tablero, jugadores, movimiento;
int jugadores2 [][];

    public void setJugadores(int jugadores) {
        this.jugadores = jugadores;
    }

    public int getJugadores() {
        return jugadores;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    public Partida(int jugadores) {
        this.jugadores2 = new int[][]{null, null};
        this.jugadores = jugadores;
    }

    public void setTurnoActual(int turnoActual) {
        this.turnoActual = turnoActual;
    }

    public void setMarcador(int Marcador) {
        this.Marcador = Marcador;
    }

    public void setTablero(int Tablero) {
        this.Tablero = Tablero;
    }

    public int getMarcador() {
        return Marcador;
    }

    public int getTablero() {
        return Tablero;
    }

    public Partida(int turnoActual, int Marcador, int Tablero) {
        this.jugadores2 = new int[][]{null, null};
        this.turnoActual = turnoActual;
        this.Marcador = Marcador;
        this.Tablero = Tablero;
    }

    public Partida(String turnoActual) {
        this.jugadores2 = new int[][]{null, null};
        this.turnoActual = 0;
    }

    public Partida() {
        this.jugadores2 = new int[][]{null, null};
    }
    

    public int getTurnoActual() {
        return turnoActual;
    }

    public void setTurnoActual(String turnoActual) {
        this.turnoActual = 0;
    }

    private void iniciar(){
        
    }
    
    private void salir(){
        
    }
    
    public void jugadores() {
      
    }
    
    private void comprobarGanador(){
        
    }
    
    private void movimiento () {
        
    }
    
    private void jugar(){ //bucle q continua hasta FInaliza Hasta el tablero esta completo o hay ganador
                
        posicion p; //arrayizar
        
        turnoActual=0;
        boolean partidaFinalizada = false;
        
        while (!partidaFinalizada){
            p = this.jugadores[turnoActual].movimiento();
            
            if (this.Tablero.validarMovimiento(p)){
                this.Tablero.ponerFicha(p.this.jugadores[turnoActual]gettipoFicha);
            }
            else{
                partidaFinalizada=true;
                this.marcador.comprobarGanador(this.jugadores[(turnoActual++) %2]);
            }
            
            if (!partidaFinalizada){
                System.out.println("hi");
            }
        }
    }
    
}
