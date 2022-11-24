
package algoritmo_marzullo;

import java.util.Comparator;

/*
* Esta clase permite comparar dos objetos según el atributo
*/
public class PuntoComparador implements Comparator<Punto>{

    public PuntoComparador(){    
    }
    
    /*
    * Compara dos objetos para especificar el orden
    */
    @Override
    public int compare(Punto o1, Punto o2) {
        return o1.getPunto() - o2.getPunto();
    }
    
}
