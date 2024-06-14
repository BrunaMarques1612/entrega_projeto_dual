/*
   Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.controlefinitodeestados;

/**
 *
 * @author bruna
 */



public class ControleFinitoDeEstados {
    
    public enum Estado {
        ESTADO_A,
        ESTADO_B,
        ESTADO_C
    }
    
    private Estado estadoAtual;
    
    public ControleFinitoDeEstados(Estado estadoInicial) {
        this.estadoAtual = estadoInicial;
    }
    
    public Estado getEstadoAtual() {
        return estadoAtual;
    }
    
    public void transicao() {
        switch (estadoAtual) {
            case ESTADO_A:
                estadoAtual = Estado.ESTADO_B;
                break;
            case ESTADO_B:
                estadoAtual = Estado.ESTADO_C;
                break;
            case ESTADO_C:
                estadoAtual = Estado.ESTADO_A;
                break;
            default:
                throw new IllegalStateException("Estado inválido: " + estadoAtual);
        }
    }
}