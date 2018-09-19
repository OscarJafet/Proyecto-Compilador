/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lfp_practica1;

/**
 *
 * @author jes
 */
public class NodoDeListaDoble_1 {
 NodoDeListaDoble_1 Eanterior;
 NodoDeListaDoble_1 Siguiente;

  String Dato;
  int puesto;


    public NodoDeListaDoble_1(NodoDeListaDoble_1 Eanterior, NodoDeListaDoble_1 Siguiente, String Dato, int puesto) {
        this.Eanterior = Eanterior;
        this.Siguiente = Siguiente;
        this.Dato = Dato;
         this.puesto = puesto;
        
  
    }

    public NodoDeListaDoble_1(String Dato,int puesto) {
        this.Dato = Dato;
          this.puesto = puesto;

        this.Eanterior=null;
        this.Siguiente=null;
    }

     
    public NodoDeListaDoble_1 getEanterior() {
        return Eanterior;
    }

    public void setEanterior(NodoDeListaDoble_1 Eanterior) {
        this.Eanterior = Eanterior;
    }

    public NodoDeListaDoble_1 getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(NodoDeListaDoble_1 Siguiente) {
        this.Siguiente = Siguiente;
    }

    public String getDato() {
        return Dato;
    }

  
  
}
