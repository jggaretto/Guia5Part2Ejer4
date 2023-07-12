/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5part2ejer4;

import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author jgare
 */
class Cuenta {
    private long numero;
    private double saldo;
    private double interesAnual;
    private Cliente titular;
    private LinkedList<Movimiento> movimientos;

    public Cuenta(long numero, Cliente titular) {
        this.numero = numero;
        this.titular = titular;
        this.movimientos = new LinkedList<>();
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        Movimiento movimiento = new Movimiento(LocalDate.now(), 'D', cantidad, saldo);
        movimientos.add(movimiento);
    }

    public void extraer(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            Movimiento movimiento = new Movimiento(LocalDate.now(), 'E', cantidad, saldo);
            movimientos.add(movimiento);
        } else {
            System.out.println("Saldo insuficiente para realizar la extracción.");
        }
    }

    public void cambiarInteresAnual(double valor) {
        interesAnual = valor;
    }

    public Cliente verTitular() {
        return titular;
    }

    public double verSaldo() {
        return saldo;
    }

    public void listarMovimientos() {
        for (Movimiento movimiento : movimientos) {
            System.out.println(movimiento.toString());
        }
    }
}
