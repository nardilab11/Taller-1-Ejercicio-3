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
public class Movimiento {
    private int dia;
    private int mes;
    private int annio;
    private double saldoAnterior;
    private double cantidad;
    private Tipo tipo;

    public Movimiento(int dia, int mes, int annio, double saldoAnterior, double cantidad, Tipo tipo) {
        this.dia = dia;
        this.annio = annio;
        this.saldoAnterior = saldoAnterior;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
}
