/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fila;

/**
 *
 * @author bruna
 */

public class TesteFila {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        System.out.println("Elemento na frente da fila: " + fila.peek());

        while (!fila.isEmpty()) {
            System.out.println("Removido: " + fila.dequeue());
        }
    }
}