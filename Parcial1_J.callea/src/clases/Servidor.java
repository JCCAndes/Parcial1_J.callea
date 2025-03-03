package clases;

import java.util.HashMap;
import java.util.Map;

public class Servidor {
	
	private Map<String, MaquinaVirtual> mvs;
    private String identificador;
    private String descripcion;
    
    public Servidor(String identificador, String descripcion) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.mvs = new HashMap<>();
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void agregarMaquinaVirtual(MaquinaVirtual mv) {
        mvs.put(mv.getNombre(), mv);
    }

    public MaquinaVirtual getMaquinaVirtual(String nombre) {
        return mvs.get(nombre);
    }
}