/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eda3.pkg1;

import clases.Pila;

/**
 *
 * @author Pablo
 */
public class Eda31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Pila p1=new Pila(5);
//        System.out.println("La pila esta llena? "+p1.pilaLlena());
//        System.out.println("---Llenar pila---");
//        p1.push(1);
//        p1.push(2);
//        p1.push(3);
//        p1.push(4);
//        p1.push(5);
//        System.out.println("--Pila original--");
//        p1.mostrarPila(p1);
//        p1.pop();
//        p1.pop();
//        p1.pop();
//        p1.pop();
//        p1.pop();
//        System.out.println("El elemento en el tope tras pop es: "+p1.verElemento());
//        System.out.println("La pila esta vacia? "+p1.pilaVacia());
//        System.out.println("--------------------------------------------");
//        
//        //Ejercicio 2
//        
//        System.out.println("---reinicio llenado de pila---");
//        p1.push(1);
//        p1.push(2);
//        p1.push(3);
//        p1.push(4);
//        p1.push(5);
//        
//        System.out.println("---Pila original---");
//        p1.mostrarPila(p1);
//        
//        System.out.println("---Invertir simple---");
//        p1.mostrarPila(p1);
//        
//         System.out.println("---reinicio llenado de pila---");
//         Pila p2=new Pila(4);
//         p2.push(6);
//         p2.push(7);
//         p2.push(8);
//         p2.push(9);
//         
//         System.out.println("---Pila original---");
//         p2.mostrarPila(p1);
//        
//        System.out.println("---invertir eficiente");
//        p2.invierteEficiente();
//        p2.mostrarPila(p1);
        
//        
        Pila pila1 = new Pila(5);
        Pila pila2 = new Pila(5);

        System.out.println("Pila 1:");
        pila1.push(10);
        pila1.push(7);
        pila1.push(4);
        pila1.push(13);
        pila1.push(8);

       pila1.pilaOrdenadaMayAMenor(pila1);
       pila1.mostrarPila(pila1);
        
        
        
        System.out.println("Pila 2:");
        pila2.push(5);
        pila2.push(12);
        pila2.push(6);
        pila2.push(1);
        pila2.push(3);

       
        
        pila2.pilaOrdenadaMayAMenor(pila2);
        pila2.mostrarPila(pila2);


       Pila pila3= pila1.fusionarPilasOrdenadas(pila1, pila2);
        Pila pila4= new Pila(pila3.getTamanio());
        System.out.println("---Super pila---");
        pila3.invierteEficiente(pila1, pila2);
        pila3.invierteEficiente(pila3, pila4);
        pila3.mostrarPila(pila3);
        
    }
        
       
    
}
