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
class Cliente {
     private String nombre;
    private String apellido;
    private String localidad;
    private LocalDate fNacimiento;

    public Cliente(String nombre, String apellido, String localidad, LocalDate fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.localidad = localidad;
        this.fNacimiento = fNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Otros métodos de acceso y mutación para los atributos del cliente
}

