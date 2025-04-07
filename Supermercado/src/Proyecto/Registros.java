package Proyecto;

public class Registros
{

     private Nodo raiz;

     /**
      * @return the raiz
      */
     public Nodo getRaiz()
     {
          return raiz;
     }

     /**
      * @param raiz the raiz to set
      */
     public void setRaiz(Nodo raiz)
     {
          this.raiz = raiz;
     }

     public boolean insertar(Nodo nodo)
     {
          if (nodo == null)
          {
               System.out.println("No se pueden insertar nodos nulos");
               return false;
          }

          if (raiz == null)
          {
               raiz = nodo;
               raiz.setSiguiente(raiz);
               raiz.setAnterior(raiz);
               return true;
          }

          if (nodo.getEtiqueta().compareTo(raiz.getSiguiente().getEtiqueta()) < 0)
          {
               nodo.setSiguiente(raiz.getSiguiente());
               nodo.setAnterior(raiz);
               raiz.getSiguiente().setAnterior(nodo);
               raiz.setSiguiente(nodo);
               return true;
          }

          if (nodo.getEtiqueta().compareTo(raiz.getEtiqueta()) > 0)
          {
               nodo.setSiguiente(raiz.getSiguiente());
               nodo.setAnterior(raiz);
               raiz.getSiguiente().setAnterior(nodo);
               raiz.setSiguiente(nodo);
               raiz = nodo;
               return true;
          }

          Nodo aux = raiz.getSiguiente();
          while (aux != raiz)
          {
               if (nodo.getEtiqueta().compareTo(aux.getSiguiente().getEtiqueta()) < 0)
               {
                    nodo.setSiguiente(aux.getSiguiente());
                    nodo.setAnterior(aux);
                    aux.getSiguiente().setAnterior(nodo);
                    aux.setSiguiente(nodo);
                    return true;
               }
               aux = aux.getSiguiente();
          }
          return false;
     }

     public void eliminar(Nodo[] obj, String[] s, int nivel)
     {
          
     }

}
