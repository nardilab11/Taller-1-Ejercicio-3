/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.taller1.banco.modelo;

/**
 *
 * @author Nicolás
 */
public class Cuenta {
    private int numero;
    private double saldo;
    private int diaCreacion;
    private int mesCreacion;
    private int annioCreacion;
    private String cliente;
    private Movimiento[] movimientos;

    public Cuenta(int numero, double saldo, int diaCreacion, int mesCreacion, int annioCreacion, String cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.diaCreacion = diaCreacion;
        this.mesCreacion = mesCreacion;
        this.annioCreacion = annioCreacion;
        this.cliente = cliente;
        this.movimientos = new Movimiento[2];
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getDiaCreacion() {
        return diaCreacion;
    }

    public void setDiaCreacion(int diaCreacion) {
        this.diaCreacion = diaCreacion;
    }

    public int getMesCreacion() {
        return mesCreacion;
    }

    public void setMesCreacion(int mesCreacion) {
        this.mesCreacion = mesCreacion;
    }

    public int getAnnioCreacion() {
        return annioCreacion;
    }

    public void setAnnioCreacion(int annioCreacion) {
        this.annioCreacion = annioCreacion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public Movimiento[] getMovimientos() {
        return movimientos;
    }

    public boolean addMovimiento(Movimiento movimiento){
        boolean resultado = false;
        for(int i = 0; i < 2; i++){
            if(movimientos[i]==null){
                movimientos[i]=movimiento;
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    public boolean removeMovimiento(Movimiento movimiento){
        boolean resultado = false;
        for(int i = 0; i < 2; i++){
            if(movimientos[i]==movimiento){
                movimientos[i]=null;
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    public boolean replaceMovimiento(Movimiento movimiento, Movimiento nuevo){
        boolean resultado = false;
        for(int i = 0; i < 2; i++){
            if(movimientos[i]==movimiento){
                movimientos[i]=nuevo;
                resultado = true;
                break;
            }
        }
        return resultado;
    }
}
