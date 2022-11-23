
package algoritmo_marzullo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {
        Rango servidor1 = new Rango("1", 8, 9);
        Rango servidor2 = new Rango("2", 8, 12);
        Rango servidor3 = new Rango("3", 10, 12);
        List<Rango> rangos = new ArrayList<>();
        rangos.add(servidor1);
        rangos.add(servidor2);
        rangos.add(servidor3);
        Rango r = algoritmoMarzullo(rangos);
        System.out.println("Rango: ["+r.getInicio()+", "+r.getFin()+"]");
        System.out.println("Punto medio: "+(float)(r.getInicio() + r.getFin())/2);
    }
    
    public static Rango algoritmoMarzullo(List<Rango> rangos){
        Rango resultado = null;
        int mejor = 0;
        int cantidad = 0;
        int mejorInicio = 0;
        int mejorFin = 0;
        String nombre = "";
        
        List<Punto> puntos = new ArrayList<>();
        for(Rango rango : rangos){
            puntos.add(new Punto(rango.getName(), rango.getInicio(), -1));
            puntos.add(new Punto(rango.getName(), rango.getFin(), +1));
        }
        
        int i = 0;
        Collections.sort(puntos, new PuntoComparador());
        for(Punto p : puntos){
            cantidad = cantidad - p.getTipo();
            if(mejor < cantidad){
                mejor = cantidad;
                mejorInicio = p.getPunto();
                if(i < puntos.size() - 1){
                    mejorFin = puntos.get(i + 1).getPunto();
                }
            }
            i++;
        }
        resultado = new Rango(nombre, mejorInicio, mejorFin);
        return resultado;
    }
    
}
