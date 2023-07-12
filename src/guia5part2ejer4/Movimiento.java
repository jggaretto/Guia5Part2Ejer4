/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5part2ejer4;

import java.time.LocalDate;

/**
 *
 * @author jgare
 */
class Movimiento {
    private LocalDate fecha;
    private char tipo;
    private double importe;
    private double saldo;

    public Movimiento(LocalDate fecha, char tipo, double importe, double saldo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
        this.saldo = saldo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    // Otros métodos de acceso y mutación para los atributos del movimiento

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Tipo: " + tipo + ", Importe: " + importe + ", Saldo: " + saldo;
    }
}
