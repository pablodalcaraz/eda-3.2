/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author Pablo
 */
public class Pila {
    private int [] arreglo;
    private int tope;
    private int tamanio;

    public Pila( int tamanio) {
        this.arreglo = new int[tamanio];
        this.tope = -1;
        this.tamanio = tamanio;
    }

    public int getTope() {
        return tope;
    }

    public void setTope(int tope) {
        this.tope = tope;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    public void push(int elemento){             //Ingresar elementos en la pila    
        if (tope < tamanio - 1) {       //arreglo1.length = 5 / elemento 3   / tope = -1
            tope ++; 
            arreglo[tope] = elemento; 
        }else{
            System.out.println("La estructura está completa, no se puede insertar.");
        }
    }
    public void pop(){                          //hace que tope sea tope -1 
        if (!pilaVacia()) {
            tope--; 
        }
    }
    public boolean pilaVacia(){                
        return tope == -1; 
    }
    public boolean pilaLlena(){
        return tope == tamanio - 1; 
    }
    public int verElemento() {
    if (!pilaVacia()) {
        return arreglo[tope];
    } else {
        
        return -1; 
    }
}
    public void invierteSimple(Pila p1, Pila p2) {
        while(!p1.pilaVacia()) {
            p2.push(p1.verElemento());
            p1.pop();
        }
    }
    
    public void invierteEficiente(Pila p1,Pila p2){
        int aux;
        for (int i = 0; i <= p1.tope; i++) {
            aux = p1.verElemento();
            p1.pop();
            while((p1.tope-i) >= 0){
                p2.push(p1.verElemento());
                p1.pop();
            }
            p1.push(aux);
            while(!p2.pilaVacia()) {
                p1.push(p2.verElemento());
                p2.pop();
            }
        }
    }
     public void mostrarPila(Pila pila){
            for (int i = tope; i >= 0; i--) {
            System.out.println("[" + arreglo[i] + "]");
    }
    }
    public void pilaOrdenada(Pila pila) {
        Pila auxiliar = new Pila(tamanio);

        while (!pila.pilaVacia()) { //verifica, si la pila no está vacía entra en el bucle
            int elemento = verElemento();//guarda en la variable elemento el entero devuelto por el método=tope
            pila.pop();//descarta ultimo agregado y cambia tope
            while (!auxiliar.pilaVacia() && auxiliar.verElemento() < elemento) {//si la pila auxiliar no está vacia y el tope de auxiliar es menor que elemento
                pila.push(auxiliar.verElemento());
                auxiliar.pop();
            }
           
            auxiliar.push(elemento);//agrega elemento a la pila auxiliar
        }

        while (!auxiliar.pilaVacia()) {//verifica si la pila auxiliar no esta vacia
            pila.push(auxiliar.verElemento());//agrega a la pila original el tope de la pila auxiliar
            auxiliar.pop();//cambia el tope de la pila auxiliar
        }
    }
    public void pilaOrdenadaMayAMenor(Pila pila) {
        Pila auxiliar = new Pila(tamanio);

        while (!pila.pilaVacia()) { //verifica, si la pila no está vacía entra en el bucle
            int elemento = verElemento();//guarda en la variable elemento el entero devuelto por el método=tope
            pila.pop();//descarta ultimo agregado y cambia tope
            while (!auxiliar.pilaVacia() && auxiliar.verElemento() > elemento) {//si la pila auxiliar no está vacia y el tope de auxiliar es menor que elemento
                pila.push(auxiliar.verElemento());
                auxiliar.pop();
            }
           
            auxiliar.push(elemento);//agrega elemento a la pila auxiliar
        }

        while (!auxiliar.pilaVacia()) {//verifica si la pila auxiliar no esta vacia
            pila.push(auxiliar.verElemento());//agrega a la pila original el tope de la pila auxiliar
            auxiliar.pop();//cambia el tope de la pila auxiliar
        }
    }
   public Pila fusionarPilasOrdenadas(Pila pila1, Pila pila2){
       
        pila1.pilaOrdenadaMayAMenor(pila1);
        pila2.pilaOrdenadaMayAMenor(pila2);
        Pila pila3 = new Pila(pila1.getTamanio() + pila2.getTamanio());
        while (!pila1.pilaVacia() && !pila2.pilaVacia()) {
            
            if (pila1.verElemento() <= pila2.verElemento()) {
                pila3.push(pila1.verElemento()); 
                pila1.pop(); 
            } else {
                pila3.push(pila2.verElemento()); 
                pila2.pop(); 
            }
        }
  
       while(!pila1.pilaVacia()) {
           pila3.push(pila1.verElemento());
           pila1.pop();
       }
       while(!pila2.pilaVacia()) {
           pila3.push(pila2.verElemento());
           pila2.pop();
       }

     
        return pila3;
    }


}
