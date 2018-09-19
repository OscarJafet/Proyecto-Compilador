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
public class ListaDoble_1 {
 NodoDeListaDoble_1 primernodo, Ultimonodo, recorrer;
    void inicializar(){
        this.Ultimonodo=this.primernodo=null;
    }
    
    boolean vacia(){
        return(this.primernodo==null);
    }
    
    void insertarAlInicioCadena(String dato,int puesto){
        if(vacia()){
            this.Ultimonodo=this.primernodo= new NodoDeListaDoble_1(dato, puesto);
        }else{
                  NodoDeListaDoble_1 aux= new NodoDeListaDoble_1(null, this.primernodo, dato,puesto);
                  this.primernodo.setEanterior(aux);
                  this.primernodo=aux;
        }
    }
    void InsertarAlfinal(String dato, int puesto){
        if(vacia()){
            this.Ultimonodo=this.primernodo=new NodoDeListaDoble_1(dato, puesto);
        }else{
          this.Ultimonodo.setSiguiente(new NodoDeListaDoble_1(Ultimonodo,null, dato, puesto));
           this.Ultimonodo=this.Ultimonodo.getSiguiente();
            
       }
    }
    //los implemente yo
  void eliminarPrimero(){ 
    if(vacia()){
        System.out.println("esta vacia"); 
    }else if(this.primernodo==this.Ultimonodo){
       this.Ultimonodo=this.primernodo=null; 
    }else{
       
        NodoDeListaDoble_1 aux=this.primernodo.getSiguiente();
        this.primernodo.setSiguiente(null);
        this.primernodo=aux;
        aux.setEanterior(null);
        aux=null;
       
       }
    }
  //los implemente yo
 private NodoDeListaDoble imprimirInicioFin(NodoDeListaDoble_1 aux){
       if(vacia()){
         System.out.println("no se tiene ninguna lista");
         return null;
           }else if(aux!=null){
             System.out.print(aux.Dato+"-->");
             return imprimirInicioFin(aux=aux.Siguiente);
           }else
             return null;
          }
 //los implemente yo
 void imPrUl(){
     imprimirInicioFin(this.primernodo);
 }
 //los implemente yo
private  NodoDeListaDoble imprimirFinInicio(NodoDeListaDoble_1 aux){
       if(vacia()){
         System.out.println("no se tiene ninguna lista");
         return null;
           }else if(aux!=null){
             System.out.print(aux.Dato+"-->");
             return imprimirFinInicio(aux=aux.Eanterior);
           }else
             return null;
          }
//los implemente yo
void imUlPr(){
    imprimirFinInicio(this.Ultimonodo);
}
   void eliminarUltimo(){ 
    if(vacia()){
        System.out.println("esta vacia"); 
    }else if(this.primernodo==this.Ultimonodo){
       this.Ultimonodo=this.primernodo=null; 
    }else{
        NodoDeListaDoble_1 aux=this.Ultimonodo.getEanterior();
        this.Ultimonodo.setEanterior(null);
        this.Ultimonodo=aux;
        this.Ultimonodo.setSiguiente(null);
        
       }
    }

    void eliminarTodo() {
       inicializar();
    }
    //los implemente yo
    int ObtenerTamaño(){
        if(vacia()){
            System.out.println("no existe una lista");
    }else{
    NodoDeListaDoble_1 contador;
        int numero=0;
            for(contador=primernodo; contador!=null;contador=contador.Siguiente){
             numero++;
           }
           return numero;
        }
        return 0;
      }
    //los implemente yo
    void ObtenerIndice(int indice){
        if(vacia()){
            System.out.println("lista vacia");
        }else{
        NodoDeListaDoble_1 Nodoindice;
         int i;
        for (Nodoindice=primernodo ,   i=0 ; (i<indice)&& (Nodoindice!=null);  i++, Nodoindice=Nodoindice.Siguiente);
        if(Nodoindice!=null)
                System.out.println("el nodo indice tiene un valor de {"+Nodoindice.Dato+"}");
        else
                System.out.println("el nodo no se encuentra en la lista");
        }
    }
    //los implemente yo
        void EliminarIndice(int indice){
        if(vacia()){
            System.out.println("nodo vacio");        
         }else if(indice==0){
              System.out.println("el indice eliminado contenia el dato="+primernodo.Dato);
         eliminarPrimero();
         
           
         }else{
             NodoDeListaDoble_1 Nodoindice,Nodoelimina;
                int i;
                for (Nodoindice=primernodo.Siguiente ,Nodoelimina=primernodo,   i=0; i<(indice)&& (Nodoindice!=null);  i++, Nodoindice=Nodoindice.Siguiente, Nodoelimina=Nodoelimina.Siguiente);
                    if(Nodoindice!=null){
                         System.out.println("nodo eliminado con el valor = "+Nodoindice.Dato);
                         Nodoelimina.Siguiente=Nodoindice.Siguiente;
                     Nodoelimina.Siguiente.Eanterior=Nodoelimina;
                     
                     }else{
                         System.out.println("Nodo no encontrado");
                     }
       }
    }
//        los implemente yo
 String BuscarValor(int valor){
        if(vacia()){
            System.out.println("vacia");
        }else{
        NodoDeListaDoble_1 Nodoindice;
         int i=0;
        for (Nodoindice = primernodo ,   i=0 ; (Nodoindice.puesto!=valor)&& (Nodoindice!=null);  i++, Nodoindice=Nodoindice.Siguiente);
        if(Nodoindice!=null)
                return Nodoindice.Dato;
        else
               return null;
        }
        return null;
    }
// //los implemente yo
//  void EliminarValor(int valor){
//        if(vacia()){
//            System.out.println("nodo vacio");        
//         }else if(primernodo.Dato==valor){
//         eliminarPrimero();
//            System.out.println("el nodo primer nodo fue eliminado");
//         }else if(Ultimonodo.Dato==valor){
//         eliminarUltimo();
//            System.out.println("el nodo eliminado fue el ultimo");
//         }else{
//             NodoDeListaDoble Nodoindice,Nodoelimina;
//                int i;
//                for (Nodoindice=primernodo.Siguiente ,Nodoelimina=primernodo,   i=0; (Nodoindice.Dato==valor)&& (Nodoindice!=null);  i++, Nodoindice=Nodoindice.Siguiente, Nodoelimina=Nodoelimina.Siguiente);
//                            if(Nodoindice!=null){
//                                    System.out.println("el nodo eliminado fue = "+i);
//                                    Nodoelimina.Siguiente=Nodoindice.Siguiente;
//                                    Nodoelimina.Siguiente.Eanterior=Nodoelimina;
//                            }else{
//                                    System.out.println("Nodo se encuentra el dato");
//                     }
//                }
//           }
  //los implemente yo
  void imprimirInicioFinal(){
  if(vacia()){
      System.out.println("lista vacia");
     }else{
      for (NodoDeListaDoble_1 i = primernodo; i !=null ; i=i.Siguiente) {
          System.out.println(i.getDato());
      }
     }
  }
}
