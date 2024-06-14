/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fila;

/**
 *
 * @author bruna
 */

import java.util.LinkedList;

public class Fila<T> {
    private LinkedList<T> elementos;

    public Fila() {
        this.elementos = new LinkedList<>();
    }

    public void enqueue(T elemento) {
        elementos.addLast(elemento);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        return elementos.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A fila está vazia");
        }
        return elementos.getFirst();
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }
}