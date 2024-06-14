/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pilha;


/**
 *
 * @author bruna
 */

public class Pilha<T> {
    private Nodo<T> topo;
    private int tamanho;

    private static class Nodo<T> {
        T dado;
        Nodo<T> proximo;
        Nodo<T> anterior;

        Nodo(T dado) {
            this.dado = dado;
            this.proximo = null;
            this.anterior = null;
        }
    }

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }

    public void push(T elemento) {
        Nodo<T> novoNodo = new Nodo<>(elemento);
        if (isEmpty()) {
            topo = novoNodo;
        } else {
            novoNodo.proximo = topo;
            topo.anterior = novoNodo;
            topo = novoNodo;
        }
        tamanho++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        T elemento = topo.dado;
        topo = topo.proximo;
        if (topo != null) {
            topo.anterior = null;
        }
        tamanho--;
        return elemento;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia.");
        }
        return topo.dado;
    }
}
