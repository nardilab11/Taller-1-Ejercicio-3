/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.taller1.banco.vista;

import edu.unal.poo.taller1.banco.modelo.Banco;
import edu.unal.poo.taller1.banco.modelo.Movimiento;
import edu.unal.poo.taller1.banco.modelo.Cuenta;
import edu.unal.poo.taller1.banco.modelo.Tipo;
/**
 *
 * @author Nicolás
 */
public class Main {
    public static void main(String[] args) {
        Banco banco1 = new Banco("Davivienda");
        Tipo tipo1 = new Tipo("Consignacion");
        Tipo tipo2 = new Tipo("Retiro");
        Cuenta cuenta1 = new Cuenta(93,21000,11,12,1999,"Nicolás");
        Cuenta cuenta2 = new Cuenta(85,30000,04,03,2001,"Manuel");
        banco1.addCuenta(cuenta1);
        banco1.addCuenta(cuenta2);
        Movimiento movimiento1 = new Movimiento(06,03,2018,21000,3000,tipo1);
        Movimiento movimiento2 = new Movimiento(05,03,2018,30000,10000,tipo2);
        cuenta1.addMovimiento(movimiento1);
        cuenta2.addMovimiento(movimiento2);
        banco1.getCuentas();
    }
}