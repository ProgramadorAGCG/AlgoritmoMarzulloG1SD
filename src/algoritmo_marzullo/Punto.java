
package algoritmo_marzullo;

/*
* Esta clase representa los puntos que conforman los rangos
* que sincronizaremos
*/

public class Punto {
    
    /*
    * Esta clase tendrá tres atributos, el nombre del punto
    * el punto que será el valor del punto y el tipo que
    * indica si el punto es de inicio y final
    */
    private String nombre;
    private int punto;
    private int tipo;
    
    /*
    * Este constructor pasaremos los valores de los atributos
    */
    public Punto(String nombre, int punto, int tipo) {
        this.nombre = nombre;
        this.punto = punto;
        this.tipo = tipo;
    }
    
    /*
    * Aquí tendremos los métodos getter y setter de los atributos
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPunto() {
        return punto;
    }

    public void setPunto(int punto) {
        this.punto = punto;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
