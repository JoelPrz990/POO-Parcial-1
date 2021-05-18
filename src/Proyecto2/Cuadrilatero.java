/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto2;

/**
 *
 * @author Joel
 */

public abstract class Cuadrilatero {
    protected int coordenada1X;
    protected int coordenada1Y;
    protected int coordenada2X;
    protected int coordenada2Y;
    protected int coordenada3X;
    protected int coordenada3Y;
    protected int coordenada4X;
    protected int coordenada4Y;

    public Cuadrilatero(int coordenada1X, int coordenada1Y, int coordenada2X, int coordenada2Y, int coordenada3X, int coordenada3Y, int coordenada4X, int coordenada4Y) {
        this.coordenada1X = coordenada1X;
        this.coordenada1Y = coordenada1Y;
        this.coordenada2X = coordenada2X;
        this.coordenada2Y = coordenada2Y;
        this.coordenada3X = coordenada3X;
        this.coordenada3Y = coordenada3Y;
        this.coordenada4X = coordenada4X;
        this.coordenada4Y = coordenada4Y;
    }
    Cuadrilatero() {
    }
    public abstract void areaFigura();  
}
