
package algoritmo_marzullo;

/*
* Esta clase representa el rango que estamos sincronizando
*/
public class Rango {
    
    /*
    * Esta clase tendrá tres atributos, el name que es
    * el nombre del rango, el inicio que será el punto de inicio
    * y el fin que es el punto de fin
    */
    private String name;
    private int inicio;
    private int fin;

    /*
    * Este constructor pasaremos los valores de los atributos
    */
    public Rango(String name, int inicio, int fin) {
        this.name = name;
        this.inicio = inicio;
        this.fin = fin;
    }
    
    /*
    * Aquí tendremos los métodos getter y setter de los atributos
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
    
}
