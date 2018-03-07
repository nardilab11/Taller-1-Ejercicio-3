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
public class Banco {
    private String codigo;
    private Cuenta[] cuentas;
    private Tipo[] tipos;

    public Banco(String codigo) {
        this.codigo = codigo;
        this.cuentas = new Cuenta[2];
        this.tipos = new Tipo[2];
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public boolean addCuenta(Cuenta cuenta){
        boolean resultado = false;
        for(int i = 0; i < 2; i++){
            if(cuentas[i]==null){
                cuentas[i]=cuenta;
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    public boolean removeCuenta(Cuenta cuenta){
        boolean resultado = false;
        for(int i = 0; i < 2; i++){
            if(cuentas[i]==cuenta){
                cuentas[i]=null;
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    public boolean replaceCuenta(Cuenta cuenta, Cuenta nueva){
        boolean resultado = false;
        for(int i = 0; i < 2; i++){
            if(cuentas[i]==cuenta){
                cuentas[i]=nueva;
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    public Tipo[] getTipo() {
        return tipos;
    }

    public boolean addTipo(Tipo tipo){
        boolean resultado = false;
        for(int i = 0; i < 2; i++){
            if(tipos[i]==null){
                tipos[i]=tipo;
                resultado = true;
                break;
            }
        }
        return resultado;
    }
    
    public boolean removeTipo(Tipo tipo){
        boolean resultado = false;
        for(int i = 0; i < 2; i++){
            if(tipos[i]==tipo){
                tipos[i]=null;
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    public boolean replaceTipo(Tipo tipo, Tipo nueva){
        boolean resultado = false;
        for(int i = 0; i < 2; i++){
            if(tipos[i]==tipo){
                tipos[i]=nueva;
                resultado = true;
                break;
            }
        }
        return resultado;
    }
}
