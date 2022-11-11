/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaligada;

/**
 *
 * @author Noena
 */
  public class ListaLigada <T>{

    private Nodo head; //Apuntador a la cabecera de la lista(Primer Nodo)
    private Nodo tail; //Apuntador a la cola de la lista(Ultimo Nodo)
    private Nodo actual; //Tamaño de la lista(Núnero de nodos en la lista)
    private int size; //Tamaño de la lista(Núnero de nodos en la lista)

    public ListaLigada(){
        this.head = null;
        this.actual = null;
        this.tail = null;
        this.size = 0;
    }

    /* public void  addFirts(int dato){
        Nodo nodo = new Nodo(dato);
        this.head = nodo;
        this.tail = nodo;
        this.actual=nodo;
        this.size++;
    }
     */
    public void add(T dato) {
        Nodo nuevoNodo = new Nodo(dato);
        this.size++;
        this.tail = nuevoNodo;//se mueve el apuntador al ultimo nodo

        if (head == null) {
            head = nuevoNodo;
            actual = head;
        } else {
            actual.setSiguiente(nuevoNodo);//actual.sig apunta al nuevoNodo (enlace entre nodos) 
            actual = nuevoNodo;//ahora actual es el nuevoNodo
        }
    }
    
    public  void add (T dato, int posicion){
    Nodo nuevoNodo = new Nodo(dato);
    int i = 1;
    actual = head;
    while(i < posicion - 1){
        actual = actual.getSiguiente();
        i++;
    }
    Nodo auxiliar = actual.getSiguiente();
    actual.setSiguiente(nuevoNodo);
    actual = nuevoNodo;
    actual.setSiguiente(auxiliar);
    }

    public void printList() {
        int posicion = 1;
        actual = head;
        while (actual != null) {
            T elemento =(T)actual.getDato();
            System.out.println("Dato = " + elemento + " almacenado en nodo: " + posicion);
            actual = actual.getSiguiente();
            posicion++;
        }
    }
    public T borrarInicio(){
         T elemento = (T) head.getDato();
         if(head==tail){
         head = null; 
         tail = null;
      }
         else{
          head = head.getSiguiente();
      }
      return  elemento;
   }
    }  

