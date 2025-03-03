package clases;

import java.util.ArrayList;
import java.util.List;

//clase Datacenter
public class Datacenter {
    private String nombre;
    private List<Servidor> servidores;


    public Datacenter(String nombre) {
        this.nombre = nombre;
        this.servidores = new ArrayList<>();
    }

    public void agregarServidor(Servidor servidor) {
        servidores.add(servidor);
    }

    public List<Servidor> getServidores() {
        return servidores;
    }
}
