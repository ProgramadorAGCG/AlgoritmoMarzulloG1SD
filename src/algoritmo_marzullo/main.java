
package algoritmo_marzullo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {

    public static void main(String[] args) {
        
        /*
        * Establecemos los rangos a sincronizar
        */
        Rango servidor1 = new Rango("1", 8, 12);
        Rango servidor2 = new Rango("2", 11, 13);
        Rango servidor3 = new Rango("3", 10, 12);
        
        /*
        * Guardaremos estos rangos en una lista
        * y los añadimos a esta lis los rangos creados
        */
        List<Rango> rangos = new ArrayList<>();
        rangos.add(servidor1);
        rangos.add(servidor2);
        rangos.add(servidor3);
        
        /*
        * El método algoritmoMarzullo nos devolverá el rango optimo
        * para sincronizar los rangos establecidos y lo guardaremos
        * en el objeto r. Para este método debemos de pasarle como
        * parámetro la lista de rangos establecidos
        */
        Rango r = algoritmoMarzullo(rangos);
        
        /*
        * Imprimiremos el rango optimo y el punto medio de este rango
        */
        System.out.println("Rango: ["+r.getInicio()+", "+r.getFin()+"]");
        System.out.println("Punto medio: "+(float)(r.getInicio() + r.getFin())/2);
    }
    
    /*
    * Este método devolverá el rango óptimo de los rangos que establecemos
    * en el parámetro
    */
    public static Rango algoritmoMarzullo(List<Rango> rangos){
        
        /*
        * Resultado es el rango que retornará y que será optimo para todos los rangos
        * mejor es la variable que servirá de indicador cuando encontramos el rango optimo
        * cantidad indica los puntos de inicio y de final que ha recorrido
        * mejorInicio guarda el punto de inicio optimo para el rango a devolver
        * mejorFin guarda el punto de final optimo para el rango a devolver
        */
        Rango resultado = null;
        int mejor = 0;
        int cantidad = 0;
        int mejorInicio = 0;
        int mejorFin = 0;
        String nombre = "";
        
        /*
        * Crearemos una lista de puntos donde guardaremos los puntos
        * de inicio y de fin de los rangos paasados como parámetro de
        * este método, recordemos que -1 indica que el punto es de inicio
        * y +1 indica que el punto es de fin
        */
        List<Punto> puntos = new ArrayList<>();
        for(Rango rango : rangos){
            puntos.add(new Punto(rango.getName(), rango.getInicio(), -1));
            puntos.add(new Punto(rango.getName(), rango.getFin(), +1));
        }
        
        /*
        * El indice i lo usaremos para deolver el punto final
        * Collections.sort permitirá ordenar todos los puntos
        */
        int i = 0;
        Collections.sort(puntos, new PuntoComparador());
        
        /*
        * Recorreremos todos los puntos y la cantidad lo sumaremos con los tipos de los puntos
        * Luego comparamos si la variable mejor es menor a la cantidad, de tal manera que le asignamos
        * a la variable mejor dicha cantidad para saber si dicho rango de inicio es optimo.
        * Luego comparamos si el indica i es menor al tamaño de los puntos, ya que si fuera igual,
        * entonces quiere decir que ya recorrió todos los puntos. Finalmente, si se sa la condicion
        * entonces el punto mejorFin valdrá el punto final y de esta manera obtendremos los rangos
        */
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
