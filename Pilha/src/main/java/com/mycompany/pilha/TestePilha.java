/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilha;

/**
 *
 * @author bruna
 */

public class TestePilha {
    public static void main(String[] args) {
        // Criando uma instância da pilha para armazenar números inteiros
        Pilha<Integer> pilhaInteiros = new Pilha<>();

        // Empilhando alguns números inteiros
        pilhaInteiros.push(1);
        pilhaInteiros.push(10);
        pilhaInteiros.push(15);
        pilhaInteiros.push(20);
        pilhaInteiros.push(25);
        pilhaInteiros.push(30);
        pilhaInteiros.push(35);
        pilhaInteiros.push(40);
        pilhaInteiros.push(45);
        pilhaInteiros.push(50);
        pilhaInteiros.push(55);
        pilhaInteiros.push(60);
        pilhaInteiros.push(100);
        
        // Desempilhando e exibindo os elementos
        System.out.println("Elementos desempilhados da pilha de inteiros:");
        while (!pilhaInteiros.isEmpty()) {
            System.out.println(pilhaInteiros.pop());
        }

        // Criando uma instância da pilha para armazenar strings
        Pilha<String> pilhaStrings = new Pilha<>();

        // Empilhando algumas strings
        pilhaStrings.push("A");
        pilhaStrings.push("inteligência");
        pilhaStrings.push("artificial");
        pilhaStrings.push("Dominará");
        pilhaStrings.push("o");
        pilhaStrings.push("mundo");

        // Desempilhando e exibindo os elementos
        System.out.println("\nElementos desempilhados da pilha de strings:");
        while (!pilhaStrings.isEmpty()) {
            System.out.println(pilhaStrings.pop());
        }
    }
}
