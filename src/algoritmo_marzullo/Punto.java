
package algoritmo_marzullo;

public class Punto {
    
    private String nombre;
    private int punto;
    private int tipo;

    public Punto(String nombre, int punto, int tipo) {
        this.nombre = nombre;
        this.punto = punto;
        this.tipo = tipo;
    }

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
