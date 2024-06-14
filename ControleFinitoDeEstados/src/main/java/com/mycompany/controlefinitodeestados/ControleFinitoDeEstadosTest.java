/*
   Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.controlefinitodeestados;

/**
 *
 * @author bruna
 */



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControleFinitoDeEstadosTest {
    
    @Test
    public void testTransicao() {
        ControleFinitoDeEstados controle = new ControleFinitoDeEstados(ControleFinitoDeEstados.Estado.ESTADO_A);
        assertEquals(ControleFinitoDeEstados.Estado.ESTADO_B, controle.getEstadoAtual());
        controle.transicao();
        assertEquals(ControleFinitoDeEstados.Estado.ESTADO_C, controle.getEstadoAtual());
        controle.transicao();
        assertEquals(ControleFinitoDeEstados.Estado.ESTADO_A, controle.getEstadoAtual());
    }
}