
package algoritmo_marzullo;

public class Rango {
    
    private String name;
    private int inicio;
    private int fin;

    public Rango(String name, int inicio, int fin) {
        this.name = name;
        this.inicio = inicio;
        this.fin = fin;
    }

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
