/*
 En java, Dado el siguiente modelo implementar según la consigna.

Cuenta:
-numero:long
-saldo:double
-interesAnual:double
-titular:Cliente
-movimientos:LinkedList<Movimiento>
+Cuenta(nro:long, titular:Cliente)
+depositar(cantidad:double):void
+extraer(cantidad:double):void
+cambiarInteresAnual(valor:double):void
+verTitular():Cliente
+verSaldo():double
+listarMovimientos():void
--------------------------------------------
Cliente:
-nombre:String
-apellido:String
-localidad:String
-fNacimiento:LocalDate
+Cliente(nom:String,ape:String,loc:String,fNac:LocalDate)
+getNombre():String
+setNombre(nom:String):void
.......
.......
--------------------------------------------
Movimiento:
-fecha:Localdate
-tipo:char
-importe:double
-saldo:double
+Movimiento(fecha:LocalDate,tipo:char,importe:double,saldo:double)
+getFecha():LocalDate
+setFecha(fecha:LocalDate):void
.......
.......


Descripción de los métodos de la clase Cuenta:
 depositar(cantidad)  Recibe la cantidad de dinero que incrementará el saldo de la
cuenta y registra el movimiento “D”(Depósito)
 extraer(cantidad) Recibe la cantidad de dinero a extraer que disminuirá el saldo de la
cuenta y registra el movimiento “E” (Extracción). Ojo!!! Solo extraerá dinero si hay saldo
suficiente.
 cambiarInteresAnual(valor) Establecerá el nuevo interés anual de la cuenta.
 verTitular():ClienteRetornará el Cliente titular de la cuenta
 verSaldo():doubleRetornará el saldo actual de la cuenta.
 listarMovimientos():voidMostrará por consola todos lo movimientos en el orden en el
que fueron ejecutados.

Desde el método main de una clase Test, se pide:
- Crear el cliente Juan Lucero de la localidad de Merlo, nacido el 25/07/1978
- Crear una cuenta nro 1234 para el cliente creado en el punto anterior.
- Depositar en la cuenta 60.000 (sesenta mil) pesos.
- Extraer de la cuenta 10.000 (diez mil) pesos.
- Mostrar por consola el saldo de dicha cuenta.
- Mostrar usando el método de cuenta todos los movimientos.
 */
package guia5part2ejer4;

import java.time.LocalDate;


public class Guia5Part2Ejer4 {

    
    public static void main(String[] args) {
         Cliente juanLucero = new Cliente("Juan", "Lucero", "Merlo", LocalDate.of(1978, 7, 25));
        Cuenta cuenta = new Cuenta(1234, juanLucero);

        cuenta.depositar(60000);
        cuenta.extraer(10000);

        System.out.println("Saldo de la cuenta: " + cuenta.verSaldo());
        System.out.println("Movimientos de la cuenta:");
        cuenta.listarMovimientos();
    }
    
}
