
package algoritmo_marzullo;

import java.util.Comparator;

public class PuntoComparador implements Comparator<Punto>{

    public PuntoComparador(){    
    }
    
    @Override
    public int compare(Punto o1, Punto o2) {
        return o1.getPunto() - o2.getPunto();
    }
    
}
