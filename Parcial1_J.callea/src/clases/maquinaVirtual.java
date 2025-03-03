package clases;

import java.util.ArrayList;
import java.util.Map;

public class maquinaVirtual {
    private String nombre;
    private Servidor host;
    private double tamMemoria;
    private double tamDisco;
    private List<Servicio> servicios;

    public maquinaVirtual(String nombre, double tamMemoria, double tamDisco) {
        this.nombre = nombre;
        this.tamMemoria = tamMemoria;
        this.tamDisco = tamDisco;
        this.servicios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setHost(Servidor host) {
        this.host = host;
    }

    public double getTamMemoria() {
        return tamMemoria;
    }

    public double getTamDisco() {
        return tamDisco;
    }

    public void desplegarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public void deseleccionarServicio(Servicio servicio) {
        servicios.remove(servicio);
    }

    public List<Servicio> getTodosLosServicios() {
        return servicios;
    }
}
