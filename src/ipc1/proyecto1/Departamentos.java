package ipc1.proyecto1;

/**
 *
 * @author wilar
 */
public class Departamentos {
    private String codigoreg;
    private String region;
    private String nombre;

    public Departamentos(String codigoreg, String Region, String nombre) {
        this.codigoreg = codigoreg;
        this.region = Region;
        this.nombre = nombre;
    }

    public String getCodigoreg() {
        return codigoreg;
    }

    public void setCodigoreg(String codigoreg) {
        this.codigoreg = codigoreg;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
